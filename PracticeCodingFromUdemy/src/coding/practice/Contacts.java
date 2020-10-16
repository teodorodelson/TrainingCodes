package coding.practice;

import java.util.ArrayList;
import java.util.List;

public class Contacts {

	private static List<String> contacts = new ArrayList<String>();

	static int position;
	static boolean flag = false;

	private static boolean validator(String name) {
		if (contacts.contains(name)) {
			flag = true;
			return flag;
		}
		return flag;
	}

	public static void addContact(String name) {
		if (!validator(name)) {
			contacts.add(name);
			System.out.println("Contact added");
		} else if (validator(name)) {
			System.out.println("Contact already exist");
		}
	}

	public static void displayAll() {
		System.out.println("List of contacts: " + contacts.toString());
	}
}
