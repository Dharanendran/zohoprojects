package Task3ContactApplicstion;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactDemo {

	public static void main(String[] args) {

		Scanner choice = new Scanner(System.in);

		ArrayList<ContactDetails> ContactList = new ArrayList<>();

		for (int i = 0; i < 2; i++) {
			System.out.print("ðŸ‘‰ Enter the name :");
			String name = choice.next();
			System.out.print("ðŸ‘‰ Enter the mail id :");
			String mailid = choice.next();
			System.out.print("ðŸ‘‰ Enter the number :");
			long num = choice.nextLong();
			ContactList.add(new ContactDetails(name, mailid, num));
			System.out.println(" __________________________________________________________");
			System.out.println(
					String.format("|ðŸ‘‰ The no.of contacts present in the contact list is : %s  |", ContactList.size()));
			System.out.println("|__________________________________________________________|");
		}
		System.out.println();
		System.out.println("**************ðŸ™? Welcome to zoho contacts ðŸ™?**************");
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

				if (searchNo() == 1) {

					System.out.println("Enter the name :");
					String name = choice.next();
					boolean flag = false;
					for (int i = 0; i < ContactList.size(); i++) {

						if (ContactList.get(i).name.equals(name)) {
							ContactList.get(i).viewContact();
							flag = true;
						}
					}
					if (flag == false) {
						System.out.println();
						System.out.println("The name you entered is not present in the contact list");
						System.out.println();
					}

				} else if (searchNo() == 2) {
					System.out.println("Enter the mail :");
					String mail = choice.next();
					boolean flag = false;
					for (int i = 0; i < ContactList.size(); i++) {
						if (ContactList.get(i).mailid.equals(mail)) {
							ContactList.get(i).viewContact();
							flag = true;
						}
					}
					if (flag == false) {
						System.out.println();
						System.out.println("The mail you entered is not present in the contact list");
						System.out.println();
					}

				} else if (searchNo() == 3) {
					System.out.println("Enter the number :");
					int number = choice.nextInt();
					boolean flag = false;
					for (int i = 0; i < ContactList.size(); i++) {
						if (ContactList.get(i).number == number) {
							ContactList.get(i).viewContact();
							flag = true;
						}
					}
					if (flag == false) {
						System.out.println();
						System.out.println("The number you entered is not present in the contact list");
						System.out.println();
					}

				}
				break;
			case 2:
				System.out.println("Enter details for add contact:");
				System.out.println("ðŸ‘‰ Enter name:");
				String name = choice.next();
				System.out.println("ðŸ‘‰ Enter mail :");
				String mail = choice.next();
				System.out.println("ðŸ‘‰ Enter number : ");
				long num = choice.nextLong();
				ContactList.add(new ContactDetails(name, mail, num));
				System.out.println("************************************************************");
				System.out.println("*              contact saved !                             *");
				System.out.println("************************************************************");
				ContactList.get(ContactList.size() - 1).viewContact();
				noOfContacts(ContactList);
				break;

			case 3:
				System.out.println("ðŸ‘‰ Enter the name to delete contact");
				String Name = choice.next();
				for (int i = 0; i < ContactList.size(); i++) {
					if (ContactList.get(i).name.equals(Name)) {
						ContactList.remove(i);
						System.out.println("contact is removed ! ");
						noOfContacts(ContactList);
					}
				}
				break;

			case 4:
				viewContactTable(ContactList);
				break;

			case 5:
				contactEdit(choice, ContactList);
				break;

			}
			if (select == -1) {
				System.out.println(
						"ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™? Thanks for using zoho contacts ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™?ðŸ™?");
				break;
			}

		}
	}

	public static int searchNo() {
		System.out.println("How you gonna search by (name , mail , number) : ");
		System.out.println("ðŸ‘‰ press 1 to search via name ");
		System.out.println("ðŸ‘‰ press 2 to search via mail ");
		System.out.println("ðŸ‘‰ press 3 to search via number");
		Scanner choice = new Scanner(System.in);
		int input = choice.nextInt();
		return input;
	}

	public static void noOfContacts(ArrayList<ContactDetails> ContactList) {
		System.out.println(String.format("Total no of contacts : %s", ContactList.size()));
	}

	public static void viewContactTable(ArrayList<ContactDetails> ContactList) {
		System.out
				.println(" _________________________________________________________________________________________");
		System.out
				.println("|S.NO|         NAME            |           MAIL ID               |        Number          |");
		System.out
				.println("|____|_________________________|_________________________________|________________________|");
		for (int i = 1; i < (ContactList.size() + 1); i++) {
			System.out.println(String.format("| %s  |   %-22s|  %-30s |    %-19s |", i, ContactList.get(i - 1).name,
					ContactList.get(i - 1).mailid, ContactList.get(i - 1).number));
			System.out.println(
					"|____|_________________________|_________________________________|________________________|");

		}
	}

	public static void contactEdit(Scanner choice, ArrayList<ContactDetails> ContactList) {
		System.out.println("Enter any one of the person's details(which you know)  to edit contact:");
		System.out.println("(name / mail/ number)");
		String editContact = choice.next().toLowerCase();
		switch (editContact) {
		case "name":
			System.out.println("Enter the name of the person : ");
			String Name = choice.next();
			System.out.println("Enter the new name to the person : ");
			String editName = choice.next();
			for (ContactDetails i : ContactList) {
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
			System.out.println("Enter the mailid of the person : ");
			String mail = choice.next();
			System.out.println("Enter the new new mailId to the person : ");
			String editmail = choice.next();
			for (ContactDetails i : ContactList) {
				if (i.mailid.equals(mail)) {
					System.out.println("**************** Before Edit ****************");
					i.viewContact();
					i.mailid = editmail;
					System.out.println("**************** After Edit  ****************");
					i.viewContact();
					break;

				}

			}
			break;
		case "number":
			System.out.println("Enter the phone number of the person : ");
			long num = choice.nextLong();
			System.out.println("Enter the new phone number to the person : ");
			long editNum = choice.nextLong();
			for (ContactDetails i : ContactList) {
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
//qwertyuiopqwertyuer
//123456789012345678945
