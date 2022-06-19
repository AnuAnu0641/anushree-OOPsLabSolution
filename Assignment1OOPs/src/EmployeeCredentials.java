// java program to provide Email Id and Password for new employees of ABC private limited company

import java.util.*;

class Employee{
	String firstName, lastName, department;
	Employee(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String depart() {
		System.out.println("\nPlease enter Number of your department : \n1. Technical \n2. Admin \n3. Human Resource \n4. Legal");
		Scanner in = new Scanner(System.in);
		int dept = in.nextInt();
		switch(dept) {
			case 1 : department = "tech"; break;
			case 2 : department = "admin"; break;
			case 3 : department = "hr"; break;
			case 4 : department = "legal"; break;
			default : System.out.println("Invalid input.\nPlease enter correct department number."); depart();
		}
		return department;
	}
}
class CredentialServices extends Employee{
	String email;
	CredentialServices(String firstName, String lastName) {super(firstName, lastName);}
	public void generateEmailAddress() {
		email = firstName.toLowerCase()+lastName.toLowerCase()+"@"+depart()+".abc.com";
	}
	public void generatePassword() {
		PasswordGenerator p = new PasswordGenerator();
		char[] password =  p.generatePassword();
		System.out.println(password);
	}
	public void showCredentials() {
		System.out.println("\nDear "+firstName+" your generated credentials are as follows : ");
		System.out.println("Email ------> "+email);
		System.out.print("Password ---> "); generatePassword();
	}
}
public class EmployeeCredentials {
	public static void main(String[] args) {
		System.out.println("Welcome to ABC private limited.\n");
		System.out.println("Follow the steps below to receive your Login Id and Password.\n");
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your full name as per your ID Proof : ");
		String name = input.nextLine();
		String[] arr = name.split(" ");
		CredentialServices c = new CredentialServices(arr[0],arr[arr.length-1]);
		c.generateEmailAddress();
		c.showCredentials();
	}
}



