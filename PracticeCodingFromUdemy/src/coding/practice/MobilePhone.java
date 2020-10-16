package coding.practice;

import java.util.Scanner;

public class MobilePhone {

	private static Scanner kbd = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a program that implements a simple mobile phone with the following
		// capabilities.
		// Able to store, modify, remove and query contact names.
		// You will want to create a separate class for Contacts (name and phone
		// number).
		// Create a master class (MobilePhone) that holds the ArrayList of Contacts
		// The MobilePhone class has the functionality listed above.
		// Add a menu of options that are available.
		// Options: Quit, print list of contacts, add new contact, update existing
		// contact, remove contact
		// and search/find contact.
		// When adding or updating be sure to check if the contact already exists (use
		// name)
		// Be sure not to expose the inner workings of the Arraylist to MobilePhone
		// e.g. no ints, no .get(i) etc
		// MobilePhone should do everything with Contact objects only.
		System.out.println("Please select from the choices use number: ");
		printChoices();

		boolean flag = true;

		while (flag) {
			int options = kbd.nextInt();
			kbd.nextLine();
			switch (options) {
			case 0: 
				printChoices();
				break;
			
			case 1:
				Contacts.displayAll();
				printChoices();
				break;
			case 2:
				System.out.println("Enter name of contact: ");
				String bbb= kbd.nextLine();
				addContact(bbb);
				printChoices();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 9:
				System.out.println("Program Exit");
				flag = false;
				break;
			default:
				System.out.println("Invalid selection, please try again");
				break;
			}

		}
	}
	
	public static void printChoices() {
		System.out.println("Enter 0 for options menu, 1 for list of contacts, 2 to add new contacts, 3 update existing contact "
				+ "4 remove contact, 5 search contact, 9 to quit");
	}
	
	public static void addContact(String bbb) {
		Contacts.addContact(bbb);
	}

}
