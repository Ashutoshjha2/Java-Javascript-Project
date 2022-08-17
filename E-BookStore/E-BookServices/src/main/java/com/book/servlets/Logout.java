package com.book.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Logout" ,urlPatterns = {"/Logout"})
public class Logout extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			resp.setContentType("text/html");
			HttpSession session = req.getSession();
			session.removeAttribute("current_user");
			resp.sendRedirect("index.jsp");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
