package com.newhire.driver;

import java.util.Scanner;
import com.newhire.employee.*;
import com.newhire.service.CredentialsService;
public class MainClass {
	
	public static void main(String[] args) {
		System.out.println("Welcome to ABC private limited.\n");
		System.out.println("Follow the steps below to receive your Login Id and Password.\n");
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your full name as per your ID Proof : ");
		String name = input.nextLine();
		String[] arr = name.split(" ");
		Employee employee = new Employee(arr[0],arr[arr.length-1]);
		String firstName = employee.getFirstName();
		String lastName = employee.getLastName();
		Department d = new Department();
		CredentialsService c = new CredentialsService();
		c.generatePassword();
		c.generateEmailAddress(firstName, lastName);
		c.showCredentials(employee);
	}

}
