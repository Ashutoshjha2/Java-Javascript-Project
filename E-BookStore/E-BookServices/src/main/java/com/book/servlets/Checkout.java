package com.book.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.book.entity.OrderProduct;
import com.book.helper.FactoryProvider;

@WebServlet(name = "Checkout", urlPatterns = { "/payment" })
public class Checkout extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		//Book Details
		int id = Integer.parseInt(req.getParameter("id"));
		String bname = req.getParameter("bname");
		String bprice = req.getParameter("bprice");
		String bauthor = req.getParameter("bauthor");
		long bpage = Long.parseLong(req.getParameter("bpage"));
		//User Details
		
		String uname = req.getParameter("uname");
		long mobile = Long.parseLong(req.getParameter("umobile"));
		String shipname = req.getParameter("ushipping");
		long alternumber = Long.parseLong(req.getParameter("altermobile"));
		String shipaddress = req.getParameter("shipaddress");
		String email = req.getParameter("email");
		String landmark = req.getParameter("landmark");
		String location = req.getParameter("location");
		Random r = new Random();
		int orderid = r.nextInt(100000);
		OrderProduct op = new OrderProduct(id, bname, bprice, bauthor, bpage, uname, mobile, shipname, alternumber, shipaddress, email,landmark, location, orderid);
		Session hibernateSession= FactoryProvider.getFactory().openSession();
		  Transaction tx =	hibernateSession.beginTransaction();
	       hibernateSession.save(op);
	       tx.commit();
	       hibernateSession.close();
	       HttpSession httpSession = req.getSession();
	       httpSession.setAttribute("msg", "Your Order Successfully Placed..!");
	       resp.sendRedirect("orderplaced.jsp");
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
