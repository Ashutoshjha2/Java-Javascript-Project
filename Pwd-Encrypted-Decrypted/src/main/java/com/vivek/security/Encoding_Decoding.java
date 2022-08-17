package com.vivek.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

/**
 * Vivek Raikawar@11-08-2022
 *
 */
public class Encoding_Decoding {
	// Encoding
	public static String EncodingPwd(String pwd) {

		Encoder encoder = Base64.getEncoder();
		String encodeToString = encoder.encodeToString(pwd.getBytes());
		return encodeToString;
	}

	// decoding
	public static String DecodingPwd(String pwd) {

		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(pwd);
		return new String(decode);
	}

}
