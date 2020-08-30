package challenge;

import java.util.ArrayList;
import java.util.List;

public class ContactBook {

	private final  List<Contact> contacts = new ArrayList<Contact>();

	public void addContact(String name, String phoneNumber) {
		Contact addedContact = new Contact(name, phoneNumber);
		if(!contacts.isEmpty() && contacts.indexOf(addedContact) < 0) {
			System.err.println("Contact already exist");
		}else {
			contacts.add(addedContact);
		}
	}

	public void printAllContacts() {
		if (contacts.isEmpty()) {
			System.out.println("No Contacts present");
		} else {
			int index = 0;
			for(; index < contacts.size() ; index++) {
				Contact contact = contacts.get(index);
				System.out.println((index+1) + ". Contact found "+contact);
			}
		}
	}

	public void updateContactPhone(String name, String newPhoneNumber) {
		if (contacts.isEmpty()) {
			System.out.println("No Contacts present");
		} else {
			System.out.println("name to update "+name + " with new phone number "+newPhoneNumber);
			for(Contact contact: contacts) {
				if(contact.getName().equals(name)) {
					contact.setPhoneNumber(newPhoneNumber);
				}
			}
			System.out.println("All contacts updated");
		}
	}
	
	public void updateContactName(String phoneNumber, String newName) {
		if (contacts.isEmpty()) {
			System.out.println("No Contacts present");
		} else {
			System.out.println("name to update "+newName + " with new phone number "+phoneNumber);
			for(Contact contact: contacts) {
				if(contact.getPhoneNumber().equals(phoneNumber)) {
					contact.setName(newName);
				}
			}
			System.out.println("All contacts updated");
		}
	}
	
	public void deleteContact(int index) {
		contacts.remove(index-1);
	}
}
