package com.bus.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bus.dao.LoginDao;

@WebServlet(name = "UserLoginServlet" ,urlPatterns = {"/user"})
public class UserLoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw  = response.getWriter();
		response.setContentType("text/html");
		ServletContext context = this.getServletContext();
		String fname = new LoginDao().Login(request, context);
		if (fname == null) {
			pw.println("INVALID USERNAME AND PASSWORD...!!");
			RequestDispatcher rd = request.getRequestDispatcher("userlogin.html");
			rd.include(request, response);
		}else {
			Cookie ck = new Cookie("firstname", fname);
			pw.println("WELCOME USER :- " + fname);
			response.addCookie(ck);
			RequestDispatcher rd = request.getRequestDispatcher("user-dashboard.html");
			rd.include(request, response);
		}
	}
}
