package com.ebs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

import com.ebs.entity.BillingGenerated;
import com.ebs.entity.ConnectionDetails;
import com.ebs.entity.ConnectionRequests;
import com.ebs.entity.Register;

public class RegisterDaoimpl implements RegisterDao {

	public void RegisterUser(Register register) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/electricity-billing-system", "root", "root");
			PreparedStatement statement = connection
					.prepareStatement("insert into registration values (?,?,?,?,?,?,?,?)");
			statement.setInt(1, register.getrId());
			statement.setString(2, register.getFirstname());
			statement.setString(3, register.getLastName());
			statement.setString(4, register.getEmail());
			statement.setString(5, register.getPassword());
			statement.setString(6, register.getAddress());
			statement.setInt(7, register.getMobile());
			statement.setString(8, register.getAccouttype());
			int k = statement.executeUpdate();
			if (k > 0) {
				System.out.println("REGISTER SUCCESSFULLY....!!");
				System.out.println("PLEASE SAVE REGISTRATION ID -: " + register.getrId());
			} else {
				System.out.println("SOMETHING WENT WRONG....." + "IF ANY SUPPORT CALL ADMIN TEAM- 1234567890");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void LoginUser(int registrtionId, String password) {
		try {
			Scanner s = new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/electricity-billing-system", "root", "root");
			String sql = "select * from registration where rid=? and password=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, registrtionId);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				System.out.println("Please Wait....!!");
				Thread.sleep(2000);
				resultSet.getString(2);
				if (resultSet.getString(8).equals("admin")) {
					boolean admin = true;
					while (admin) {
						System.out.println(
								"----------------------WELCOME TO ELECTRICITY BILLING SYSTEM DASHBOARD ADMIN-: "
										+ resultSet.getString(2) + "------------\n");
						System.out.println("PRESS 1- SHOW REQUESTS FOR ALL NEW CONNECTION ");
						System.out.println("PRESS 2- ACCEPT THE CONNECTION ");
						System.out.println("PRESS 3- SHOW ALL CONNECTIONS");
						System.out.println("PRESS 4- GENERATE BILL");
						System.out.println("PRESS 5- ACTIVATE OR DEACTIVE ACCOUNT AND CLOSE CONNECTION");
						System.out.println("PRESS 6- LOGOUT");
					
						System.out.println("...................ENTE THE OPTION .....................");
						int adminoption = Integer.parseInt(s.nextLine());
						switch (adminoption) {
						case 1:
							try {
								Class.forName("com.mysql.jdbc.Driver");
								Connection connection1 = DriverManager.getConnection(
										"jdbc:mysql://localhost:3306/electricity-billing-system", "root", "root");
								String sql1 = "select * from connectionrequest";
								 Statement  statement = connection1.createStatement();
								 ResultSet resultSet1 = statement.executeQuery(sql1);
								while (resultSet1.next()) {
									if (resultSet1.getString(7).equals("PENDING")) {
										System.err.println(
												"----------------------------------ALL CONNECTIONS REQUESTS-----------------------------------");
										System.out.printf("%5s %12s %15s %15s %18s %20s", "R-ID", "FULL-NAME",
												"ADDRESS", "MOBILE", "REQUEST-DATE", "REQUEST-STATUS");
										System.out.println();
										System.out.println(
												"---------------------------------------------------------------------------------------------");
										System.out.format("%5s %12s %16s %12s %18s %13s", resultSet1.getInt(1),
												resultSet1.getString(2), resultSet1.getString(4), resultSet1.getString(6),
												resultSet1.getString(8), resultSet1.getString(7));
										System.out.println();

										System.out.println(
												"----------------------------------------------------------------------------------------------");
									}
									
								}
							} catch (Exception e) {
								e.printStackTrace();
							}

							break;
							
							case 2:
								System.out.println("ENTER THE USER REQUEST ID");
								int rid= Integer.parseInt(s.nextLine());
								ConnectionRequestImpl connectionRequestImpl = new ConnectionRequestImpl();
								connectionRequestImpl.ConnectionStatusUpdate(rid);
								
								break;
								
								case 3:
									ConnectionDetailsDaoImpl connectionDetailsDaoImpl = new ConnectionDetailsDaoImpl();
									connectionDetailsDaoImpl.ShowAllActiveConnection();
									break;
									
							 case 4:
								 System.out.println("ENTER ACCOUNT NUMBER");
								 int account = Integer.parseInt(s.nextLine());
								 BillingGeneratingDaoImpl billingGeneratingDaoImpl = new BillingGeneratingDaoImpl();
								 billingGeneratingDaoImpl.GenerateBillByAccount(account);
								 break;
						case 6:
							admin = false;
							System.out.println("THANK YOU USING MY APPLICATION......!!");
							break;
						default:
							System.out.println("invalid option");
							break;
						}
					}

				} else { // USER DASHBOARD
					System.out.println("----------------------WELCOME TO ELECTRICITY BILLING SYSTEM DASHBOARD USER-:  "
							+ resultSet.getString(2) + "-----------------\n");

					boolean user = true;
					while (user) {
						System.out.println("PRESS 1- REQUEST FOR NEW CONNECTION");
						System.out.println("PRESS 2- SHOW CONNECTION DETAILS");
						System.out.println("PRESS 3- SHOW BILL");
						System.out.println("PRESS 4- UPDATE PROFILE");
						System.out.println("PRESS 5- REQUEST ACTIVATE / DEACTIVATE ACCOUNT  ");
						System.out.println("PRESS 6- LOGOUT");
						
						System.out.println("...................ENTER THE OPTION .....................");
						int useroption = Integer.parseInt(s.nextLine());
						switch (useroption) {
						case 1:

							System.out.println("PLEASE WAIT...");
							Thread.sleep(3000);
							System.out.println("SENDING REQUEST.......");
							Thread.sleep(3000);
							// creating object Connection request class
							ConnectionRequests connectionRequests = new ConnectionRequests();
							connectionRequests.setRegistrationId(resultSet.getInt(1));
							connectionRequests.setAddress(resultSet.getString(6));
							connectionRequests.setEmail(resultSet.getString(4));
							connectionRequests.setfName(resultSet.getString(2));
							connectionRequests.setLname(resultSet.getString(3));
							connectionRequests.setMobile(resultSet.getInt(7));
							connectionRequests.setRequestDate(new Date().toLocaleString());
							connectionRequests.setRequestStatus("PENDING");
							// creating object for connection request dao impl
							ConnectionRequestImpl connectionRequestImpl = new ConnectionRequestImpl();
							connectionRequestImpl.ConnectionRequest(connectionRequests);
							break;
							case 2:
								ConnectionDetails connectionDetails  = new ConnectionDetails();
								connectionDetails.setRegistrationId(resultSet.getInt(1));
								ConnectionDetailsDaoImpl connectionDetailsDaoImpl = new ConnectionDetailsDaoImpl();
								
								connectionDetailsDaoImpl.ShowConnectionUserConnectionDetails(connectionDetails);
								break;
								
						 case 3:
							 BillingGenerated billingGenerated = new BillingGenerated();
							 billingGenerated.setRid(resultSet.getInt(1));
							 BillingGeneratingDaoImpl  billingGeneratingDaoImpl = new BillingGeneratingDaoImpl();
									 billingGeneratingDaoImpl.ShowBillByAccount(billingGenerated);
							 
							 break;
						case 6:
							user = false;
							System.out.println("LOGOUT SUCCESSFULLY...\n");
							System.out.println("THANK YOU USING MY APPLICATION....!!");
							break;
						default:
							System.out.println("invalid option");
							break;
						}
					}
				}
			} else {
				System.out.println("LOGIN FAILED...!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
