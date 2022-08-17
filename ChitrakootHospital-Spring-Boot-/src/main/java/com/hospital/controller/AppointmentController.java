package com.hospital.controller;

import java.util.Date;
import java.util.Optional;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hospital.dao.AppointmentDao;
import com.hospital.entity.Appointment;
import com.hospital.services.SendMail;

@Controller
public class AppointmentController {

	@Autowired
	private AppointmentDao appointmentdao;

	@Autowired
	private SendMail sendmail;
	@RequestMapping(value = "/appointment", method = RequestMethod.POST)
	public String bookappointment(@ModelAttribute Appointment appointment,HttpSession session) {
		appointment.setBookstatus("pending");
		this.appointmentdao.save(appointment);
		String status="pending";
		int id = appointment.getId();
		String name = appointment.getName();
		String subject = "Appointment Book Successfully"+"Mr. "+name;
		String msg ="Your Appointment Id is :  "+id+"\n"+"Patient Name is : "+name+"\n" +"Status Is : "+status+"\n"+"Appointment Date : "+appointment.getDate1()+"\n"
				+"\n"+"\n"+"\n"+"Wating For Approval......."+"\n"+"\n"+"\n"+"Thanks Regards :  ChitrakootHospital";
		this.sendmail.sendemail(appointment.getEmail(), msg, subject);
		session.setAttribute("msg", "Appointment Book Successfully !! But Status is  Pending");
		return "redirect:/home";
	}

	@RequestMapping("/delete/{id}")
	public String deleteappointment(@PathVariable("id") int id)
	{
	this.appointmentdao.deleteById(id);
	
		return "redirect:/admindashboard";
	}
	
	
	@RequestMapping("/edit/{id}")
	public String editappointment(@PathVariable("id") int id)
	{
		Appointment ap = this.appointmentdao.getOne(id);
		ap.setBookstatus("accept");
		this.appointmentdao.save(ap);
		//send mail to approval
		String status="Approved";
		int id1 = ap.getId();
		String name = ap.getName();
		String subject = "Appointment Approved Successfully"+"Mr. "+name;
		String msg ="Your Appointment Id is :  "+id1+"\n"+"Patient Name is : "+name+"\n" +"Status Is : "+status+"\n"+"Appointment Date : "+ap.getDate1()+"\n"
				+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"Thanks Regards :  ChitrakootHospital"+"\n"+"Address : Sitapur Chitrakoot"+"\n"+"Email : chitrakoothospital108@gmail.com"+"\n";
		this.sendmail.sendemail(ap.getEmail(), msg, subject);
		//
		return "redirect:/admindashboard";
	}
	
	
}
