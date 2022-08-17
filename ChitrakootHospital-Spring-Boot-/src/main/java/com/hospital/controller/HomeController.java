package com.hospital.controller;

import java.io.File;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospital.dao.AdmitDao;
import com.hospital.dao.AmbulenceDao;
import com.hospital.dao.AppointmentDao;
import com.hospital.dao.RegisterDao;
import com.hospital.dao.StaffDao;
import com.hospital.entity.AdmitPatient;
import com.hospital.entity.AmbulenceBooking;
import com.hospital.entity.Appointment;
import com.hospital.entity.RegisterPatient;
import com.hospital.entity.Staff;
import com.hospital.services.SendMail;

@Controller
public class HomeController {
	@Autowired
	private StaffDao staffdao;

	@RequestMapping("/home")
	public String home() {
		System.out.println("This Is home page");
		
		/*
		 * Staff s = new Staff("vivek", "vivekckt1997@gmail.com", "9565435247",
		 * "chitrakoot", "yash", "admin", "admin"); this.staffdao.save(s);
		 */
		 
		return "home";
	}

	@RequestMapping("/contact")
	public String contact() {
		System.out.println("This Is contact page");

		return "contact";
	}

	@RequestMapping("/service")
	public String service() {
		System.out.println("This Is service page");

		return "services";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("This Is about page");

		return "about";
	}
	
@RequestMapping("/voicecall")
public String voicecall()
{
return "voicecall";	
}
	@RequestMapping("/login")
	public String login() {
		System.out.println("This Is login page");

		return "login";
	}
	@Autowired
private SendMail sendmail;
	
	@RequestMapping("/forgot")
	public String forgotpassword() {
		System.out.println("This Is forgot password page");
		
		return "forgotpassword";
	}

	@RequestMapping("/forgotpassword")
	public String forgotpassword(HttpServletRequest req,HttpSession session) {
		System.out.println("This Is change password page");
		String email = req.getParameter("email");
		Random r = new Random();
		int otp1 = r.nextInt(999999);
		String otp = String.valueOf(otp1);
//Start
  this.sendmail.sendemail(email, "Your OTP Is - : "+otp, "OTP For Forgot Password");
  session.setAttribute("msg", "OTP Send Your Register Email Id ");
		// End
		return "changepassword";
	}

	@RequestMapping(path = "changepassword", method = RequestMethod.POST)
	public String changepassword(HttpSession session) {
		System.out.println("Password Change Successfully...");
		session.setAttribute("msg", "Password Change Successfully !!");
		return "login";
	}

	@RequestMapping("/doctordashboard")
	public String doctordashboard() {
		System.out.println("This Is doctor page");

		return "doctordashboard";
	}

	@Autowired
	private AppointmentDao appointmentdao;
	
	
	@Autowired
	private AmbulenceDao ambulencedao;
	@Autowired
	private AdmitDao admitdao;
	@RequestMapping("/admindashboard")
	public String admindashboard(HttpSession session) {
		System.out.println("This Is admin page");
		List<Appointment> appointment = this.appointmentdao.findAll();
		session.setAttribute("appointment", appointment);
		//ambulence
		List<AmbulenceBooking> ambulence = this.ambulencedao.findAll();
		session.setAttribute("ambulence", ambulence);
		List<RegisterPatient> patient = this.registerdao.findAll();
		session.setAttribute("patient", patient);
		List<AdmitPatient> admitpatient = this.admitdao.findAll();
		session.setAttribute("admitpatient", admitpatient);
		return "admindashboard";
	}

	@Autowired
	private RegisterDao registerdao;
	@RequestMapping("/receptiondashboard")
	public String receptiondashboard(HttpSession session) {
		System.out.println("This Is reception page");
		List<RegisterPatient> patient = this.registerdao.findAll();
		session.setAttribute("patient", patient);
		return "receptiondashboard";
	}
}
