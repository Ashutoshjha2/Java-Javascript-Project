package com.bus.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LogoutServlet", urlPatterns = {"/logout"})
public class LogoutServlet extends HttpServlet{

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		Cookie c [] = request.getCookies();
		if (c==null) {
			pw.println("PLEASE LOGIN FIRST");
		}
		else {
			c[0].setValue(" ");
			c[0].setMaxAge(0);
			pw.println("LOGOUT SUCCESSFULLY....!!");
		}
		RequestDispatcher rd= request.getRequestDispatcher("index.html");
		rd.include(request, response);
	}
}
