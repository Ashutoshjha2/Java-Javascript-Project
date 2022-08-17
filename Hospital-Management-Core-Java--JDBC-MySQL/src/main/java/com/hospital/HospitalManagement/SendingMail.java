package com.hospital.HospitalManagement;

import java.io.File;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendingMail {

	public static void sendEmail( String subject, String from, String to,String path)  {
		//variable for gmail
		String host="smtp.gmail.com";
		//get the system properties
		Properties properties =System.getProperties();
		System.out.println("properties"+properties);
		//setting important information to properties object
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port","465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");
		
		//step1 get session
		Session session=Session.getInstance(properties, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				//Enter Your gmail [email id or Password]
				return new PasswordAuthentication("vivek********@gmail.com", "*************");
			}
		
		});
		session.setDebug(true);
		//step2 compose the msg
	MimeMessage m=	new MimeMessage(session);
		//from
	try {
	m.setFrom(from);
	
	//adding recipient to msg
	m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	
	//adding subject to msg
	m.setSubject(subject);
	//adding test
	
	//attachement
	//file path
	
	
	MimeMultipart multipart = new MimeMultipart();
	//test
	//file
	
	
	  javax.mail.internet.MimeBodyPart testMine = new javax.mail.internet.MimeBodyPart();
	  javax.mail.internet.MimeBodyPart fileMime= new javax.mail.internet.MimeBodyPart();
	  try {
		 // testMine.setText(msg);
		  File file = new File(path);
		  fileMime.attachFile(file);
		  
		  multipart.addBodyPart(testMine);
		  multipart.addBodyPart(fileMime);
	  }catch (Exception e) {
	e.printStackTrace();
	}
	m.setContent(multipart);
	//send msg step3

	Transport.send(m);
	System.err.println("Email Sent Successfully......");
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
	}


