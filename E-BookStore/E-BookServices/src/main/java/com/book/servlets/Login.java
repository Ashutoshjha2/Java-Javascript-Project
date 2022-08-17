package com.book.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.book.entity.Registration;
import com.book.helper.FactoryProvider;

@WebServlet(name = "Login", urlPatterns = { "/login" })
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			resp.setContentType("text/html");
			PrintWriter pw = resp.getWriter();

			String email = req.getParameter("email");
			String pass = req.getParameter("password");
			System.out.println(email);
		System.out.println(pass);
			// System.out.println(mobile);
			// authentication user
			// this one entity insert record
			Session openSession = FactoryProvider.getFactory().openSession();

			String query = "from  Registration where email =: e and pass =: p";
			Query q = openSession.createQuery(query);
			q.setParameter("e", email);
			q.setParameter("p", pass);
			Registration loginwithid = (Registration) q.uniqueResult();

			openSession.close();
			System.out.println(loginwithid);
			if(loginwithid ==null)
			{
				HttpSession session = req.getSession();
				session.setAttribute("msg", "Invalid Details !! Try with another one");
				resp.sendRedirect("login.jsp");
				return;
			}
			else {
				HttpSession session = req.getSession();
	        	session.setAttribute("current_user", loginwithid);
				if(loginwithid.getAdminstatus().equals("admin"))
				{
					HttpSession session2 = req.getSession();
		        	session2.setAttribute("username", loginwithid.getUname());
					System.out.println("this is admin panel");
					resp.sendRedirect("adminpanel.jsp");
				}
				else if (loginwithid.getCuststatus().equals("author")) {
					HttpSession session2 = req.getSession();
		        	session2.setAttribute("username", loginwithid.getUname());
					resp.sendRedirect("authorpanel.jsp");
				}
				else {
					HttpSession session2 = req.getSession();
		        	session2.setAttribute("username", loginwithid.getUname());
					System.out.println("this is not author");
					resp.sendRedirect("index.jsp");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
