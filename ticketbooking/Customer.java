package ticketbooking;

public class Customer {

	private String name ;
	private String mailId ;
	private String number ;
	private TicketDetails ticketInfo ;
	
	Customer(String name , String mailId , String number ){
		this.name = name ;
		this.mailId = mailId ;
		this.number = number ;
	}
	Customer(String name , String mailId , String number , TicketDetails ticketInfo){
		this(name , mailId ,  number);
		this.setTicketInfo(ticketInfo) ;
		this.showCustomerInfo();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	public void showCustomerInfo() {
		System.out.printf("NAME        : %s%nNUMBER      : %s%nmail Id     : %s%n",name , number ,mailId );
		ticketInfo.showTicketDetails();
	}
	
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public TicketDetails getTicketInfo() {
		return ticketInfo;
	}
	public void setTicketInfo(TicketDetails ticketInfo2) {
		this.ticketInfo = ticketInfo2;
	}
	
}
