package com.ebs;

import java.util.Random;
import java.util.Scanner;

import com.ebs.dao.RegisterDaoimpl;
import com.ebs.entity.Register;

public class ElectricityBillingSystem 
{
    public static void main( String[] args )
    {
    	Scanner s = new Scanner(System.in);
        System.out.println( "---------------------WELCOME TO ELECTRICITY BILLING SYSTEM -------------------------" );
        boolean option = true;
        while (option) {
			System.out.println("PRESS 1 REGISTRATION ");
			System.out.println("PRESS 2 LOGIN");
			System.out.println("PRESS 3 EXIT");
			System.out.println("----------------------------ENTER THE OPTION-----------------------------");
			int inneroption = Integer.parseInt(s.nextLine());
			switch (inneroption) {
			case 1:
				System.out.println("-----------------------------WELCOME TO REGISTRATION PANEL----------------------");
				System.out.println("ENTER THE FIRST NAME");
				String fname= s.nextLine();
				System.out.println("ENTER THE LAST NAME");
				String lname= s.nextLine();
				System.out.println("ENTER THE EMAIL");
				String email= s.nextLine();
				System.out.println("CREATE PASSWORD");
				String password= s.nextLine();
				System.out.println("ENTER THE ADDRESS");
				String address= s.nextLine();
				System.out.println("ENTER THE MOBILE");
				int mobile = Integer.parseInt(s.nextLine());
				System.out.println("ENTER THE ACCOUNT-TYPE "+ " admin or user");
				String accounttype= s.nextLine();
				//ID CREATION
				Random random = new Random();
				int registrationid = random.nextInt(99999);
				//CREATING OBJECT FOR REGISTER CLASS
				Register register = new Register();
				register.setrId(registrationid);
				register.setAccouttype(accounttype.trim().toLowerCase());
				register.setAddress(address);
				register.setEmail(email);
				register.setFirstname(fname);
				register.setLastName(lname);
				register.setMobile(mobile);
				register.setPassword(password);
				//CREATING OBJECT OF IMPL CLASS AND SAVE THE DATA
				RegisterDaoimpl registerDaoimpl = new RegisterDaoimpl();
				registerDaoimpl.RegisterUser(register);
				
				break;
				case 2:
					System.out.println("-------------------WELCOME TO LOGIN PANEL-----------------\n");
					System.out.println("ENTER THE REGISTRATION ID");
					int rid = Integer.parseInt(s.nextLine());
					System.out.println("ENTER THE PASSWORD");
					String pass = s.nextLine();
					RegisterDaoimpl registerDaoimpllogin = new RegisterDaoimpl();
					registerDaoimpllogin.LoginUser(rid, pass);
					
					break;
					case 3:
						option = false;
						System.out.println("THANK YOU .....!! " +"GOOD BYE...");
						break;

			default:
				System.out.println("INVALID OPTION");
				break;
			}
		}
    }
}
