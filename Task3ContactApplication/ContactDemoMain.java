package Task3ContactApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactDemoMain {

	public static void main(String[] args) {

		Scanner choice = new Scanner(System.in);

		ArrayList<ContactDetails> contact_list = new ArrayList<>();
		String mail_id;
		String num;

		while (true) {
			System.out.print("👉 Enter the name :");
			String name = choice.next();
			mail_id = inputMailChecker();
			num = getPhoneNumber() ;
			contact_list.add(new ContactDetails(name, mail_id, num));
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
			System.out.println("------------>press 1 to search contact");
			System.out.println("------------>press 2 to add contact");
			System.out.println("------------>press 3 to delete contact");
			System.out.println("------------>press 4 to view contact table");
			System.out.println("------------>press 5 to edit contact");
			System.out.println("------------>press -1 to exit");
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
				System.out.println("Enter details for add contact:");
				System.out.print("👉 Enter name:");
				String name1 = choice.next();
				String mail = inputMailChecker();
				String num1 = getPhoneNumber();
				contact_list.add(new ContactDetails(name1, mail, num1));
				System.out.println("************************************************************");
				System.out.println("*              contact saved !                             *");
				System.out.println("************************************************************");
				contact_list.get(contact_list.size() - 1).viewContact();
				noOfContacts(contact_list);
				break;

			case 3:
				
				DeleteContact.delContact(contact_list );
				break;

			case 4:
				viewContactTableUtil.contactTable(contact_list);
				break;

			case 5:
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
			System.out.println("Entered number is valid !");
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
			System.out.println("The entered mail id is valid !");
			return mail_id;
		} else {
			System.out.println("OOPS ! ,The entered mail id is InValid ");
			 return inputMailChecker();
			

		}

	}

}
