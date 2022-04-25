package Task3ContactApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class AdvanceSearch {
	Scanner input = new Scanner(System.in);

	public void advSearch(ArrayList<ContactDetails> contact_list) {
		System.out.println("what you want to search:");
		System.out.println("press 1 to name :");
		System.out.println("press 2 to number :");
		System.out.println("press 3 to Mail Id :");
		System.out.println("press 4 to Address :");
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			view(contact_list, 1);
			break;
		case 2:
			view(contact_list, 2);
			break;
		case 3:
			view(contact_list, 3);
			break;
		case 4:
			try {
				System.out.println("Address");
				System.out.println("  ~press 1 to Door no :");
				System.out.println("  ~press 2 to Street name :");
				System.out.println("  ~press 3 to pin code :");
				int choice1 = input.nextInt();
				switch (choice1) {
				case 1:
					view(contact_list, 21);
					break;
				case 2:
					view(contact_list, 22);
					break;
				case 3:
					view(contact_list, 23);
					break;
				}
			} catch (Exception e) {
			}

		}

	}

	public void view(ArrayList<ContactDetails> contact_list, int a) {
		System.out.println("press 1 for contains");
		System.out.println("press 2 for ==");
		System.out.println("press 3 for !=");
		int choice = input.nextInt();
		System.out.print("Enter input:");
		String input_name = input.next();

		switch (choice) {
		case 1:
			for (ContactDetails i : contact_list) {
				if (a == 1) {
					if (i.getName().contains(input_name)) {

						i.viewContact();

					}
				} else if (a == 2) {
					if (i.getNumber().contains(input_name)) {

						i.viewContact();

					}
				} else if (a == 3) {
					if (i.getMail_id().contains(input_name)) {

						i.viewContact();

					}
				} else if (a == 21) {

					if (Integer.toString(i.address.getDoor_no()).contains((input_name))) {

						i.viewContact();

					}
				} else if (a == 22) {

					if (i.address.getStreet_name().contains(input_name)) {

						i.viewContact();

					}
				} else if (a == 23) {

					if (Integer.toString(i.address.getPin_code()).contains(input_name)) {

						i.viewContact();

					}
				}
			}
			break;
		case 2:

			for (ContactDetails i : contact_list) {
				if (a == 1) {
					if (i.getName().equals(input_name)) {

						i.viewContact();

					}
				} else if (a == 2) {
					if (i.getNumber().equals(input_name)) {

						i.viewContact();

					}
				} else if (a == 3) {
					if (i.getMail_id().equals(input_name)) {

						i.viewContact();

					}
				} else if (a == 21) {
					int door_no = input.nextInt();
					if (i.address.getDoor_no() == (door_no)) {

						i.viewContact();

					}
				} else if (a == 22) {

					if (i.address.getStreet_name().equals(input_name)) {

						i.viewContact();

					}
				} else if (a == 23) {
					int pin_code = input.nextInt();
					if (i.address.getPin_code() == (pin_code)) {

						i.viewContact();

					}
				}
			}
			break;

		case 3:

			for (ContactDetails i : contact_list) {
				if (a == 1) {
					if (!i.getName().equals(input_name)) {

						i.viewContact();

					}
				} else if (a == 2) {
					if (!i.getNumber().equals(input_name)) {

						i.viewContact();

					}
				} else if (a == 3) {
					if (!i.getMail_id().equals(input_name)) {

						i.viewContact();

					}
				} else if (a == 21) {
					int door_no = input.nextInt();
					if (i.address.getDoor_no() != door_no) {

						i.viewContact();

					}
				} else if (a == 22) {

					if (!i.address.getStreet_name().equals(input_name)) {

						i.viewContact();

					}
				} else if (a == 23) {
					int pin_code = input.nextInt();
					if (i.address.getPin_code() != pin_code) {

						i.viewContact();

					}
				}
			}
			break;

		}

	}
}
