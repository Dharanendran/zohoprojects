package Task3ContactApplication;

import java.util.HashMap;

import organisationlist.OrganizationDetails;

public class ContactDetails extends BaseClass{

	private String name;
	private String mail_id;
	private String number;
	Address address;
	public String company_name ;
	
	public ContactDetails getObjContact() {
		return this ;
	}
	public OrganizationDetails getObjOrg() {
		return null ;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail_id() {
		return mail_id;
	}

	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	ContactDetails(String name, String mail_id, String number, Address address) {
		this(name, mail_id, number);
		this.address = address;
	}

	ContactDetails(String name, String mail_id, String number) {
		this.name = name;
		this.mail_id = mail_id;
		this.number = number;

	}

	public void viewContact() {
		System.out.println();
		System.out.println(String.format("Name       : %s\nMailid     : %s\nNumber     : %s", this.name, this.mail_id, this.number));
		if (address != null) {
			address.viewAddress();
		}
		else {
			System.out.println("Door No : Nill  /nStreet Name : Nill /nPinCode : Nill");
		}

//		else {System.out.println("nulkl");}
		System.out.println();
	}
}
