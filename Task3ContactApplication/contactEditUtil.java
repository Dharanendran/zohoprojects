package Task3ContactApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class contactEditUtil {

	public static void edit(Scanner choice, ArrayList<ContactDetails> contact_list) {
		System.out.println("Enter any one of the person's details(which you know)  to edit contact:");
		System.out.println("(name / mail/ number)");
		String editContact = choice.next().toLowerCase();
		switch (editContact) {
		case "name":
			System.out.println("Enter the name of the person : ");
			String Name = choice.next();
			System.out.println("Enter the new name to the person : ");
			String editName = choice.next();
			for (ContactDetails i : contact_list) {
				if (i.name.equals(Name)) {
					System.out.println("**************** Before Edit ****************");
					i.viewContact();
					i.name = editName;
					System.out.println("**************** After Edit  ****************");
					i.viewContact();
					break;
				}

			}
			break;
		case "mail":
			System.out.println("Enter the mail_id of the person : ");
			String mail = choice.next();
			System.out.println("Enter the new new mailId to the person : ");
			String editmail = choice.next();
			for (ContactDetails i : contact_list) {
				if (i.mail_id.equals(mail)) {
					System.out.println("**************** Before Edit ****************");
					i.viewContact();
					i.mail_id = editmail;
					System.out.println("**************** After Edit  ****************");
					i.viewContact();
					break;

				}

			}
			break;
		case "number":
			System.out.println("Enter the phone number of the person : ");
			String num = choice.next();
			System.out.println("Enter the new phone number to the person : ");
			String editNum = choice.next();
			for (ContactDetails i : contact_list) {
				if (i.number == num) {
					System.out.println("**************** Before Edit ****************");
					i.viewContact();
					i.number = editNum;
					System.out.println("**************** After Edit  ****************");
					i.viewContact();
					break;
				}

			}
			break;

		}

	}

}
