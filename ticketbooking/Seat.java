package ticketbooking;

public class Seat {
	
    final String colour = "red" ;
    final String size = "40cm*50cm";
	private String isBooked = "NO";
	private boolean availability =  true ;
	
	Seat(String isBooked , boolean availability ){
		this.isBooked = isBooked ;
		this.availability = availability ;
			
	}
	
	public String getColour() {
		return colour;
	}
	
	public String getSize() {
		return size;
	}
	
	
	public String getIsBooked() {
		return isBooked;
	}
	public void setIsBooked(String isBooked) {
		this.isBooked = isBooked;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
}
