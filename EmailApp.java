package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String firstName, lastName;
		//initialise Email object
		Email email;
		//Prompt for firstname and lastname
		System.out.println("Enter your first name: ");
		firstName = kb.nextLine();
		System.out.println("Enter your lasst name: ");
		lastName = kb.nextLine();
		
		//Add firstname and lastname to Email object
		email = new Email(firstName, lastName);
	}

}
