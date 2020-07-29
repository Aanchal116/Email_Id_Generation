package emailapp;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Email {
	
	Scanner obj = new Scanner(System.in);
	
    private String firstname;
	private String lastname;
	private int defaultpasswordlength = 10;
	private String department;
	private String password;
	private String email;
	private String company ="java.com";
	private String alternateEmail;
	
	
	//constructor
	public Email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("Welcome " + this.firstname + " " + this.lastname);
		
		//Call function for choice of department
		this.department = departmentChoice();
		System.out.println("Department: "+ this.department);
		
		//Create an email
		email = firstname.toLowerCase() + lastname.toLowerCase()+ "@"+department+"."+company;
		System.out.println("Your emailid is: "+ email);
		
		//Call function for random password generation
		password = passwordGenerate(defaultpasswordlength);
		System.out.println("Your password is: "+ password);
		
		//Set an alternate email
		altEmail();
		
		//Change Password
		passwordSet();
		
		//Print all info
		getInfo();
		
	}
	
	
	//Choosing the department
	private String departmentChoice() {		
		String department ="/0";
		System.out.println("Department Choices:");
		System.out.println("1.Sales  \n2.Accounts  \n3.Technical  \n4.None");
		System.out.println("Enter your choice: ");
		int choice = obj.nextInt();
	      if(choice == 1)
				department = "sales";
	      else if(choice == 2)
	    	  department = "accounts";
	      else if(choice == 3)
	    	  department =  "technical";
	      else if(choice == 4)
	    	  department = "";
	      else
	    	  System.out.println("Invalid Choice: Please enter the correct choice");
	      return new String(department);
	      }
	      

	
	//Generate random password
	private String passwordGenerate(int length) {
		String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$!";
		char[] password = new char[length];
		for(int i=0; i<length;i++) {
			int number = (int)(Math.random() * passwordset.length());
			password[i] = passwordset.charAt(number);
		}
		return new String(password);
	}
	
	
	
	//Alternate Email
	private void altEmail() {
		System.out.println("Please enter an alternate email: ");
		alternateEmail = obj.next();
		System.out.println("The alternate email has been set to: " + alternateEmail);
	}
	
	
	
	//Change password
	private void passwordSet() {
		System.out.println("Do you wish to change your password now? \nPress Y or N");
		String choice = obj.next();
		if(choice.equals("Y") || choice.equals("y")) {
			System.out.println("Please enter the new password: ");
			password = obj.next();
		}
		else if(choice.equals("N") || choice.equals("n")) {
			System.out.println("Thankyou for your choice");
		}
		else {
			System.out.println("Please provide a valid input.");
		}
	}
	
	//Provide Summary
	private void getInfo() {
		System.out.println("Here's the summary of your complete profile: ");
		System.out.println("Name: " + firstname + " " + lastname);
		System.out.println("E-mail id: "+ email);
		System.out.println("Password: "+ password + "\nAlternate Email: " + alternateEmail);
		System.out.println("Thankyou for your time! Have a great day!");
	}

}
