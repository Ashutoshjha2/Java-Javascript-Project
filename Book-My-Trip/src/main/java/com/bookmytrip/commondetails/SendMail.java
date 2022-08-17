package com.bookmytrip.commondetails;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendMail {

	// simple mail send without attchements
	public void sendemail(String to, String msg, String subject) throws MessagingException

	{

		// Assuming you are sending email from through gmails smtp
		String host = "smtp.gmail.com";

		// Get system properties
		Properties properties = System.getProperties();

		// Setup mail server
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");

		// Get the Session object.// and pass username and password
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

			protected PasswordAuthentication getPasswordAuthentication() {

				return new PasswordAuthentication("chitrakoothospital108@gmail.com", "qjilolfmdfiwblgu");

			}

		});
		session.setDebug(true);

		MimeMessage mimeMessage = new MimeMessage(session);
		mimeMessage.setFrom("chitrakoothospital108@gmail.com");
		mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		mimeMessage.setSubject(subject);
		mimeMessage.setText(msg);

		Transport.send(mimeMessage);

	}

	// email send with attachment
	public void sendmailwithattachment(String to, String msg, String subject, String attachment)
			throws MessagingException, IOException {
		//
		String host = "smtp.gmail.com";

		// Get system properties
		Properties properties = System.getProperties();

		// Setup mail server
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");

		// Get the Session object.// and pass username and password
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

			protected PasswordAuthentication getPasswordAuthentication() {

				return new PasswordAuthentication("chitrakoothospital108@gmail.com", "qjilolfmdfiwblgu");

			}

		});
		session.setDebug(true);

		MimeMessage mimeMessage = new MimeMessage(session);
		mimeMessage.setFrom("chitrakoothospital108@gmail.com");
		mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		mimeMessage.setSubject(subject);
		mimeMessage.setText(msg);
		//
		MimeMultipart multipart = new MimeMultipart();

		MimeBodyPart textmine = new MimeBodyPart();
		MimeBodyPart filemine = new MimeBodyPart();

		textmine.setText(msg);
		File file = new File(attachment);
		filemine.attachFile(file);
		multipart.addBodyPart(filemine);
		multipart.addBodyPart(textmine);
		mimeMessage.setContent(multipart);
		Transport.send(mimeMessage);

		//

	}
}
