package com.hospital.controller;


import java.io.FileOutputStream;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hospital.dao.RegisterDao;
import com.hospital.entity.RegisterPatient;
import com.hospital.entity.Staff;
import com.hospital.services.SendMail;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Controller
public class ReceptionistController {

	@RequestMapping("/registration")
	public String registration() {

		return "registrationpatient";
	}

	@Autowired
	private RegisterDao registerdao;
	@Autowired
    private SendMail  sendmail;
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registernewpatient(@ModelAttribute RegisterPatient registerPatient, HttpSession session) {
		String pname = registerPatient.getPname().trim();
		// set id
		Random id = new Random();
		int ID = id.nextInt(10000);
		//String add = "cktd";
		//String s1 = String.valueOf(ID);
		//String mainID =  s1 ;
		registerPatient.setPid(ID);
		// set staff details
		Staff staff = (Staff) session.getAttribute("current_user");
		String staffusername = staff.getStaffusername();
		String staffphone = staff.getStaffphone();
		registerPatient.setReceptionname(staffusername);
		registerPatient.setReceptionphone(staffphone);
		registerPatient.setAdmitstatus("notadmit");
		this.registerdao.save(registerPatient);
		// PDFStart
		try {
			String path = "C:\\Users\\spider\\Documents\\regHospitalweb\\registration\\" + pname + ".pdf";
			Document d = new Document();

			PdfWriter.getInstance(d, new FileOutputStream(path));

			d.open();

			Paragraph para0 = new Paragraph("Registration Date- :  " + new Date().toLocaleString());
			Paragraph para00 = new Paragraph("\n");
			Paragraph para000 = new Paragraph("Registration ID- :  " + ID);

			Paragraph para0000 = new Paragraph("\n");
			Paragraph para = new Paragraph(
					"                                                         Welcome To Chitrakoot Hospital                                          \n Address-: "
							+ "Sitapur Chitrakoot");
			Paragraph para1 = new Paragraph("Email-: " + "chitrakoothospital108@gmail.com");
			d.add(para0);
			d.add(para00);
			d.add(para000);
			d.add(para0000);
			d.add(para);
			d.add(para1);
			Paragraph para3 = new Paragraph("\n");
			Paragraph para4 = new Paragraph(
					"                        ---------------------------------- Patient Details ---------------------------------");
			Paragraph para5 = new Paragraph("\n");
			d.add(para3);
			d.add(para4);
			d.add(para5);
			// table patient
			PdfPTable pt = new PdfPTable(6);
			PdfPCell c1 = new PdfPCell(new Phrase("Patient Name"));
			pt.addCell(c1);
			c1 = new PdfPCell(new Phrase("Patient Address"));
			pt.addCell(c1);
			c1 = new PdfPCell(new Phrase("Patient Phone"));
			pt.addCell(c1);
			c1 = new PdfPCell(new Phrase("Patient Email Id"));
			pt.addCell(c1);
			c1 = new PdfPCell(new Phrase("Patient Gender"));
			pt.addCell(c1);
			c1 = new PdfPCell(new Phrase("Patient DOB"));
			pt.addCell(c1);
			pt.setHeaderRows(1);
			pt.addCell(pname);
			pt.addCell(registerPatient.getPaddress());
			pt.addCell(registerPatient.getPphone());
			pt.addCell(registerPatient.getPemail());
			pt.addCell(registerPatient.getGender());
			pt.addCell(registerPatient.getPdob());

			d.add(pt);

			// table Reception
			Paragraph para6 = new Paragraph("\n");
			Paragraph para7 = new Paragraph(
					"                        ---------------------------------- Receptionist Details ---------------------------------");
			Paragraph para8 = new Paragraph("\n");
			d.add(para6);
			d.add(para7);
			d.add(para8);
			PdfPTable rec = new PdfPTable(2);

			PdfPCell c2 = new PdfPCell(new Phrase("Receptionist Name"));
			rec.addCell(c2);
			c2 = new PdfPCell(new Phrase("Receptionist Phone No."));
			rec.addCell(c2);
			rec.setHeaderRows(1);
			rec.addCell(staffusername);
			rec.addCell(staffphone);
			d.add(rec);
			Paragraph para9 = new Paragraph("\n");
			Paragraph para10 = new Paragraph("Thank You For Choose My Services\n");
			Paragraph para11 = new Paragraph("Regard " + staffusername);
			d.add(para9);
			d.add(para10);
			d.add(para11);
			Paragraph para12 = new Paragraph("\n");

			Paragraph para13 = new Paragraph(
					"       -----------------------------------------------------------------------------------------------------------------------");
			Paragraph para14 = new Paragraph("\n");
			Paragraph para15 = new Paragraph(
					"                                                      Welcome To Chitrakoot Hospital                                          \n                                                       Address-: "
							+ "Sitapur Chitrakoot");
			Paragraph para16 = new Paragraph("                                                       Email-: "
					+ "chitrakoothospital108@gmail.com");
			d.add(para12);
			d.add(para13);
			d.add(para14);
			d.add(para15);
			d.add(para16);
			System.out.println("Please Wait..................!!");
			d.close();
			this.sendmail.sendmailwithattachment(registerPatient.getPemail(), "Registration successfully", "Chitrakoot Hospital", path);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// PDF END
		//send mail registration success
		
		session.setAttribute("msg", "Patient Registration successfully!!Check Your Mail Send PDF To You");
		return "redirect:/receptiondashboard";
	}

}
