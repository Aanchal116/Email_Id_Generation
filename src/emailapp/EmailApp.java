package emailapp;

import java.util.Scanner;


public class EmailApp {

	public static void main(String[] args) {
		
		String firstname , lastname;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your firstname and lastname: ");
		firstname = obj.next();
		lastname = obj.next();
		Email object = new Email(firstname , lastname);
		
    }
}


