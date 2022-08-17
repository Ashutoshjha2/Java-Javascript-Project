package com.idcard;

import java.util.Random;
import java.util.Scanner;

import com.idcard.entity.RegisterOrLogin;
import com.idcard.entity.dao.RegisterOrLoginImpl;

public class ID_CARD_GENERATOR 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	Scanner s = new Scanner(System.in);
        System.out.println("<<<<<<<<<<<<<<<<<WELCOME TO IDCARD_GENERATOR SYSTEM>>>>>>>>>>>>>>>>>>" );
        boolean register = true;
        while (register) {
			System.out.println("PRESS 1- REGISTER");
			System.out.println("PRESS 2- LOGIN");
			System.out.println("PRESS 3- EXIT");
			System.out.println("..................ENTER THE OPTION............");
			int registerOption= Integer.parseInt(s.nextLine());
			switch (registerOption) {
			case 1:
				System.out.println("WELCOME TO REGISTER FORM");
				Thread.sleep(1000);
				System.out.println("ENTER THE USER NAME");
				String username =s.nextLine();
				System.out.println("ENTER THE USER PASSWORD");
				String userpassword= s.nextLine();
				System.out.println("ENTER THE USER ACCOUNT TYPE "+" admin or user");
				String accounttype = s.nextLine();
				RegisterOrLogin registerOrLogin = new RegisterOrLogin( );
				Random random = new Random();
				int registerId = random.nextInt(99);
				registerOrLogin.setUserName(username);
				registerOrLogin.setUserPassword(userpassword);
				registerOrLogin.setAccountStatus("ACTIVE");
				registerOrLogin.setUserStatus(accounttype);
				registerOrLogin.setRegisterID(registerId);
				RegisterOrLoginImpl registerOrLoginImpl = new RegisterOrLoginImpl();
				registerOrLoginImpl.RegisterUser(registerOrLogin);
				break;
				case 2:
					System.out.println("ENTER USER NAME");
					String name= s.nextLine();
					System.out.println("ENTER PASSWORD");
					String password = s.nextLine();
					RegisterOrLoginImpl impl = new RegisterOrLoginImpl();
					impl.LoginUser(name.toLowerCase().trim(), password.toLowerCase().trim());
					break;
                case 3:
                	register = false;
                	System.out.println("THNAK YOU FOR USING MY APPLICATION ");
                	break;
			default:
				System.out.println("INVALID OPTION");
				break;
			}
		}
    }
}
