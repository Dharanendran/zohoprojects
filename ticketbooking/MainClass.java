package ticketbooking;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

	static Scanner userInput = new Scanner(System.in);
	static ArrayList<Customer> customerList = new ArrayList<>(5);
	static {

		System.out.println();
		System.out.println(
				"🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏  WELCOME TO ZOHO MULTIPLEX  🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏    ");
	}

	public static void main(String[] args) {
		int choice;
		task: while (true) {
			welcomeStatements();
			while (true) {
				try {
					choice = userInput.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Enter Only Integer value!");
					userInput.reset();
					userInput.next();
				}
				catch(Exception e) {
					System.out.println("Enter Valid Input!");
					userInput.reset();
					userInput.next();
				}
			}

			switch (choice) {
			case 1:
				System.out.print("Enter Your Name      :");
				String name = userInput.next();
				String mailId = EmailCheckerUtil.getMailId(customerList, true);
				String number = NumberCheckerUtil.getContactNumber(customerList, true);

				MultiplexEnum.SCREEN1.screenDetails();
				MultiplexEnum.SCREEN2.screenDetails();
				MultiplexEnum.SCREEN3.screenDetails();
				TicketBooking.ticketBooking(customerList, name, mailId, number);
				TicketDetails ticketInfo = TicketBooking.getTicketDetails();
				customerList.add(new Customer(name, mailId, number, ticketInfo));

				// showCustomers();
				break;

			case 2:

				ShowMyBooking.showMyBookings(customerList);// should be a class
				break;

			case 3:
				EditBookingDetail.editDetails(customerList);
				break;
			case 4:
				ticketCancelling();
				break;
			case 5:
				AdminLogin admin = new AdminLogin();
				admin.adminCheckingProccess();
				break;

			case -1:
				System.out.println(
						"🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏  THANKS FOR VISITING US!  🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏");
				break task;

			default:
				System.out.println("Enter Valid Input !");

			}
		}
	}

	public static void welcomeStatements() {
		System.out.println();

		System.out.println();
		System.out.println("                         * * * * * * * * * * * * * * * * * *");
		System.out.println("                         *                                 *");
		System.out.println("                         *       1 to New Booking          *");
		System.out.println("                         *       2 to Show Bookings        *");
		System.out.println("                         *       3 to Edit Booking Details *");
		System.out.println("                         *       4 to Cancel  Booking      *");
		System.out.println("                         *       5 to Admin Login          *");
		System.out.println("                         *      -1 to Exit                 *");
		System.out.println("                         *                                 *");
		System.out.println("                         * * * * * * * * * * * * * * * * * *");

	}
	
	private static void ticketCancelling() {
		
		System.out.println("Enter Ticket No :");
		String inputTicketNo = userInput.next();
		boolean presence = false ;
		customerLoop:

		for (Customer i : customerList) {
			if (i.getTicketInfo().getTicketNo().equals(inputTicketNo)) {
				presence = true ;
				System.out.println("Press 1 To Comfirm Cancelling : ");
				int comfirmation;
				while (true) {
					try {
						comfirmation = userInput.nextInt();
						break;
					} catch (Exception e) {
						System.out.println("Enter Valid Input !");
						userInput.reset();
						userInput.next();
					}
				}
				switch (comfirmation) {
				case 1:
					for (MultiplexEnum element : MultiplexEnum.values()) {
						if (element.getName().equals(i.getTicketInfo().getScreenName())) {
							int ticketCost = element.getTicketCost();
							System.out.println("You Will Get Payment Of Rs " + (ticketCost - 0.2 * ticketCost)
									+ " (Fine Amount Deducted 20% Of The Cost)");
							element.getSeats()[Integer
									.parseInt(Character.toString(i.getTicketInfo().getTicketNo().charAt(
											i.getTicketInfo().getTicketNo().length() - 2)))][Integer.parseInt(
													Character.toString(i.getTicketInfo().getTicketNo().charAt(
															i.getTicketInfo().getTicketNo().length() - 1)))]
									.setIsBooked("YES");
							;
						}
					}
					customerList.remove(i);
					break customerLoop;
				default:
					System.out.println("Please Enter Valid Option !");
				}
			}
		}
		if(!presence) {
			System.out.println("");
			System.out.println("The Ticket No Is Not Present In The List !");
		}
	}


}
