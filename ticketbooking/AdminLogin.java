package ticketbooking;

import java.util.Scanner;

public class AdminLogin {

	final String loginId = "zoho";
	final String passWord = "abcd@1234";
	static AdminLogin adminLoginInstance = new AdminLogin();
	Scanner userInput = new Scanner(System.in);

	public void adminCheckingProccess() {
		System.out.print("Login Id :");
		String loginId = userInput.next();
		System.out.print("Password :");
		String password = userInput.next();
		System.out.println("please wait a second for authentication........");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (this.loginId.equals(loginId) && this.passWord.equals(password)) {
			System.out.println();
			System.out.println(
					"----------------------------AUTHENTICATION PASSED SUCCESSFULLY ! WELCOME ADMIN------------------------");
			System.out.println();
			System.out.println("Your Access Code Is  \"zoho@1234\"(Keep It Confidentially)");
			System.out.println();
			this.adminAccess();
		} else {
			System.out.println();
			System.out.println("                            AUTHENTICATION FAILED");
			System.out.println();
			System.out.println("                  \"Please Enter Valid Username Or Password\"");
			adminCheckingProccess();
		}
	}

	private void adminAccess() {
		System.out.println("Press 1 To Set No Of Seats ");
		System.out.println("Press 2 To Set Playing Movie");
		System.out.println("Press 3 To Modifying Ticket Cost");
		int selection;
		while (true) {
			try {
				selection = userInput.nextInt();
				break;
			} catch (Exception e2) {
				System.out.println("Enter Valid Input !");
				userInput.reset();
				userInput.next();
			}
		}
		System.out.println("✔ 1 to Screen1");
		System.out.println("✔ 2 to Screen2");
		System.out.println("✔ 3 to Screen3");
		int choice;
		while (true) {
			try {
				choice = userInput.nextInt();
				break;
			} catch (Exception e2) {
				System.out.println("Enter Valid Input !");
				userInput.reset();
				userInput.next();
			}
		}
		switch (selection) {
		case 1:
			int noOfSeats;
			while (true) {
				System.out.print("Enter No Of Seats :");
				while (true) {
					try {
						noOfSeats = userInput.nextInt();
						break;
					} catch (Exception e1) {
						System.out.println("Enter Valid Input !");
						userInput.reset();
						userInput.next();
					}
				}
				if (!(noOfSeats >= 10)) {
					System.out.println(" Please Enter Seats Count =>10 ");
					System.out.println();
				} else {
					break;
				}
			}
			switch (choice) {
			case 1:
				MultiplexEnum.SCREEN1.setNoOfSeats(noOfSeats);
				break;
			case 2:
				MultiplexEnum.SCREEN2.setNoOfSeats(noOfSeats);
				break;
			case 3:
				MultiplexEnum.SCREEN1.setNoOfSeats(noOfSeats);
				break;
			default:
				System.out.println("Admin , Please Enter Valid Option !");
			}
			break;
		case 2:
			System.out.print("Enter Movie To Play :");
			String movieName = userInput.next();
			switch (choice) {

			case 1:

				MultiplexEnum.SCREEN1.setCurrentlyPlayingMovie(movieName);
				break;
			case 2:
				MultiplexEnum.SCREEN2.setCurrentlyPlayingMovie(movieName);
				break;
			case 3:
				MultiplexEnum.SCREEN1.setCurrentlyPlayingMovie(movieName);
				break;
			default:
				System.out.println("Admin , Please Enter Valid Option !");
			}
			break;

		case 3:

			System.out.print("Enter Movie Ticket Cost  :");
			int newCost;
			while (true) {
				try {
					newCost = userInput.nextInt();
					break;
				} catch (Exception e) {
					System.out.println("Enter Valid Input !");
					userInput.reset();
					userInput.next();
				}
			}
			switch (choice) {

			case 1:

				MultiplexEnum.SCREEN1.setTicketCost(newCost);
				break;
			case 2:
				MultiplexEnum.SCREEN2.setTicketCost(newCost);
				break;
			case 3:
				MultiplexEnum.SCREEN1.setTicketCost(newCost);
				break;
			default:
				System.out.println("Admin , Please Enter Valid  Option !");
			}
			break;

		}
	}

}
