package com.bus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class LoginDao {
	public String fname;
	
	public String Login(HttpServletRequest request,ServletContext sct) {
		
		try {
			Connection con = ConnectionProvider.getConnection();
			String login = (String)sct.getAttribute("login");
			
			if (login.equals("AdminLogin")) {
				String sql="select * from admin where userName=? and pwd=?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1,request.getParameter("uname"));
				ps.setString(2, request.getParameter("pwd"));
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					fname = rs.getString(5);
				}
			}else if(login.equals("UserLogin")){
				String sql="select * from user where userName=? and pwd=?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1,request.getParameter("uname"));
				ps.setString(2, request.getParameter("pwd"));
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					fname = rs.getString(5);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		sct.removeAttribute("login");
		return fname;
	}

}
