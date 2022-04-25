package Task3ContactApplication;

public class ContactDetails {

	private String name;
	private String mail_id;
	private String number;
	Address address;

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

	ContactDetails(String name, String mail_id, String number, int door_no, String street_name, int pin_code) {
		this(name, mail_id, number);
		address = new Address(door_no, street_name, pin_code);
	}

	ContactDetails(String name, String mail_id, String number) {
		this.name = name;
		this.mail_id = mail_id;
		this.number = number;

	}

	public void viewContact() {
		System.out.println();
		System.out.println(String.format("Name   : %s\nMailid : %s\nNumber : %s", this.name, this.mail_id, this.number));
		if (address != null) {
			address.viewAddress();
		}
		System.out.println();
	}
}
