package Task3ContactApplication;

import java.util.ArrayList;
import java.util.HashMap;

import organisationlist.*;
import java.util.Scanner;

import organisationlist.AddOrg;
import organisationlist.OrganizationDetails;

public class contactEditUtil {

	public static void edit(Scanner choice, ArrayList<ContactDetails> contact_list) {
		System.out.print("Enter person's number:");
		String editContact = choice.next();
		boolean presence = false;
		for (ContactDetails i : contact_list) {
			if (i.getNumber().equals(editContact)) {
				presence = true;
				System.out.println("Enter details you want to change(name / number / mail_id / address )");
				String edit_detail = choice.next().toLowerCase();

				switch (edit_detail) {

				case "name":
					System.out.println("new name :");
					i.setName(choice.next());
					break;
				case "number":
					while (true) {
						System.out.println("new number :");
						String new_num = choice.next();
						if (NumberCheckerUtil.numberChecker(new_num)) {
							i.setNumber(new_num);
							break;
						} else {
							System.out.println("Email Id is invalid !");

						}
					}
					break;
				case "mail_id":
					while (true) {
						System.out.println("new mail_id :");
						String new_mail = choice.next();
						if (EmailCheckerUtil.emailChecker(new_mail)) {
							i.setMail_id(new_mail);
							break;
						} else {
							System.out.println("Email Id is invalid !");

						}
					}
					break;

				case "address":
					System.out.println("which criteria you gonna edit :");
					System.out.println("1 to edit Door NO");
					System.out.println("2 to edit Street Name");
					System.out.println("3 to edit pincode");
					int userInput = choice.nextInt();
					switch (userInput) {

					case 1:
						System.out.print("Enter new Door no(if you dont want no press -1):");
						int newdoor_no = choice.nextInt();
						i.address.setDoor_no(newdoor_no);
						System.out.println("Successfully Updated !");
						break;

					case 2:
						System.out.print("Enter new Street Name (if you dont want name enter null):");
						String newStreetName = choice.next();
						i.address.setStreet_name(newStreetName);
						System.out.println("Successfully Updated !");
						break;

					case 3:
						System.out.println("Enter new pin-code (if you dont want pin press -1):");
						String newPinCode = choice.next();
						i.address.setStreet_name(newPinCode);
						System.out.println("Successfully Updated !");
						break;

					default:
						System.out.println("Please Enter valid option !");

					}
					break;
				default:
					System.out.println("Enter valid option !");
					System.out.println();
				}
			}

		}

		if (presence == false) {
			System.out.println("The number you entered is not present in the contact list");
		}

	}
}
