package Task3ContactApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import organisationlist.OrganizationDetails;

public class DeleteContact {

	public static void delContact(ArrayList<ContactDetails> contact_list ) {
		Scanner input = new Scanner(System.in);
		int contact_count = 0;
		boolean presence = false ;
		ArrayList<ContactDetails> arr = new ArrayList<ContactDetails>();
		String name;
		String number;
		System.out.println("👉 Enter name to delete contact");
		name = input.next();
		for (int i = 0; i < contact_list.size(); i++) {
			if (((ContactDetails) contact_list.get(i)).getName().equals(name)) {
				presence = true ;
				contact_count++;
				((ContactDetails) contact_list.get(i)).viewContact();
				arr.add(contact_list.get(i));
				System.out.println();
				System.out.println("_______________________________________");
				System.out.println();
			}
		}
		if(presence == false) {System.out.println("Entered name is not in contact list");}
		if (contact_count > 1) {
			System.out.println(String.format("\"There are %s contacts matched ! \"", contact_count));
			System.out.print("Enter number(shown above) to delete the contact :");
			number = input.next();
			for (int i = 0; i < contact_list.size(); i++) {
				if (((ContactDetails) contact_list.get(i)).getNumber().equals(number)) {
					contact_list.get(i).viewContact();
					contact_list.remove(i);
					System.out.println("Your Contact is Removed !");
					ContactDemoMain.noOfContacts(contact_list);
					break ;
				}

			}
		}
		else if (contact_count == 1) {
			contact_list.remove(arr.get(0));
			System.out.println("Your Contact is Removed !");
			ContactDemoMain.noOfContacts(contact_list);
		}

	}
}
