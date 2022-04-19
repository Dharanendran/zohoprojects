package Task3ContactApplication;

public class ContactDetails {

	String name;
	String mail_id;
	String number;

	ContactDetails(String name, String mail_id, String number) {
		this.name = name;
		this.mail_id = mail_id;
		this.number = number;
	}

	public void viewContact() {

		System.out.println(String.format("Name   : %s\nMailid : %s\nNumber : %s", this.name, this.mail_id, this.number));

	}
}
