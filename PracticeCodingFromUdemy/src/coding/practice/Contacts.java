package coding.practice;

import java.util.ArrayList;
import java.util.List;

public class Contacts {

	private static List<String> contacts = new ArrayList<String>();

	static int position;

	public static boolean validator(String name) {
		boolean flag = false;
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

	public static void updateContact(String oldName, String newName) {
		if (contacts.size() != 0) {
			if (validator(oldName)) {
				if(validator(newName)) {
				System.out.println("New contact: Duplicate did not add");
				}else {
					position = contacts.indexOf(oldName);
					contacts.remove(position);
					contacts.add(position, newName);
					System.out.println("Contact successfully updated");
				}
			}else {
				System.out.println("Old Contact does not exists");
			}
		} else {
			System.out.println("No contact exists");

		}
	}

	public static void deleteContact(String delete) {
		if(contacts.size() != 0) {
		if(validator(delete)) {
			int deletePosition = contacts.indexOf(delete);
			contacts.remove(deletePosition);
			System.out.println("Contact deleted");
		}else {
			System.out.println("No contact detail that mached with " +delete +" to be deleted.");
		}
	}else {
		System.out.println("Contacts is empty");
	}
	}
}
