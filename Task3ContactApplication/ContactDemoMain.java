package Task3ContactApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactDemoMain {

	public static void main(String[] args) {

		Scanner choice = new Scanner(System.in);

		ArrayList<ContactDetails> contact_list = new ArrayList<>();
		
		AdvanceSearch advsearchobj = new AdvanceSearch();

		while (true) {
			System.out.print("👉 Enter the name :");
			String name = choice.next();
			String mail_id = inputMailChecker();
			String num = getPhoneNumber();
			System.out.println();
			addAddress(contact_list, name, mail_id, num);
			System.out.println(" __________________________________________________________");
			System.out.println(String.format("|👉 The no.of contacts present in the contact list is : %s  |",
					contact_list.size()));
			System.out.println("|__________________________________________________________|");
			System.out.println();
			System.out.println("Press \"y\" to add contact further, press \"n\" to stop");
			char ans = choice.next().charAt(0);
			if (ans == 'n') {
				break;
			}
		}

		System.out.println();
		System.out.println("**************🙏 Welcome to zoho contacts 🙏**************");
		while (true) {
			System.out.println();
			System.out.println();
			System.out.println("------------> 1 to search contact");
			System.out.println("------------> 2 to advance search");
			System.out.println("------------> 3 to add contact");
			System.out.println("------------> 4 to delete contact");
			System.out.println("------------> 5 to view contact table");
			System.out.println("------------> 6 to edit contact");
			System.out.println("------------> -1 to exit");
			int select = choice.nextInt();

			switch (select) {
			case 1:

				System.out.println("Enter any detail of the person:");
				String word = choice.next();
				boolean flag = false;
				for (ContactDetails i : contact_list) {
					if (i.getName().contains(word) || i.getMail_id().contains(word) || i.getNumber().contains(word)) {
						i.viewContact();
						flag = true;
					}
				}
				if (flag == false) {
					System.out.println("OOPS! , The word you entered is not matching");
				}
				break;
			case 2:
				advsearchobj.advSearch(contact_list);
				break;
			case 3:
				System.out.println("Enter details for add contact:");
				System.out.print("👉 Enter name:");
				String name1 = choice.next();
				String mail = inputMailChecker();
				String num1 = getPhoneNumber();
				addAddress(contact_list, name1, mail, num1);
				System.out.println("************************************************************");
				System.out.println("*              contact saved !                             *");
				System.out.println("************************************************************");
				contact_list.get(contact_list.size() - 1).viewContact();
				noOfContacts(contact_list);
				break;

			case 4:

				DeleteContact.delContact(contact_list);
				break;

			case 5:
				viewContactTableUtil.contactTable(contact_list);
				break;

			case 6:
				contactEditUtil.edit(choice, contact_list);
				break;

			}
			if (select == -1) {
				System.out.println(
						"🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏 Thanks for using zoho contacts 🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏");
				break;
			}

		}

	}

	private static String getPhoneNumber() {
		String number;
		System.out.print("👉 Enter the number :");
		Scanner choice = new Scanner(System.in);
		number = choice.next();
		if (NumberCheckerUtil.numberChecker(number)) {
			return number;

		}
		return getPhoneNumber();

	}

	public static void noOfContacts(ArrayList<ContactDetails> contact_list) {
		System.out.println(String.format("Total no of contacts : %s", contact_list.size()));
	}

	public static String inputMailChecker() {
		String mail_id;
		Scanner choice = new Scanner(System.in);
		System.out.print("👉 Enter the mail id :");
		mail_id = choice.next();
		if (EmailCheckerUtil.emailChecker(mail_id)) {
			return mail_id;
		} else {
			System.out.println("OOPS ! ,The entered mail id is InValid ");
			return inputMailChecker();

		}

	}

	public static void addAddress(ArrayList<ContactDetails> contact_list, String name, String mail_id, String num) {
		String street_name;

		int door_no, pin_code;

		Scanner choice = new Scanner(System.in);

		System.out.println("If you want to add Address press \"y\" or press \"n\"");
		String select = choice.next();
		switch (select) {
		case "y":
			System.out.print("door No :");
			door_no = choice.nextInt();
			System.out.print("Street name :");
			street_name = choice.next();
			System.out.print("pin code :");
			pin_code = choice.nextInt();
			contact_list.add(new ContactDetails(name, mail_id, num, door_no, street_name, pin_code));
			break ;
			
		case "n" :
			contact_list.add(new ContactDetails(name, mail_id , num));
			break ;
			
		}

	}
}
