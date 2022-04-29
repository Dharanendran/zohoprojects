package Task3ContactApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import component.AddComponent;
import organisationlist.OrganizationDetails;

public class AddContact implements AddItemListener {

	ArrayList<ContactDetails> contact_list;
	ContactDetails obj;

	AddContact(ArrayList<ContactDetails> contact_list) {
		this.contact_list = contact_list;
	}

	public void addContact() {
		Scanner choice = new Scanner(System.in);

		System.out.print("👉 Enter the name    :");
		String name = choice.next();
		String mail_id = inputMailChecker(contact_list);
		String num = getPhoneNumber(contact_list);
		System.out.println();

		Address address_obj = getAdressDetailsObject();
		this.obj = new ContactDetails(name, mail_id, num, address_obj);

		AddComponent add_comp = new AddComponent();
		add_comp.add_item(this);
	}

	@Override
	public ArrayList<ContactDetails> getList() {
		return contact_list;
	}

	@Override
	public ContactDetails getNewItem() {
		return obj;
	}

	public static String getPhoneNumber(ArrayList<ContactDetails> contact_list) {
		String number;
		System.out.print("👉 Enter the number  :");
		Scanner choice = new Scanner(System.in);
		number = choice.next();
		for (ContactDetails i : contact_list) {
			if (i.getNumber().equals(number)) {
				System.out.println("The number you entered is already exist in list !");
				return getPhoneNumber(contact_list);
			}
		}
		if (NumberCheckerUtil.numberChecker(number)) {
			return number;
		}
		
		return getPhoneNumber(contact_list);

	}

	public static String inputMailChecker(ArrayList<ContactDetails> contact_list) {
		String mail_id;
		Scanner choice = new Scanner(System.in);
		System.out.print("👉 Enter the mail id :");
		mail_id = choice.next();
		for(ContactDetails i : contact_list) { 
			if(i.getMail_id().equals(mail_id)) {
				System.out.println("The Mail Id is already exist !");
				return inputMailChecker(contact_list);
			}
		}
		if (EmailCheckerUtil.emailChecker(mail_id)) {
			return mail_id;
		}
		else {
			
			System.out.println("OOPS ! ,The entered mail id is InValid ");
			System.out.println();
			return inputMailChecker(contact_list);
		}

	}

	public static Address getAdressDetailsObject() {
		String street_name;

		int door_no, pin_code;

		Scanner choice = new Scanner(System.in);
		while (true) {
			System.out.println("-----> Add Address press y ");
			System.out.println("-----> Won't means press n");
			String select = choice.next();
			switch (select) {
			case "y":
				System.out.print("door No     :");
				door_no = choice.nextInt();
				System.out.print("Street name :");
				street_name = choice.next();
				pin_code = PinCodeChecker.getValidPincode();
				
				return new Address(door_no, street_name, pin_code);

			case "n":
				return new Address(-1 , null , -1);
				
			default:
				System.out.println("Enter valid key !");
			}
		}
	}

	@Override
	public OrganizationDetails getOrgObj() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, OrganizationDetails> getorgHashMap() {
		// TODO Auto-generated method stub
		return null;
	}

}
