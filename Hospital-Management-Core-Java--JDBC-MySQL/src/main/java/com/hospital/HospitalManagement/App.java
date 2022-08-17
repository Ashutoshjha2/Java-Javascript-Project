package com.hospital.HospitalManagement;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class App {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.err.println("----------Welcome To Hospital Management System----------");
		System.out.println("Press 7 Run this Application Step By Step");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		try {
			boolean option = true;
			while (option) {
				System.out.println("Press 1 Login Receptionist");
				System.out.println("Press 2 Login Doctor");
				System.out.println("Press 3 Check Next Meeting Date");
				System.out.println("Press 4 Admin Login");
				System.out.println("Press 5 Update Patient Details");
				System.out.println("Press 6 Exit ");
				System.out.println("Press 7 About Application");
				System.err.println("--------------------Enter Your Options--------------------");
				int op = Integer.parseInt(s.nextLine());
				switch (op) {
				case 1:
					System.out.println("*****Welcome To Registration Page*****");
					System.out.println("---------- Login First ---------- ");
					System.out.println("Enter Your Id");
					String receptionid = s.nextLine();
					System.out.println("Enter Your Name");
					String receptionname = s.nextLine();
					//
					Class.forName("com.mysql.jdbc.Driver");
					Connection con0 = DriverManager.getConnection("jdbc:mysql://localhost:3307/hospital", "root",
							"root");
					PreparedStatement ps0 = con0.prepareStatement("select * from staff where aid=? and aname=?");
					ps0.setString(1, receptionid);
					ps0.setString(2, receptionname);
					ResultSet rs0 = ps0.executeQuery();
					while (rs0.next()) {
						System.out.println("Please wait....Cheching your Details!!");
						Thread.sleep(3000);
						String reception =rs0.getString(6);
						if (reception.equals("Receptionist")) {
							System.out.println("Welcome :- " + rs0.getString(2));
							String recphone = rs0.getString(4);

							// Enter Patient Details
							System.out.println("*****************************************************");

							Random id = new Random();
							int ID = id.nextInt(10000);
							String add ="cktd";
						
							String  s1 = String.valueOf(ID);
							
							System.out.println("Enter The Patient Name");
							String pname = s.nextLine().toUpperCase();
							String convert = pname.toLowerCase();
							String mainID = add+"/"+s1+"/"+convert;
							System.out.println("Enter The patient Address");
							String paddress = s.nextLine().toUpperCase();
							System.out.println("Enter The Patient Phone No.");
							String phone = s.nextLine();
							System.out.println("Enter The Patient Email ID");
							String pemail = s.nextLine();
							System.out.println("Enter The patient Diseases ");
							String pdeseases = s.nextLine().toUpperCase();
							System.out.println("*********** Select A Doctor ********** ");
							System.out.println("ID:- 1, Name:-vivek ,Fee:- 300 INR, Qulification:-MBBS");
							System.out.println("ID:- 2, Name:-Vinay ,Fee:- 200 INR, Qulification:-DHMS");
							System.out.println("ID:- 3, Name:-Ashu ,Fee:- 100 INR, Qulification:-BDS");
							System.out.println("Enter The Doctor ID");
							String Dselect = s.nextLine();
							Random r = new Random();
							int roomid = r.nextInt(10);
							String rm = String.valueOf(roomid);
							// database Access
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hospital", "root",
									"root");
							PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?,?,?,?,?,?,?)");
							// set the data into database
							ps.setString(1, mainID);
							ps.setString(2, pname);
							ps.setString(3, paddress);
							ps.setString(4, phone);
							ps.setString(5, pemail);
							ps.setString(6, pdeseases);
							ps.setString(7, Dselect);
							ps.setString(8, rm);
							ps.setString(9, rs0.getString(1));
							ps.setString(10, rs0.getString(2));
							ps.setString(11, rs0.getString(4));
							int k = ps.executeUpdate();
							if (k >0) {
								// PDF
								
								String path = "C:\\Users\\spider\\Documents\\regHospital\\" + pname
										+ ".pdf";
								Document d = new Document();

								PdfWriter.getInstance(d, new FileOutputStream(path));
								d.open();
								
								Paragraph para0 = new Paragraph("Registration Date- :  "+new Date().toLocaleString());
								Paragraph para00 = new Paragraph("\n");
								Paragraph para000 = new Paragraph("Registration ID- :  "+mainID);
								
								Paragraph para0000 = new Paragraph("\n");
								Paragraph para = new Paragraph("                                                         Welcome To Chitrakoot Hospital                                          \n Address-: "+"Sitapur Chitrakoot");
								Paragraph para1 = new Paragraph("Email-: "+"vivekckt1997@gmail.com");
								d.add(para0);
								d.add(para00);
								d.add(para000);
								d.add(para0000);
								d.add(para);
								d.add(para1);
								Paragraph para3 = new Paragraph("\n");
								Paragraph para4 = new Paragraph("                        ---------------------------------- Patient Details ---------------------------------");
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
								c1 = new PdfPCell(new Phrase("Patient Diseases"));
								pt.addCell(c1);
								c1 = new PdfPCell(new Phrase("Patient Room No."));
								pt.addCell(c1);
								pt.setHeaderRows(1);
								pt.addCell(pname);
								pt.addCell(paddress);
								pt.addCell(phone);
								pt.addCell(pemail);
								pt.addCell(pdeseases);
								pt.addCell(rm);
								d.add(pt);
								//table Reception
								Paragraph para6 = new Paragraph("\n");
								Paragraph para7 = new Paragraph("                        ---------------------------------- Receptionist Details ---------------------------------");
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
								rec.addCell(receptionname);
								rec.addCell(recphone);
								d.add(rec);
								Paragraph para9 = new Paragraph("\n");
								Paragraph para10 = new Paragraph("Thank You For Choose My Services\n");
								Paragraph para11 = new Paragraph("Regard "+receptionname);
								d.add(para9);
								d.add(para10);
								d.add(para11);
								Paragraph para12 = new Paragraph("\n");
						
								Paragraph para13 = new Paragraph("       ----------------------------------------------------------------------------------------------------------------------");
								Paragraph para14 = new Paragraph("\n");
								Paragraph para15 = new Paragraph("                                                         Welcome To Chitrakoot Hospital                                          \n                                                          Address-: "+"Sitapur Chitrakoot");
								Paragraph para16 = new Paragraph("                                                         Email-: "+"chitrakoothospital108@gmail.com");
								d.add(para12);d.add(para13);d.add(para14);d.add(para15);d.add(para16);
								System.out.println("Please Wait..................!!");
								Thread.sleep(2000);
								System.out.println("Generating PDF..........");
								Thread.sleep(2000);
								System.out.println("PDF Generate Successfully.....!!");
								d.close();
								// END PDF
								Thread.sleep(1000);
								//Sending Mail
								System.out.println("Sending To Mail.......!!");
								String subject ="Chitrakoot Hospital";
								String msg ="Registration successfully";
								String from ="chitrakoothospital108@gmail.com";
								
								//SendingMail.sendEmail(subject, from, pemail);
								//Ending Mail
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
										//Enter Your Email Details
										return new PasswordAuthentication("chitrakoothospital108@gmail.com", "************************ ");
									}
								
								});
								session.setDebug(true);
								//step2 compose the msg
							MimeMessage m=	new MimeMessage(session);
								//from
							try {
							m.setFrom(from);
							
							//adding recipient to msg
							m.addRecipient(Message.RecipientType.TO, new InternetAddress(pemail));
							
							//adding subject to msg
							m.setSubject(subject);
							//adding test
							
							//attachement
							//file path
							String path1="C:\\Users\\spider\\Documents\\regHospital\\"+pname+".pdf";
							
							MimeMultipart multipart = new MimeMultipart();
							//test
							//file
							
							System.out.println(path1);
							  javax.mail.internet.MimeBodyPart testMine = new javax.mail.internet.MimeBodyPart();
							  javax.mail.internet.MimeBodyPart fileMime= new javax.mail.internet.MimeBodyPart();
							  try {
								  testMine.setText(msg);
								  File file = new File(path1);
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
							
								//
								
								System.out.println("Your Registration Successfully Please Check Your Mail");
						}

						} 
						System.err.println("__________________________________________________________");
					}
           System.err.println("You Enter Wrong Details");
					break;
				case 2:
					System.out.println("Enter Your name");
					String dname = s.nextLine();
					Class.forName("com.mysql.jdbc.Driver");
					Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3307/hospital", "root",
							"root");
					PreparedStatement ps1 = con1.prepareStatement("select * from doctorlogin where dname=?");
					ps1.setString(1, dname);
					ResultSet rs = ps1.executeQuery();
					while (rs.next()) {
						System.out.println("Welcome :- " + rs.getString(2));
						String doctorname = rs.getString(2);
						String doctorqualification = rs.getString(3);
						int doctorfee = rs.getInt(4);
						System.err.println("__________________________________________________________");
						System.out.println("Please Wait.......!!");
						Thread.sleep(2000);
						Class.forName("com.mysql.jdbc.Driver");
						Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3307/hospital", "root",
								"root");
						PreparedStatement ps2 = con2.prepareStatement("select * from register where rid=?");
						System.out.println("Enter Patient Reg-ID");
						int regid = Integer.parseInt(s.nextLine());
						ps2.setInt(1, regid);
						ResultSet rs2 = ps2.executeQuery();
						while (rs2.next()) {
							System.out.println("Patient Reg Id is :-" + rs2.getInt(1));
							System.out.println("Patient Name is :-" + rs2.getString(2));
							System.out.println("Patient Address is :-" + rs2.getString(3));
							System.out.println("Patient Phone No is :-" + rs2.getInt(4));
							System.out.println("Patient Deseases is :-" + rs2.getString(5));
							System.out.println("Patient Room No is :-" + rs2.getInt(7));
							System.out.println(" Receptionist Name is :-" + rs2.getInt(9));

							System.out.println("*************** Patient Medicine ***************");
							System.out.println("Enter Medicine Name");
							String mname = s.nextLine();
							System.out.println("Enter Medicine Dose");
							String dose = s.nextLine();
							System.out.println("Next Meeting Date");
							String meeting = s.nextLine();
							System.out.println("Enter Total days");
							int tdays = Integer.parseInt(s.nextLine());
							System.out.println("Enter Payment Mode");
							String paystuatus = s.nextLine();
							System.out.println("Enter Medicine Fee");
							int medipay = Integer.parseInt(s.nextLine());
							int totalpay = doctorfee + medipay;
							Class.forName("com.mysql.jdbc.Driver");
							Connection con3 = DriverManager.getConnection("jdbc:mysql://localhost:3307/hospital",
									"root", "root");
							PreparedStatement ps3 = con3.prepareStatement(
									"insert into patientmedicine values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
							ps3.setInt(1, rs2.getInt(1));
							ps3.setString(2, rs2.getString(2));
							ps3.setString(3, rs2.getString(3));
							ps3.setInt(4, rs2.getInt(4));
							ps3.setString(5, rs2.getString(5));
							ps3.setInt(6, rs2.getInt(7));
							ps3.setString(7, doctorname);
							ps3.setString(8, doctorqualification);
							ps3.setInt(9, doctorfee);
							ps3.setString(10, mname);
							ps3.setString(11, dose);
							ps3.setString(12, meeting);
							ps3.setInt(13, tdays);
							ps3.setString(14, paystuatus);
							ps3.setInt(15, medipay);
							ps3.setInt(16, totalpay);
							ps3.setInt(17, rs2.getInt(8));
							ps3.setString(18, rs2.getString(9));
							ps3.setLong(19, rs2.getLong(10));
							int q = ps3.executeUpdate();
							if (q > 0) {

								System.out.println("Patient Record Craete Successfully.....");
							} else {
								System.out.println("Something Went Wrong.....!!");
							}
							System.err.println("__________________________________________________________");
						}
					}
					break;
				case 3:
					System.err.println("********** Enter This Formot Date 01-02-2021 **********");
					System.out.println("Please Wait.....!!");
					Thread.sleep(2000);
					System.out.println("Please Enter Patient Meeting Date ");
					String meeting = s.nextLine();
					Class.forName("com.mysql.jdbc.Driver");
					Connection con4 = DriverManager.getConnection("jdbc:mysql://localhost:3307/hospital", "root",
							"root");
					PreparedStatement ps4 = con4.prepareStatement("select * from patientmedicine where pmeeting=?");
					ps4.setString(1, meeting);
					ResultSet rs4 = ps4.executeQuery();

					if (rs4.next()) {
						System.out.println("Yes You can Meet The Doctor");
						System.out.println("Go Room No. is " + rs4.getInt(6));
						System.out.println("Doctor Name is " + rs4.getString(7));
					} else {
						System.out.println("Opps You Can't Meet The Doctor");
					}
					break;
				case 4:
					System.out.println("____________________Welcome To Admin DashBoard____________________");
					System.out.println("Enter The Admin Name");
					String aname = s.nextLine();
					System.out.println("Enter The Admin ID");
					int aid = Integer.parseInt(s.nextLine());
					Class.forName("com.mysql.jdbc.Driver");
					Connection con5 = DriverManager.getConnection("jdbc:mysql://localhost:3307/hospital", "root",
							"root");
					PreparedStatement ps5 = con5.prepareStatement("select * from staff where aname=? and aid=? ");
					ps5.setString(1, aname);
					ps5.setInt(2, aid);
					ResultSet rs5 = ps5.executeQuery();
					while (rs5.next()) {
						System.out.println("Welcome: > " + rs5.getString(2));
						System.out.println("__________________________________________________________");
						Boolean option2 = true;
						while (option2) {
							System.out.println("1 : Craete A New Sub_Admin");
							System.out.println("2 : Craete A Receptionist");
							System.out.println("3 : View All Receptionist");
							System.out.println("4 : Check Total Registration Via Receptionist");
							System.out.println("5 : Add A New Doctor");
							System.out.println("6 : Logout");
							System.out.println("7 :Print");
							System.out.println("------------------------ Enter Your Option ------------------------");
							int staff = Integer.parseInt(s.nextLine());
							switch (staff) {
							case 1:
								int staffid = new Random().nextInt(10);
								System.out.println("Enter The Name");
								String Aname = s.nextLine();
								System.out.println("Enter the Address");
								String aaddress = s.nextLine();
								System.out.println("Enter the Phone No.");
								long aphone = Long.parseLong(s.nextLine());
								System.out.println("Enter The Email Id");
								String aemail = s.nextLine();
								String staffstatus = "admin";
								String adminstatus = "admin";
								//
								Class.forName("com.mysql.jdbc.Driver");
								Connection con6 = DriverManager.getConnection("jdbc:mysql://localhost:3307/hospital",
										"root", "root");
								PreparedStatement ps6 = con6
										.prepareStatement("insert into staff values(?,?,?,?,?,?,?)");
								ps6.setInt(1, staffid);
								ps6.setString(2, Aname);
								ps6.setString(3, aaddress);
								ps6.setLong(4, aphone);
								ps6.setString(5, aemail);
								ps6.setString(6, staffstatus);
								ps6.setString(7, adminstatus);
								int k6 = ps6.executeUpdate();
								if (k6 > 0) {
									System.out.println("Please Wait... Checking Your Details  !! ");
									Thread.sleep(3000);
									System.err.println("Data Verify" + "New Admin Add Successfully...........");
								}

								break;
							case 2:
								int staffId = new Random().nextInt(20);
								System.out.println("Enter The Name");
								String rname = s.nextLine();
								System.out.println("Enter the Address");
								String raddress = s.nextLine();
								System.out.println("Enter the Phone No.");
								long rphone = Long.parseLong(s.nextLine());
								System.out.println("Enter The Email Id");
								String remail = s.nextLine();
								String staffstatusr = "Receptionist";
								String adminstatusr = "notadmin";
								//
								Class.forName("com.mysql.jdbc.Driver");
								Connection con7 = DriverManager.getConnection("jdbc:mysql://localhost:3307/hospital",
										"root", "root");
								PreparedStatement ps7 = con7
										.prepareStatement("insert into staff values(?,?,?,?,?,?,?)");
								ps7.setInt(1, staffId);
								ps7.setString(2, rname);
								ps7.setString(3, raddress);
								ps7.setLong(4, rphone);
								ps7.setString(5, remail);
								ps7.setString(6, staffstatusr);
								ps7.setString(7, adminstatusr);
								int k7 = ps7.executeUpdate();
								if (k7 > 0) {
									System.out.println("Please Wait... Checking Your Details  !! ");
									Thread.sleep(3000);
									System.err.println("Data Verify " + "One Receptionist Add Successfully...........");
								}

								break;
							case 3:
								Class.forName("com.mysql.jdbc.Driver");
								Connection con8 = DriverManager.getConnection("jdbc:mysql://localhost:3307/hospital",
										"root", "root");
								PreparedStatement ps8 = con8
										.prepareStatement("select * from staff where staffstatus=?");
								String staffs = "receptionist";
								ps8.setString(1, staffs);
								ResultSet rs8 = ps8.executeQuery();
								while (rs8.next()) {
									System.err.println("Receptionist ID  is :-" + rs8.getInt(1));
									System.out.println("Receptionist Name is :-" + rs8.getString(2));
									System.out.println("Receptionist Address is :-" + rs8.getString(3));
									System.out.println("Receptionist Phone No is :-" + rs8.getLong(4));
									System.out.println("Receptionist Email is :-" + rs8.getString(5));

								}

								break;
							case 4:
								System.out.println("Enter The Receptionist Name");
								String receptionistname = s.nextLine();
								Class.forName("com.mysql.jdbc.Driver");
								Connection con10 = DriverManager.getConnection("jdbc:mysql://localhost:3307/hospital",
										"root", "root");
								PreparedStatement ps10 = con10
										.prepareStatement("select * from patientmedicine where receptionistname=?");

								ps10.setString(1, receptionistname);
								ResultSet rs10 = ps10.executeQuery();
								while (rs10.next()) {
									System.err.println("Patient ID  is :-" + rs10.getInt(1));
									System.err.println("Patient Name is :-" + rs10.getString(2));
									System.err.println("Patient Address is :-" + rs10.getString(3));
									System.err.println("Patient Phone No is :-" + rs10.getLong(4));
									System.err.println("Patient Deseases is :-" + rs10.getString(5));
									System.err.println("Doctor Name :-" + rs10.getString(7));
									System.err.println("Doctor Qualification :-" + rs10.getString(8));
									System.err.println("Doctor Fee :-" + rs10.getString(9));
									System.err.println("Total payment :-" + rs10.getString(16));
								}
								break;
							case 5:
								int did = new Random().nextInt(20);
								System.out.println("Enter The Doctor Name");
								String docname = s.nextLine();
								System.out.println("Enter The Doctor Qualification");
								String dqulification = s.nextLine();
								System.out.println("Enter The doctor Fee Charge");
								int doctorfee = Integer.parseInt(s.nextLine());
								Class.forName("com.mysql.jdbc.Driver");
								Connection con9 = DriverManager.getConnection("jdbc:mysql://localhost:3307/hospital",
										"root", "root");
								PreparedStatement ps9 = con9
										.prepareStatement("insert into doctorlogin values(?,?,?,?)");
								ps9.setInt(1, did);
								ps9.setString(2, docname);
								ps9.setString(3, dqulification);
								ps9.setInt(4, doctorfee);

								int k9 = ps9.executeUpdate();
								if (k9 > 0) {
									System.out.println("Please Wait... Checking Your Details  !! ");
									Thread.sleep(3000);
									System.err.println("Data Verify " + "Doctor Add Successfully...........");
								}
								break;
							case 6:
								option2 = false;
								break;
							case 7:
								String namep = "vivek";
								String path = "C:\\Users\\spider\\Documents\\Save Details Hospital program\\" + namep
										+ ".pdf";
								Document d = new Document();

								PdfWriter.getInstance(d, new FileOutputStream(path));
								d.open();

								Paragraph para = new Paragraph("This Is testing Code");
								d.add(para);
								// table
								PdfPTable pt = new PdfPTable(2);
								PdfPCell c1 = new PdfPCell(new Phrase("Heading 1"));
								pt.addCell(c1);
								c1 = new PdfPCell(new Phrase("Heading 2"));
								pt.addCell(c1);
								pt.setHeaderRows(1);
								pt.addCell("1");
								pt.addCell("1.2");
								pt.addCell("2");
								pt.addCell("2.2");
								pt.addCell("3");
								pt.addCell("3.0");
								d.add(pt);
								System.out.println("Please Wait..................!!");
								Thread.sleep(2000);
								System.out.println("PDF Generate Successfully.....!!");
								d.close();
								break;
							default:
								System.out.println("Invalid Options");
								break;
							}
						}
					}
					break;
				case 5:
					System.out.println("Coming Soon This Option Work....");
					break;
				case 6:
					option = false;
					System.out.println("Thank You Using My Application");
					break;
				case 7:
					System.out.println("This Is Hospital Management System Developed By: - Vivek");
					System.out.println("Email Is : - vivekckt1997@gmail.com");
					System.out.println("Step 1:- press 1 login Receptionist and Register a new patient");
					System.out.println("Step 2:- press 2 login Login Doctor And Put Registration For patient ");
					System.out.println("Step 3:- press 3 To Check Appointment Date for patient");
					System.out.println(
							"Step 4:- press 4  Admin Login task Perform Create A new Receptionist Or Sub Admin Account and Add Doctor ");
					System.err.println("Receptionist ID" + " 4- " + "Name Is -" + "vivek");
					System.err.println("Doctor ID" + " 1 - " + "Name Is -" + "vivek");
					System.err.println("Admin ID" + " 2- " + "Name Is -" + "vivek");
					System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
					break;
				default:
					System.err.println("Invalid Details");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
