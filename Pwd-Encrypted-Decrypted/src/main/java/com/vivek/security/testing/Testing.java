package com.vivek.security.testing;

import java.util.Scanner;

import com.vivek.security.Encoding_Decoding;

public class Testing {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE PWD");
		String enpwd = s.nextLine();
		String encodingPwd = Encoding_Decoding.EncodingPwd(enpwd);
		System.out.println("ENCODING - "+encodingPwd);
		System.out.println("ENTER THE ENCRYPTED VALUE TO DECRYPT");
		String decpwd = s.nextLine();
		String decodingPwd = Encoding_Decoding.DecodingPwd(decpwd);
		
		System.out.println("DECODING - "+decodingPwd);
		
		
		
	}

}
