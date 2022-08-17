package com.bus.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bus.dao.AddBusDao;
import com.bus.entity.BusDetails;

@WebServlet(name = "AddBusServlet" ,urlPatterns = {"/addbus"})
public class AddBusServlet extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		Random rn =new Random();
		
		int bus_no = rn.nextInt(9999);
	    String  bus_name = request.getParameter("busname");
	    String  depTime = request.getParameter("depttime");
	    String arrTime = request.getParameter("arrivetime");
	    String toStation = request.getParameter("tostation");
	    String fstation = request.getParameter("fromstation");
	    int seat= Integer.parseInt(request.getParameter("seatno"));
	    int price = Integer.parseInt(request.getParameter("price")); ;
	    
	    BusDetails bus = new BusDetails(bus_no, bus_name, depTime, arrTime, toStation, fstation, seat, price);
	    
		int k = AddBusDao.insertBus(bus);
		
		if(k>0) {
			Cookie c[] = request.getCookies();
			String fname = c[0].getValue();
			out.println("WELCOME TO ADMIN " + fname);
			RequestDispatcher rd = request.getRequestDispatcher("admin-dashboard.html");
			rd.include(request, response);
			out.println("<h2> Bus Added Successfully  </h2>");
		}
		else {
			out.println("<h2> Somthing Went Wrong  </h2>");
			RequestDispatcher rd = request.getRequestDispatcher("AddBus.html");
			rd.include(request,response);
			
		}
	    
	    
	}
}
