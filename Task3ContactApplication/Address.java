package Task3ContactApplication;

public class Address {

	private int door_no = 0;
	private String street_name= null;
	
	private int pin_code = 0;

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
		System.out.println(String.format("Door No : %s%nStreet Name: %s%nPincode : %s",door_no , street_name,pin_code));
	}

}
