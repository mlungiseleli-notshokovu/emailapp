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
		System.out.println("Enter your last name: ");
		lastName = kb.nextLine();
		
		//Add firstname and lastname to Email object
		email = new Email(firstName, lastName);
		//System.out.println(email.showInfo());
		System.out.println("-------------------------------");
		System.out.println("More options:\n1. Add an alternate email\n2. Change password\n0. to quit.");
		int choice = kb.nextInt();
		if(choice==1) {
			System.out.println("Enter an alternate email: ");
			String altEmail = kb.nextLine();
			email.setAlternateEmail(altEmail);
		}
		else if(choice == 2) {
			System.out.println("Enter new password: ");
			String pass = kb.nextLine();
			email.changePassword(pass);
		}
		else {
			System.out.println("Thank you. Have a good day!");
		}
		kb.close();
	}

}
