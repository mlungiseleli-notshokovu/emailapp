package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName, lastName, password, department, email, alternateEmail;

	private int mailboxCapacity = 500;
	
	//Constructor to receive the firstname and lastname
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		this.password = generatePassword();
		
		//combine elements to generate email
		if(this.department.length()>1) {
			this.email = this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.department+".xyzcompany.com";
		}
		else {
			this.email = this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@xyzcompany.com";
		}
		//System.out.println("Your email is: "+this.email);
		//System.out.println("Your password is: "+this.password);
	}
	
	//Ask for the department
	private String setDepartment() {
		System.out.print("Department codes:\n0 for none\n1 for Sales\n2 for Development\n3 for Accounting\nEnter department code: ");
		Scanner en = new Scanner(System.in);
		int choice = en.nextInt();
		
		if(choice == 1) {
			return "sales";
		}
		else if(choice == 2) {
			return "dev";
		}
		
		else if(choice == 3) {
			return "acct";
		}
		
		else {
			return "";
		}
	}
	//Generate a random password
	private String generatePassword() {
		
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXY0Z123456789!@#$%^&*()_+=";
		char[] password = new char[8];
		
		for(int i=0; i<8; i++) {
			int random = (int)(Math.random()* passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		
		return new String(password);
		
	}
	
	//Set the mailbox capacity
	public void setMailboxCapacity(int cap) {
		this.mailboxCapacity = cap;
	}
	
	//Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Get methods
	public int getMailboxCapacity() {
		return this.mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return this.alternateEmail;
	}
	
	public String getPassword() {
		return this.password;
	}

	public String showInfo() {
		System.out.println("");
		return "DISPLAY NAME: "+this.firstName+" "+this.lastName+"\nEMAIL: "+this.email+"\nPASSWORD: "+this.password+"\nMAILBOX CAPACITY: "+this.mailboxCapacity+"mb";
	}
}
