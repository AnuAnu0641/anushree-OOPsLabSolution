package com.newhire.employee;

import java.util.Scanner;

public class Department {
	String department;
	public String deprt() {
	System.out.println("\nPlease enter Number of your department : \n1. Technical \n2. Admin \n3. Human Resource \n4. Legal");
	Scanner in = new Scanner(System.in);
	int departmentNumber = in.nextInt();
	switch(departmentNumber) {
		case 1 : department = "tech"; break;
		case 2 : department = "admin"; break;
		case 3 : department = "hr"; break;
		case 4 : department = "legal"; break;
		default : System.out.println("Invalid input.\nPlease enter correct department number."); deprt();
	}
	return department;
}
}
