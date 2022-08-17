package com.hospital.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

@Controller
public class LoginController {
	
	@Autowired
	private StaffDao staffDao;
   
	@Autowired
	private RegisterDao registerdao;
	
	@Autowired
	private AppointmentDao appointmentdao;
	
	@Autowired
	private AmbulenceDao ambulencedao;
	
	@Autowired
	private AdmitDao admitdao;
	@RequestMapping(path = "dashboard" ,method = RequestMethod.POST)
	public String  logon(@RequestParam String email,@RequestParam String password,HttpServletResponse res,HttpSession session)
	{
		System.out.println("Welcome Login Process Started...");
		Staff staff = this.staffDao.findByEmailAndPassword(email, password);
		if (staff== null) {
			session.setAttribute("msg", "Invalid Details !! Try with another one");
			return "/login";
			
		}else {
			session.setAttribute("current_user", staff);
			if (staff.getAdminstatus().equals("admin")) {
				session.setAttribute("username", staff.getStaffusername());
				System.out.println("this is admin panel");
				List<RegisterPatient> patient = this.registerdao.findAll();
				session.setAttribute("patient", patient);
				List<Appointment> appointment = this.appointmentdao.findAll();
				session.setAttribute("appointment", appointment);
				//ambulence
				List<AmbulenceBooking> ambulence = this.ambulencedao.findAll();
				session.setAttribute("ambulence", ambulence);
				//admit patient
				List<AdmitPatient> admitpatient = this.admitdao.findAll();
				session.setAttribute("admitpatient", admitpatient);
				return "admindashboard";
				
			}else if (staff.getStaffstatus().equals("doctor")) {
				session.setAttribute("username", staff.getStaffusername());
				System.out.println("this is doctor panel");
				return "doctordashboard";
				
			}
			else {
				session.setAttribute("username", staff.getStaffusername());
				System.out.println("this is reception panel");
				/*
				 * List<RegisterPatient> patients = this.registerdao.patients();
				 * 
				 */
				List<RegisterPatient> patient = this.registerdao.findAll();
				session.setAttribute("patient", patient);
				return "receptiondashboard";
			}
		}
		
	}
}
