package com.hospital.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	@RequestMapping("/appointment")
	public String appointment()
	{
		return "appointments";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session)
	{
		session.removeAttribute("current_user");
		return "redirect:/home";
	}
	
	

}
