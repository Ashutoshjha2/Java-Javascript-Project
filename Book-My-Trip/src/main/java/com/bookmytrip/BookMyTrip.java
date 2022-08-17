package com.bookmytrip;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.mail.MessagingException;

import com.bookmytrip.busbooking.BusDetails;
import com.bookmytrip.commondetails.NumberToWordConverter;
import com.bookmytrip.commondetails.SendMail;
import com.bookmytrip.commondetails.UserDetails;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class BookMyTrip {
	public static void main(String[] args) throws InterruptedException, MessagingException {
		Scanner s = new Scanner(System.in);
		Boolean option = true;

		while (option) {
			System.out.println(
					"*****************************WELCOME TO BOOK MY TRIP APPLICATION ***************************************");
			System.out.println("Press 1: " + " BUS BOOKING ");
			System.out.println("Press 2: " + " FLIGHT BOOKING");
			System.out.println("Press 3: " + " TRAIN BOOKING ");
			System.out.println("Enter Your Option...........");
			int tripoption = Integer.parseInt(s.nextLine());

			switch (tripoption) {
			case 1:

				Boolean bus = true;
				while (bus) {
					System.out.println("Press 1 Book Ticket");
					System.out.println("Press 2 View Booking Tickets");
					System.out.println("Press 3 Delete Booking");
					System.out.println("Press 4 BACK TO MENU");
					System.out.println("ENTER YOUR OPTION.........");
					int busoption = Integer.parseInt(s.nextLine());
					switch (busoption) {
					case 1:
						int seetNumber = 0;
						List<Integer> s1;
						System.out.println("Enter From station "+" FROM Station fixed{chitrakoot}ONLY");
						String sourse = s.nextLine();
						System.out.println("Enter Destination Station " + " Only{ bihar,pune,bhopal,mumbai}");
						String destination = s.nextLine();
						System.err.println("Enter Date Of Journey " + " This Format " + " DD/MM/YY");
						String doj = s.nextLine();

						System.out.println("Searching Bus Please Wait...!!");
						Thread.sleep(3000);
						BusDetails details = new BusDetails();
						List<BusDetails> showAllBus = details.ShowAllBus();

						for (BusDetails busDetails : showAllBus) {

							if (busDetails.getbSourse().equalsIgnoreCase(sourse)
									&& busDetails.getbDestination().equalsIgnoreCase(destination)) {
								System.out.println(busDetails);

							}
						}

						System.out.println("ENTER THE BUS NUMBER.....");
						int busId = Integer.parseInt(s.nextLine());
						List<BusDetails> allBus = BusDetails.ShowAllBus();
						for (BusDetails busDetails : allBus) {
							if (busDetails.getBnumber() == busId) {
								System.out.println("Loading Form.......!!");
								Thread.sleep(2000);
								System.err.println(
										"----------------------------------YOUR SELECTED BUS DETAILS-----------------------------------");
								System.out.printf("%10s %10s %10s %10s %12s %18s", "BUS_NUMBER", "BUS_NAME",
										"BUS_PRICE", "BUS_TYPE", "SOURSE", "DESTINATION");
								System.out.println();
								System.out.println(
										"---------------------------------------------------------------------------------------------");
								System.out.format("%5s %12s %12s %10s %15s %13s", busDetails.getBnumber(),
										busDetails.getbName(), busDetails.getbPrice(), busDetails.getbType(),
										busDetails.getbSourse(), busDetails.getbDestination());
								System.out.println();

								System.out.println(
										"----------------------------------------------------------------------------------------------");
								System.out.println(
										"--------------------------------PLEASE PROVIDE USER DETAILS FOR BOOKING-----------------------");
								System.out.println("Enter passanger name");
								String pName = s.nextLine();
								System.out.println("Enter Number Of Sheets");
								int pqty = Integer.parseInt(s.nextLine());
								System.out.println("Enter The Email Id " + " PLEASE WRITEN CORRECT EMAIL-ID OTHERWISE EMAIL SEND FAILED.. ");
								String pemail = s.nextLine();
								System.out.println("Enter The Mobile number");
								Long mobile = Long.parseLong(s.nextLine());
								System.out.println("Enter Age Of Passanger");
								String dob = s.nextLine();
								Random r = new Random();
								int PNR = r.nextInt(999999999);
								UserDetails userDetails = new UserDetails();
								userDetails.setPNR(PNR);
								userDetails.setuName(pName);
								userDetails.setEmail(pemail);
								userDetails.setuMobile(mobile);
								userDetails.setNumberOfSeets(pqty);
								userDetails.setbDestination(busDetails.getbDestination());
								userDetails.setbSourse(busDetails.getbSourse());
								userDetails.setbName(busDetails.getbName());
								userDetails.setBnumber(busId);
								userDetails.setBookingStatus("CONFIRM");
								userDetails.setbPrice(busDetails.getbPrice());
								userDetails.setbType(busDetails.getbType());
								userDetails.setuDOJ(doj);
								userDetails.setuDestination(destination);
								userDetails.setuSourse(busDetails.getbSourse());
								int total = pqty * busDetails.getbPrice();

								System.err.println(
										"----------------------------------USER BOOKING DETAILS-----------------------------------------------------------------------");
								System.out.printf("%10s %10s %10s %10s %12s %18s", "BUS_NUMBER", "BUS_NAME",
										"BUS_PRICE", "BUS_TYPE", "SOURSE", "DESTINATION");
								System.out.println();
								System.out.println(
										"-----------------------------------------------------------------------------------------------------------------------------");
								System.out.format("%5s %12s %12s %10s %15s %13s", busDetails.getBnumber(),
										busDetails.getbName(), busDetails.getbPrice(), busDetails.getbType(),
										busDetails.getbSourse(), busDetails.getbDestination());
								System.out.println();
								System.out.println(
										"-------------------------------- PASSANGER DETAILS -------------------------------------------------------------------------");

								System.out.printf("%10s %13s %11s %14s %16s %16s %16s %16s", "PNR_NUMBER",
										"PASSANGER_NAME", "TOTAL_PRICE", "NUMBER_OF_SEETS", "DATE_OF_JOURNEY", "SOURSE",
										"DESTINATION", "BOOKING_STATUS");
								System.out.println();
								System.out.println(
										"------------------------------------------------------------------------------------------------------------------------------");
								System.out.format("%5s %10s %16s %14s %16s %19s %14s %14s", userDetails.getPNR(),
										userDetails.getuName().toUpperCase(), total, userDetails.getNumberOfSeets(),
										userDetails.getuDOJ(), userDetails.getuSourse(),
										userDetails.getuDestination().toUpperCase(), "CONFIRM");

								System.out.println();
								/*
								 * for (int i = 1; i <= pqty; i++) { Random random = new Random(); seetNumber =
								 * random.nextInt(100); System.out.println(" Passanger " + i + " -" +
								 * seetNumber); s1 = new ArrayList<Integer>(); s1.add(seetNumber);
								 * userDetails.setSeet(s1); }
								 */
								System.out.println(
										"------------------------------------------------------------------------------------------------------------------------------");
								System.out.println("Please Wait PDF Generating...........");
								Thread.sleep(5000);
								System.out.println("PDF Generate Successfully...." + pName);
								Thread.sleep(5000);
								System.out.println("I Am Sending Booking Details To Email..... ");
								Thread.sleep(5000);
								System.out.println("Please Wait Checking Your Email Id.......!!");
								Thread.sleep(5000);
								System.out.println("Email Verify Successfully.... " + pName);
								Thread.sleep(5000);
								System.out.println("Sending........");

								String msg = "PNR Number :  " + PNR + "\n" + "Passanger Name  : " + pName.toUpperCase()
										+ "\n" + "Status is : " + "CONFIRM" + "\n" + "Date Of Journey : "
										+ userDetails.getuDOJ() + "\n" + "Sourse : " + userDetails.getuSourse() + "\n"
										+ "Destination : " + userDetails.getuDestination().toUpperCase() + "\n"
										+ "Number of Seet : " + userDetails.getNumberOfSeets() + "\n" + "\n" + "\n"
										+ "\n" + "HAPPY JOURNEY\n" + "Thanks & Regards :  Book My Trip" + "\n"
										+ "Chitrakoot Uttar Pradesh" + "\n" + "Toll Free Number " + "1234567890"
										+ " for more update visite website- www.bookmytrip.com";
								// sendMail.sendemail(pemail, msg, "BUS BOOKING CONFIRMATION");
								Thread.sleep(2000);
								// PDF
								try {

									String path = "E:\\JAVA BATCH 2022 JUNE WS\\BookMyTrip\\src\\main\\java\\pdf\\"
											+ userDetails.getuName().trim().toLowerCase()+".pdf";

									Document d = new Document();

									PdfWriter.getInstance(d, new FileOutputStream(path));

									d.open();
									Paragraph para0 = new Paragraph("Booking Date- :  " + new Date().toLocaleString());

									Paragraph para01 = new Paragraph(
											"            ----------------------------- BUS Booking Successfully Receipt ---------------------------");
									Paragraph para001 = new Paragraph("\n");

									Paragraph para00 = new Paragraph("\n");
									// NUMBER TO WORD CONVERTER
									String numberToWord = NumberToWordConverter.numberToWord(total);

									Paragraph para000 = new Paragraph("PNR NUMBER- :  " + userDetails.getPNR() + "  "
											+ " BOOKING STATUS-: " + "CONFIRM" + "  " + "NUMBER OF SEETS- : "
											+ userDetails.getNumberOfSeets() + "  " + "TOTAL PRICE - :  " + total
											+ " ( " + numberToWord.toUpperCase() + " ONLY" + " )");

									Paragraph para00001 = new Paragraph("BUS NUMBER - :  " + "UP 96 A / " + busId
											+ "  " + " BUS NAME - :  " + busDetails.getbName() + "  "
											+ " BUS TYPE - :  " + busDetails.getbType() + "  " + "BUS PRICE- : "
											+ busDetails.getbPrice());
									Paragraph paratotal = new Paragraph();
									Paragraph para0000 = new Paragraph("\n");
									Paragraph para = new Paragraph(
											"                                                         Welcome To BOOK MY TRIP                                        \n Address-: "
													+ "Sitapur Chitrakoot");
									Paragraph para1 = new Paragraph("Email-: " + "bookmytrip@gmail.com");
									d.add(para0);
									d.add(para);
									d.add(para1);
									d.add(para01);
									d.add(para001);
									d.add(para00001);
									d.add(para00);
									d.add(para000);
									for (int i = 1; i <= pqty; i++) {
										Random random = new Random();
										seetNumber = random.nextInt(100);
										System.out.println(" Passanger " + i + " -" + seetNumber);
										if (seetNumber == 10 || seetNumber == 20 || seetNumber == 30 || seetNumber == 40
												|| seetNumber == 50) {
											Paragraph paraseets = new Paragraph(" Passanger " + i + " SEET NUMBER :-  "
													+ seetNumber + " WINDOW SEETS");
											d.add(paraseets);
										} else {
											Paragraph paraseets = new Paragraph(
													" Passanger " + i + " SEET NUMBER :-  " + seetNumber);
											d.add(paraseets);
										}

									}
									d.add(para0000);

									d.add(paratotal);
									Paragraph para3 = new Paragraph("\n");
									Paragraph para4 = new Paragraph(
											"                        ---------------------------------- Booking Details ---------------------------------");
									Paragraph para5 = new Paragraph("\n");
									d.add(para3);
									d.add(para4);
									d.add(para5);
									// table patient
									PdfPTable pt = new PdfPTable(6);
									PdfPCell c1 = new PdfPCell(new Phrase("Passanger Name"));
									pt.addCell(c1);
									c1 = new PdfPCell(new Phrase("Sourse Station"));
									pt.addCell(c1);
									c1 = new PdfPCell(new Phrase("Destination"));
									pt.addCell(c1);
									c1 = new PdfPCell(new Phrase("Email Id"));
									pt.addCell(c1);
									c1 = new PdfPCell(new Phrase("Date Of Journey"));
									pt.addCell(c1);
									c1 = new PdfPCell(new Phrase("Number Of Seets"));
									pt.addCell(c1);
									pt.setHeaderRows(1);
									pt.addCell(userDetails.getuName().toUpperCase());
									pt.addCell(userDetails.getuSourse().toUpperCase());
									pt.addCell(userDetails.getuDestination().toUpperCase());
									pt.addCell(userDetails.getEmail());
									pt.addCell(doj);
									pt.addCell("" + userDetails.getNumberOfSeets());

									d.add(pt);

									// table payment
									Paragraph para6 = new Paragraph("\n");
									Paragraph para7 = new Paragraph(
											"                       ------------------------- THANK YOU HAPPY JOURNEY --------------------------");
									Paragraph para8 = new Paragraph("\n");
									d.add(para6);
									d.add(para7);
									d.add(para8);
									Paragraph para15 = new Paragraph(
											"                                                      Welcome To Book My Trip                                          \n                                                       Address-: "
													+ "Sitapur Chitrakoot");
									Paragraph para16 = new Paragraph(
											"                                                       Email-: "
													+ "bookmytrip@gmail.com");
									d.add(para15);
									d.add(para16);

									System.out.println("Please Wait..................!!");
								
								
									SendMail sendMail = new SendMail();
									sendMail.sendmailwithattachment(pemail, msg, "BUS BOOKING CONFIRMATION",path);
									//saving user
									UserDetails save = new UserDetails();
									save.BookTrip(userDetails);
									d.close();

								} catch (Exception e) {
									e.printStackTrace();
								}

								// END PDF
								System.out.println(
										"PDF SEND SUCCEESSFULLY........." + "PLEASE CHECK YOUR MAIL " + pemail);
								System.out.println(
										"THANK YOU ........... HAPPY JOURNEY " + " BOOKING COMPLETED...........!!");

							}
						}

						System.out.println("");
						break;
					case 2:
						System.out.println("WELCOME SHOW TICKET");
						/*
						 * System.out.println("ENTER PNR"); int pnr = Integer.parseInt(s.nextLine());
						 */
						UserDetails userDetails = new UserDetails();
						List<UserDetails> viewbookticket = userDetails.VIEWBOOKTICKET();
						
						System.out.println(viewbookticket);
						//userDetails.VIEWBOOKTICKET();
						/*
						 * UserDetails userDetails = new UserDetails(); List<UserDetails> viewbookticket
						 * = userDetails.VIEWBOOKTICKET(); for (UserDetails userDetails2 :
						 * viewbookticket) { System.out.println(userDetails2); }
						 */

						break;
					case 4:
						bus = false;
						break;

					default:
						System.out.println("INVALID OPTION");
						break;
					}
				}

				break;
			case 2:
				System.out.println("WELCOME FLIGHT BOOKING");
				System.out.println("PENDING... ");
				break;
			case 3:
				System.out.println("WELCOME TRAIN BOOKING");
				System.out.println("PENDING... ");
				break;

			default:
				System.out.println("INVALID OPTION");
				break;
			}

		}

	}
}
