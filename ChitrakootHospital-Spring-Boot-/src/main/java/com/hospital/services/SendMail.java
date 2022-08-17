package com.hospital.services;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class SendMail {
	@Autowired
	private JavaMailSender mailSender;
	//simple mail send without attchements
	public void sendemail(String to,String msg,String subject)
	{
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("chitrakoothospital108@gmail.com");
		message.setTo(to);
		message.setText(msg);
		message.setSubject(subject);
		mailSender.send(message);
		System.out.println("Mail Send Successfully");
	}
	//email send with attachment
	public void sendmailwithattachment(String to,String msg,String subject,String attachment) throws MessagingException
	{
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage,true);
		messageHelper.setFrom("chitrakoothospital108@gmail.com");
		messageHelper.setTo(to);
		messageHelper.setText(msg);
		messageHelper.setSubject(subject);
		FileSystemResource fileSystemResource = new FileSystemResource(new File(attachment));
		messageHelper.addAttachment(fileSystemResource.getFilename(),fileSystemResource);
		mailSender.send(mimeMessage);
		System.out.println("Email Send Successfully....");
	}
}
