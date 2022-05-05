package ticketbooking;

import java.util.ArrayList;
import java.util.Scanner;

public class ShowMyBooking {
	static Scanner userInput = new Scanner(System.in);
	public static void showMyBookings(ArrayList<Customer> customerList) {
		System.out.print("Enter Your Number :");
		String userNumber = userInput.next();
		System.out.println();
		boolean presence = false;
		for (Customer i : customerList) {
			if (i.getNumber().equals(userNumber)) {
				presence = true;
				i.showCustomerInfo();
				System.out.println("_______________________________");
			}
		}
		if (presence == false) {
			System.out.println("The Number You Entered Is Not Present In The List");
		}
		
	}
	
}
