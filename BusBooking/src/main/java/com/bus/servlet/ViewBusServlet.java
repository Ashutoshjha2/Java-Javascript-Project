package com.bus.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bus.dao.ViewBusDao;
import com.bus.entity.BusDetails;

@WebServlet(name = "ViewBusServlet", urlPatterns = { "/busview" })
public class ViewBusServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		Cookie c[] = request.getCookies();
		if (c == null) {
			pw.println("LOGIN FIRST..!!");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);
		} else {

			String fname = c[0].getValue();
			pw.println("WELCOME TO ADMIN " + fname);
			RequestDispatcher rd = request.getRequestDispatcher("admin-dashboard.html");
			rd.include(request, response);

			ArrayList<BusDetails> busdetails = new ViewBusDao().getBuses();
			if (busdetails.size() == 0) {
				pw.println("SORRY NO BUS AVAILABLE...!!");
			} else {
				pw.println("<html><body>");
				pw.println("<head>");
				pw.println("&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<<<<<<<<<<<<<<<<<<<<< ALL BUSES >>>>>>>>>>>>>>>>>>>>>>>>");
				pw.println("<table border=1 width=50% height=50%>");
				pw.println(
						"<tr><th>Bus-No</th><th>Bus-Name</th><th>Arr-Time</th><th>Dept-Time</th><th>FromStation</th><th>Destination</th><th>Seat</th><th>Price</th><th>Action</th><tr>");

				for (BusDetails busDetails2 : busdetails) {

					pw.println("<tr><td>" + busDetails2.getBus_no() + "</td><td>" + busDetails2.getBus_name()
							+ "</td><td>" + busDetails2.getArrTime() + "</td>" + "<td>" + busDetails2.getDepTime()
							+ "</td><td>" + busDetails2.getFstation() + "</td>" + "<td>" + busDetails2.getToStation()
							+ "</td>" + "<td>" + busDetails2.getSeat() + "</td>" + "<td>" + busDetails2.getPrice()
							+ "</td><td>" + "<a href='edit'  >" + " EDIT</a>" + "</td></tr>");
				}
				pw.println("</head>");
				pw.println("</table>");
				pw.println("</html></body>");
			}
		}
	}

}
