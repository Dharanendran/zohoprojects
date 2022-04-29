package Task3ContactApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import organisationlist.*;

public class ContactDemoMain {

	public static void main(String[] args) {


		Scanner choice = new Scanner(System.in);

		ArrayList<ContactDetails> contact_list = new ArrayList<>();

		AdvanceSearch advsearchobj = new AdvanceSearch();
		Task:
		while (true) {
			AddContact add_contact = new AddContact(contact_list);
			add_contact.addContact();
			
			System.out.println(" __________________________________________________________");
			System.out.println(String.format("|👉 The no.of contacts present in the contact list is : %s  |",contact_list.size()));
			System.out.println("|__________________________________________________________|");
			System.out.println();
			while(true) {
			System.out.println("Press \"y\" to add contact further, press \"n\" to stop");
			char ans = choice.next().charAt(0);
			if (ans == 'n') {
				break Task;
			}
			else if(ans == 'y') {
				break ;
			}
			else if(ans != 'n' && ans !='y') {
				System.out.println();
				System.out.println("please enter valid key !");
			}
		}
		}
		System.out.println();
		System.out.println("**************🙏 Welcome to zoho contacts 🙏**************");
		while (true) {
			System.out.println();
			System.out.println("              * * * * * * * * * * * * * *");
			System.out.println("              *                         *");
			System.out.println("              *   1 to contacts options *");
			System.out.println("              *  -1 to exit             *");
			System.out.println("              *                         *");
			System.out.println("              * * * * * * * * * * * * * *");
			int userchoice = choice.nextInt();
			if (userchoice == -1) {
				System.out.println(
						"🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏 Thanks for using zoho contacts 🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏");
				break;
			}
			switch (userchoice) {

			case 1:
				Task1:
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
							if (i.getName().contains(word) || i.getMail_id().contains(word)
									|| i.getNumber().contains(word)) {
								i.viewContact();
								flag = true;
							}
						}
						if (flag == false) {
							System.out.println();
							System.out.println("OOPS! , The word you entered is not matching");
							System.out.println();
						}
						break;
					case 2:
						advsearchobj.advSearch(contact_list);
						break;
					case 3:
						System.out.println("Enter details for add contact:");
						AddContact add_contact1 = new AddContact(contact_list);
						add_contact1.addContact();
						

						System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
						System.out.println("*              contact saved !                              *");
						System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
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
						contactEditUtil.edit(choice, contact_list );
						break;
						
					case -1:
						break Task1;
						
					default:
						System.out.println("Enter valid input !");

					}

				}
				break;
			
			default:
				System.out.println("Enter the valid option !");
			}
		}

	}

	public static void noOfContacts(ArrayList<ContactDetails> contact_list) {
		System.out.println(String.format("Total no of contacts : %s", contact_list.size()));
	}

}
