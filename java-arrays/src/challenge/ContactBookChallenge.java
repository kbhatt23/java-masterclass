package challenge;

import java.util.Scanner;

public class ContactBookChallenge {
	private static Scanner scanner = new Scanner(System.in);
	private ContactBook contactBook = new ContactBook();

public static void main(String[] args) {
	ContactBookChallenge obj = new ContactBookChallenge();
	
	obj.printInstructions();
	boolean quit = false;
	while(!quit) {
		if(scanner.hasNextInt()) {
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				obj.createNEwContact();
				break;
			case 2:
				obj.updateWithName();
				break;
			case 3:
				obj.updateWithPhoneNumber();
				break;
			case 4:
				obj.removeContact();
			case 5 :
				obj.printAllContacts();
				break;
			case 0:
				obj.printInstructions();
				break;
			case 6:
				System.out.println("Thanks for using our contact book app");
				quit = true;
				break;
			default:
				break;
			}
		}else {
			System.err.println("Please enter valid option");
		}
		scanner.nextLine();
	}
	
	scanner.close();
}

	private void printAllContacts() {
		
		contactBook.printAllContacts();
}

	private void removeContact() {
		System.out.println("Please enter contact number to delete");
		int option = scanner.nextInt();
		contactBook.deleteContact(option);
		System.out.println("Contact deleted");
		printInstructions();
}

	private void updateWithName() {
		System.out.println("Please enter name: ");
		String name = scanner.next();
		System.out.println("Please enter new phoneNumber: ");
		String newPhoneNumber = scanner.next();	
		contactBook.updateContactPhone(name, newPhoneNumber);
		System.out.println("Contact updated");
		printInstructions();
}
	
	private void updateWithPhoneNumber() {
		System.out.println("Please enter new name: ");
		String newName = scanner.next();
		System.out.println("Please enter phoneNumber: ");
		String phoneNumber = scanner.next();	
		contactBook.updateContactName(phoneNumber, newName);
		System.out.println("Contact updated");
		printInstructions();
}

	private void createNEwContact() {
		System.out.println("Please enter name: ");
		String name = scanner.next();
		System.out.println("Please enter phoneNumber: ");
		String phoneNumber = scanner.next();
		contactBook.addContact(name, phoneNumber);
		System.out.println("Phone Number added");
		printInstructions();
}

	private void printInstructions() {
		System.out.println("Type 1 for creating new contact");
		System.out.println("Type 2 for updating contact with name");
		System.out.println("Type 3 for updating contact with phoneNumber");
		System.out.println("Type 4 to remove a contact");
		System.out.println("Type 5 to print all contacts");
		System.out.println("Type 6 to quit");
		System.out.println("Type 0 to print all instructions");
		System.out.println("Kindly enter your choice");
	}
}
