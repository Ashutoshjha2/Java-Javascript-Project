package com.book.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.book.entity.Registration;
import com.book.helper.FactoryProvider;

@WebServlet(name = "RegisterWithId",urlPatterns = {"/register"})
public class RegisterWithId extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		try {
			resp.setContentType("text/html");
			PrintWriter pw = resp.getWriter();
			String uname = req.getParameter("uname");
		   long mobile = Long.parseLong(req.getParameter("mobile"));
		   String address = req.getParameter("address");
		   String email = req.getParameter("email");
		   String pass = req.getParameter("password");
		   String cust = req.getParameter("custuser");
			Registration registrationWithId = new Registration( uname, mobile, address,email,pass,"notadmin", cust);
			Session hibernateSession= FactoryProvider.getFactory().openSession();
		  Transaction tx =	hibernateSession.beginTransaction();
	       hibernateSession.save(registrationWithId);
	       tx.commit();
	       hibernateSession.close();
	       HttpSession httpSession = req.getSession();
	       httpSession.setAttribute("msg", "Registration Successful");
	       resp.sendRedirect("register.jsp");
		}catch (Exception e) {
			e.printStackTrace();
		}
	
		
		
	}

	
}
