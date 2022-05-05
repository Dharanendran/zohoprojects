package ticketbooking;

import java.util.ArrayList;
import java.util.Scanner;

public class EditBookingDetail {

	static Scanner userInput = new Scanner(System.in);

	public static void editDetails(ArrayList<Customer> customerList) {

		System.out.println("Enter Contact Number :");
		String number = userInput.next();
		if(customerList.size() == 0) { 
			System.out.println("The Entered Contact Number Is Not present in the List ! ");
			return ;
			}
		boolean flag = false ;
		for (Customer i : customerList) {
			if (i.getNumber().equals(number)) {
				flag = true ;
				i.showCustomerInfo();
				System.out.println("------------------------------------------------");

			}
		}
		if(flag == false) {
			System.out.println("The Entered Contact Number Is Not present in the List ! ");
			return ;
		}
		System.out.print("Enter The Ticket No : ");
		String ticketNo = userInput.next();
		for (Customer i : customerList) {
			if (i.getTicketInfo().getTicketNo().equals(ticketNo)) {
				System.out.println();
				System.out.println("        What You Want To Edit ");
				System.out.println();
				System.out.println("Press 1 To Person's Information");
				System.out.println("Press 2 To Ticket's Information");
				int choice;
				while (true) {
					try {
						choice = userInput.nextInt();
						break;
					} catch (Exception e) {
						System.out.println("Enter Valid Input !");
						userInput.reset();
						userInput.next();
					}
				}
				switch (choice) {
				case 1:
					System.out.println();
					System.out.println("👉 Press 1 To Edit Name ");
					System.out.println("👉 Press 2 To Edit Mail Id");
					System.out.println("👉 Press 3 To Edit Number");
					int subChoice;
					while (true) {
						try {
							subChoice = userInput.nextInt();
							break;
						} catch (Exception e) {
							System.out.println("Enter Valid Input !");
							userInput.reset();
							userInput.next();
						}
					}
					switch (subChoice) {
					case 1:
						System.out.print("👉 Enter New Name : ");
						String newName = userInput.next();
						i.setName(newName);
						break;
					case 2:
						String mailId = EmailCheckerUtil.getMailId(customerList, false);
						i.setMailId(mailId);
						break;
					case 3:
						String newNumber = NumberCheckerUtil.getContactNumber(customerList, false);
						i.setNumber(newNumber);
					}
					break;
				case 2:
					System.out.println();
					System.out.println("👉 PRESS 1 TO CHANGE SEAT");
					int changeIndex;
					while (true) {
						try {
							changeIndex = userInput.nextInt();
							break;
						} catch (Exception e) {
							System.out.println("Enter Valid Input !");
							userInput.reset();
							userInput.next();
						}
					}
					switch (changeIndex) {
					case 1:
						String ticket = i.getTicketInfo().getTicketNo();
						int OldRow = Integer.parseInt(Character.toString(ticket.charAt(ticket.length() - 2)));
						int OldColumn = Integer.parseInt(Character.toString(ticket.charAt(ticket.length() - 1)));
						MultiplexEnum screen;
						if (ticketNo.contains("rohini")) {
							screen = MultiplexEnum.SCREEN1;
						} else if (ticketNo.contains("rahini")) {
							screen = MultiplexEnum.SCREEN2;
						} else {
							screen = MultiplexEnum.SCREEN3;
						}
						screen.getSeats()[OldRow][OldColumn].setIsBooked("NO");
						screen.showSeatsAvailability();
						System.out.println("Enter Row And Column For New Seat !");
						System.out.println();
						System.out.print("Row : ");
						int newRowNo;
						while (true) {
							try {
								newRowNo = userInput.nextInt();
								break;
							} catch (Exception e) {
								System.out.println("Enter Valid Input !");
								userInput.reset();
								userInput.next();
							}
						}
						System.out.print("Column : ");
						int newColumnNo;
						while (true) {
							try {
								newColumnNo = userInput.nextInt();
								break;
							} catch (Exception e) {
								System.out.println("Enter Valid Input !");
								userInput.reset();
								userInput.next();
							}
						}
						if (screen.getSeats()[newRowNo][newColumnNo].getIsBooked() == "YES") {
							System.out.println("The Seat Is Already Booked !");
						} else if (screen.getSeats()[newRowNo][newColumnNo].isAvailability() == false) {
							System.out.println("The Seat Is  In Under Service");
						} else {
							screen.getSeats()[newRowNo][newColumnNo].setIsBooked("YES");
							break;
						}
						System.out.println(" Your New Ticket !");
						TicketBooking.ticketReceipt(newRowNo, newColumnNo, screen.getName());
						i.getTicketInfo().setTicketNo(
								screen.getName() + Integer.toString(newRowNo) + Integer.toString(newColumnNo));
						i.showCustomerInfo();
					}
					break;
				default:
					System.out.println("Please Enter Valid Changing Index !");
				}

			}
		}
	}

}
