package com.hospital.controller;

import java.io.FileOutputStream;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hospital.dao.AmbulenceDao;
import com.hospital.entity.AmbulenceBooking;
import com.hospital.services.SendMail;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Controller
public class AmbulenceBookingController {

	@Autowired
	private AmbulenceDao ambulencedao;
	
	@Autowired
	private SendMail sendemail;
	@RequestMapping("/emergency")
	public String emergency() {
		System.out.println("This Is emergency page");

		return "ambulencebook";
	}
	@RequestMapping(path = "bookingambulence", method = RequestMethod.POST)
	public String ambulencebooking(@ModelAttribute AmbulenceBooking ambulenceBooking ,HttpSession session) {
		ambulenceBooking.setAmbulencetype("ac");
		if (ambulenceBooking.getBookinground().equals("round")) {
			ambulenceBooking.setPaystatus("pending");
			ambulenceBooking.setPaytype("online");
		}else {
			ambulenceBooking.setPaystatus("Done");
			ambulenceBooking.setPaytype("Free");
		}
		
		System.out.println("booking Successfully...");
		this.ambulencedao.save(ambulenceBooking);
		//PDF
		try {
			String path = "C:\\Users\\spider\\Documents\\regHospitalweb\\ambulencebooking\\" + ambulenceBooking.getUname().trim() + ".pdf";
			String barcode = "C:\\Users\\spider\\Documents\\regHospitalweb\\barcode\\barcode.png";
			Document d = new Document();

			PdfWriter.getInstance(d, new FileOutputStream(path));

			d.open();
			Paragraph para01 = new Paragraph(
					"            ----------------------------- Ambulence Booking Successfully Receipt ---------------------------");
			Paragraph para001 = new Paragraph("\n");
			Paragraph para0 = new Paragraph("Booking Date- :  " + new Date().toLocaleString());
			Paragraph para00 = new Paragraph("\n");
			Paragraph para000 = new Paragraph("Booking ID- :  " + ambulenceBooking.getBookingid());
			Paragraph para00001 = new Paragraph("Ambulence No- :  " + "UP 96 C 1008");
			Paragraph para0000 = new Paragraph("\n");
			Paragraph para = new Paragraph(
					"                                                         Welcome To Chitrakoot Hospital                                          \n Address-: "
							+ "Sitapur Chitrakoot");
			Paragraph para1 = new Paragraph("Email-: " + "chitrakoothospital108@gmail.com");
			d.add(para01);
			d.add(para001);
			d.add(para00001);
			d.add(para0);
			d.add(para00);
			d.add(para000);
			d.add(para0000);
			d.add(para);
			d.add(para1);
			Paragraph para3 = new Paragraph("\n");
			Paragraph para4 = new Paragraph(
					"                        ---------------------------------- Booking Details ---------------------------------");
			Paragraph para5 = new Paragraph("\n");
			d.add(para3);
			d.add(para4);
			d.add(para5);
			// table patient
			PdfPTable pt = new PdfPTable(6);
			PdfPCell c1 = new PdfPCell(new Phrase("User Name"));
			pt.addCell(c1);
			c1 = new PdfPCell(new Phrase("User Address"));
			pt.addCell(c1);
			c1 = new PdfPCell(new Phrase("User Phone"));
			pt.addCell(c1);
			c1 = new PdfPCell(new Phrase("User Email Id"));
			pt.addCell(c1);
			c1 = new PdfPCell(new Phrase("Reffer Hospital Name"));
			pt.addCell(c1);
			c1 = new PdfPCell(new Phrase("Ambulence Type"));
			pt.addCell(c1);
			pt.setHeaderRows(1);
			pt.addCell(ambulenceBooking.getUname());
			pt.addCell(ambulenceBooking.getAddress());
			pt.addCell(ambulenceBooking.getMobile());
			pt.addCell(ambulenceBooking.getEmail());
			pt.addCell(ambulenceBooking.getReffername());
			pt.addCell("SMART/AC/  "+ambulenceBooking.getBookinground());

			d.add(pt);

			// table payment
			Paragraph para6 = new Paragraph("\n");
			Paragraph para7 = new Paragraph(
					"                        ---------------------------------- Payment Details ---------------------------------");
			Paragraph para8 = new Paragraph("\n");
			d.add(para6);
			d.add(para7);
			d.add(para8);
			PdfPTable rec = new PdfPTable(3);

			PdfPCell c2 = new PdfPCell(new Phrase("Payment Type"));
			rec.addCell(c2);
			c2 = new PdfPCell(new Phrase("Payment Status"));
			rec.addCell(c2);
			if (ambulenceBooking.getBookinground().equals("round")) {
				c2 = new PdfPCell(new Phrase("Total Payment"));
				rec.addCell(c2);
			}else {
				c2 = new PdfPCell(new Phrase("Total Payment"));
				rec.addCell(c2);
			}
			
			rec.setHeaderRows(1);
			rec.addCell(ambulenceBooking.getPaytype());
			rec.addCell(ambulenceBooking.getPaystatus());
			if (ambulenceBooking.getBookinground().equals("round")) {
				rec.addCell("200");
			}else {
				rec.addCell("Free One Way Ambulence");
			}
			
			d.add(rec);
			
			if (ambulenceBooking.getBookinground().equals("round")) {
				Paragraph para18 = new Paragraph("Scan To Pay Now");
				d.add(para18);
				d.add(Image.getInstance(barcode));
			}else {
				Paragraph para9 = new Paragraph("\n");
				Paragraph para10 = new Paragraph("Thank You For Choose My Services\n");
				Paragraph para11 = new Paragraph("Regard " + "Chitrakoot Hospital");
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

			}
			
			System.out.println("Please Wait..................!!");
			d.close();
			this.sendemail.sendmailwithattachment(ambulenceBooking.getEmail(), "Ambulence Booking Successfully", "Chitrakoot Hospital", path);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		//END PDF
		session.setAttribute("msg", "Ambulence Book Successfully !! Please Check Your Mail For Booking Details");
		return "ambulencebook";
	}
	
}
