package com.petshop.utils;

import org.mindrot.jbcrypt.BCrypt;

public class CustomerUtils {

	public static String hashPassword(String password) {
		
		String hashedPassword = null;
			
		hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
		
		return hashedPassword;
	}
	
	
	public static boolean passwordMatchesHash(String password, String hashedPassword) {
		
		
		if(BCrypt.checkpw(password, hashedPassword)) {
			return true;
		}
		
		return false;
	}
	
	
}
