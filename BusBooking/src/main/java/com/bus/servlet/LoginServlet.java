package com.bus.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet" ,urlPatterns = {"/log"})
public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String login = request.getParameter("login");

		this.getServletContext().setAttribute("login", login);
		if (login.equals("AdminLogin")) {
			
			RequestDispatcher rd = request.getRequestDispatcher("adminlogin.html");
			rd.forward(request, response);
		}else if(login.equals("UserLogin")){
			RequestDispatcher rd = request.getRequestDispatcher("userlogin.html");
			rd.forward(request, response);
			
		}
	}

}
