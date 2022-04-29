package Task3ContactApplication;

public class Address {

	private int door_no ;
	private String street_name ;
	
	private int pin_code ;

	public int getDoor_no() {
		return door_no;
	}

	public void setDoor_no(int door_no) {
		this.door_no = door_no;
	}

	public String getStreet_name() {
		return street_name;
	}

	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}

	

	public int getPin_code() {
		return pin_code;
	}

	public void setPin_code(int pin_code) {
		this.pin_code = pin_code;
	}

	Address(int door_no, String street_name,  int pin_code) {
		this.door_no = door_no;
		this.street_name = street_name;
		
		this.pin_code = pin_code;
	}

	
	public void viewAddress() {
		System.out.println(String.format("Door No    : %s%nStreet Name: %s%nPincode    : %s", door_no >-1?door_no : "NIL" , street_name != null? street_name :"NIL" , pin_code >-1? pin_code : "NIL"));
	}

}
