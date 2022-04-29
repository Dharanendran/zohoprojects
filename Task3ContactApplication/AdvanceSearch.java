package Task3ContactApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import organisationlist.OrganizationDetails;

public class AdvanceSearch {
	Scanner input = new Scanner(System.in);

	public void advSearch(ArrayList<ContactDetails> contact_list) {
		System.out.println("what you want to search");
		System.out.println("press 1 to name    :");
		System.out.println("press 2 to number  :");
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
				System.out.println("  ~press 1 to Door no     :");
				System.out.println("  ~press 2 to Street name :");
				System.out.println("  ~press 3 to pin code    :");
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
				default:
					System.out.println();
					System.out.println("Invalid Input !");
				}
			} catch (Exception e) {
				System.out.println("Address is empty !");
			}
			break ;
		default:
			System.out.println("Enter valid input !");

		}

	}

	public void view(ArrayList<ContactDetails> contact_list, int a) {
		System.out.println("press 1 for contains");
		System.out.println("press 2 for ==");
		System.out.println("press 3 for !=");
		int choice = input.nextInt();
		System.out.print("Enter input : ");
		String inputDetail = input.next();
		

		switch (choice) {
		case 1:
			boolean presence = false ;
			for (ContactDetails i : contact_list) {
				if (a == 1) {
					if (i.getName().contains(inputDetail)) {
						presence = true ;
						i.viewContact();

					}
				} else if (a == 2) {
					if (i.getNumber().contains(inputDetail)) {
						presence = true ;
						i.viewContact();

					}
				} else if (a == 3) {
					if (i.getMail_id().contains(inputDetail)) {
						presence = true ;
						i.viewContact();

					}
				} else if (a == 21) {

					if (Integer.toString(i.address.getDoor_no()).contains((inputDetail))) {
						presence = true ;
						i.viewContact();

					}
				} else if (a == 22) {

					if (i.address.getStreet_name().contains(inputDetail)) {
						presence = true ;
						i.viewContact();

					}
				} else if (a == 23) {

					if (Integer.toString(i.address.getPin_code()).contains(inputDetail)) {
						presence = true ;
						i.viewContact();

					}
				}
				if(presence == false) { System.out.println("The input is not present in the list !");}
			}
			break;
		case 2:
			boolean presence1 = false;
			for (ContactDetails i : contact_list) {
				if (a == 1) {
					if (i.getName().equals(inputDetail)) {
						presence1 = true ;
						i.viewContact();

					}
				} else if (a == 2) {
					if (i.getNumber().equals(inputDetail)) {
						presence1 = true ;
						i.viewContact();

					}
				} else if (a == 3) {
					if (i.getMail_id().equals(inputDetail)) {
						presence1 = true ;
						i.viewContact();

					}
				} else if (a == 21) {
					int door_no = input.nextInt();
					if (i.address.getDoor_no() == (door_no)) {
						presence1 = true ;
						i.viewContact();

					}
				} else if (a == 22) {

					if (i.address.getStreet_name().equals(inputDetail)) {
						presence1 = true ;
						i.viewContact();

					}
				} else if (a == 23) {
					int pin_code = input.nextInt();
					if (i.address.getPin_code() == (pin_code)) {
						presence1 = true ;
						i.viewContact();

					}
				}
				if(presence1 == false) { System.out.println("The input is not present in the list !");}
			}
			break;

		case 3:
			boolean presence2 = false; 
			for (ContactDetails i : contact_list) {
				if (a == 1) {
					if (!i.getName().equals(inputDetail)) {
						presence2 = true ; 
						i.viewContact();

					}
				} else if (a == 2) {
					if (!i.getNumber().equals(inputDetail)) {
						presence2 = true ; 
						i.viewContact();

					}
				} else if (a == 3) {
					if (!i.getMail_id().equals(inputDetail)) {
						presence2 = true ; 
						i.viewContact();

					}
				} else if (a == 21) {
					
					if (Integer.toString(i.address.getDoor_no()).equals(inputDetail)) {
						presence2 = true ; 
						i.viewContact();

					}
				} else if (a == 22) {

					if (!i.address.getStreet_name().equals(inputDetail)) {
						presence2 = true ; 
						i.viewContact();

					}
				} else if (a == 23) {
					if (! Integer.toString(i.address.getPin_code()).equals(inputDetail)) {
						presence2 = true ; 
						i.viewContact();

					}
				}
				if(presence2 == false) { System.out.println("The input is not present in the list !");}
			}
			break;
		default:
			System.out.println("Invalid key input !");

		}

	}
}
