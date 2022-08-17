package com.idcard.entity.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import com.idcard.entity.ID_CARD_Details;
import com.idcard.entity.RegisterOrLogin;

public class RegisterOrLoginImpl implements IRegisterOrLogin {

	public void RegisterUser(RegisterOrLogin registerOrLogin) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/idcardgenerator", "root",
					"root");
			PreparedStatement statement = connection.prepareStatement("insert into registerorlogin values (?,?,?,?,?)");
			statement.setInt(1, registerOrLogin.getRegisterID());
			statement.setString(2, registerOrLogin.getUserName());
			statement.setString(3, registerOrLogin.getUserPassword());
			statement.setString(4, registerOrLogin.getUserStatus());
			statement.setString(5, registerOrLogin.getAccountStatus());
			int k = statement.executeUpdate();
			if (k > 0) {
				System.out.println("REGISTER SUCCESSFULLY....!!");
			} else {
				System.out.println("SOMETHING WENT WRONG....." + "IF ANY SUPPORT CALL ADMIN TEAM- 1234567890");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void LoginUser(String userName, String password) {
		try {
			Scanner s = new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/idcardgenerator", "root",
					"root");
			String sql = "select * from registerorlogin where username=? and password=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				System.out.println("Please Wait....CHECHING YOUR ID PASSWORD");
				Thread.sleep(3000);
				resultSet.getString(2);
				if (resultSet.getString(4).equals("admin")) {
					System.out.println("WELCOME - " + resultSet.getString(2)+"\n");
					boolean inner = true;
					while (inner) {
						System.out.println("PRESS 1- CREATE NEW ID CARD");
						System.out.println("PRESS 2- SHOW ALL ID CARD");
						System.out.println("PRESS 3- UPDATE ID CARD");
						System.out.println("PRESS 4- DELETE ID CARD");
						System.out.println("PRESS 5- LOGOUT");
						Thread.sleep(2000);
						System.out.println("...................ENTE THE OPTION .....................");
						int inneroption = Integer.parseInt(s.nextLine());
						switch (inneroption) {
						case 1:
							Random random = new Random();
							int cardNumber = random.nextInt(99999999);
							Random r = new Random();
							int empid = r.nextInt(99999);
							System.out.println(" WELCOME TO ID CARD GENERATOR SYSTEM PANEL ");
							Thread.sleep(2000);
							System.out.println("Enter the EMP NAME");
							String empname= s.nextLine();
							System.out.println("Enter the EMP DEPT NAME");
							String empdept = s.nextLine();
							System.out.println("Enter the EMP MOBILE NUMBER");
							int mobile = Integer.parseInt(s.nextLine());
							System.out.println("Enter the EMP ADDRESS");
							String address = s.nextLine();
							System.out.println("Enter the EMP BLOOD GROUP");
							String blood = s.nextLine();
							System.out.println("Enter the EMP AGE");
							int age=  Integer.parseInt(s.nextLine());
							ID_CARD_Details card_Details = new ID_CARD_Details();
							card_Details.setAddress(address);
							card_Details.setAge(age);
							card_Details.setBloodgroup(blood);
							card_Details.setDateOfJoning(new Date().toLocaleString());
							card_Details.setEmpDept(empdept);
							card_Details.setEmpName(empname);
							card_Details.setIssueDatecard(new Date().toLocaleString());
							card_Details.setMobile(mobile);
							card_Details.setEmpId(empid);
							card_Details.setIdCardNo(cardNumber);
							IID_CARD_DetailsImpl detailsImpl = new IID_CARD_DetailsImpl();
							detailsImpl.GeneratorID_Card(card_Details);
							
							break;
                          case 5 :
                        	  inner = false;
                        	  System.err.println("THNAK YOU FOR USING MY APPLICATION ");
                        	  break;
						default:
							System.out.println("Invalid Option");
							break;
						}
					}
					
				} else {
					System.out.println("USER LOGIN");
					System.out.println("WELCOME - " + resultSet.getString(2));
				}

			} else {
				System.out.println("USER ID OR PASSWORD WRONG......");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
