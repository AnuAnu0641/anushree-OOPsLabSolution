package com.newhire.service;

import java.util.Random;
import com.newhire.employee.*;

public class CredentialsService implements ICredentialsService{
	String email;
	Department d = new Department();
	@Override
	public String generatePassword() {
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[8];

	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i< 8 ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      String str = new String();
	      String string = str.valueOf(password);
	      return string;
	      
	}



	@Override
	public void generateEmailAddress(String firstName, String lastName) {
		email= firstName.toLowerCase()+lastName.toLowerCase()+"@"+d.deprt()+".abc.com";
	}

	@Override
	public void showCredentials(Employee employee) {
		System.out.println("\nDear "+employee.getFirstName()+" your generated credentials are as follows : ");
		System.out.println("Email ------> "+email);
		System.out.print("Password ---> "+ generatePassword());
		
	}

}
