package Task3ContactApplicstion;

import java.util.ArrayList;

public class ContactDetails {

	String name;
	String mailid;
	long number;
	

	ContactDetails(String name, String mailid, long number) {
		this.name = name;
		this.mailid = mailid;
		this.number = number;
	}

	public void viewContact() {

		System.out.println(String.format("Name   : %s\nMailid : %s\nNumber : %s", this.name, this.mailid, this.number));

	}
}
