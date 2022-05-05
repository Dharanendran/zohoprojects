package ticketbooking;

import java.util.Scanner;

public class BillingProcess {
	static Scanner userInput = new Scanner(System.in);
	static double snacksCost;

	public static void produceBilling(MultiplexEnum object) {
		snacksOrdering();
		double movieCost = object.getTicketCost();
		double GST = (0.2) * (movieCost);
		double discount = (0.1) * (movieCost);
		double totalCost = movieCost + GST + snacksCost - discount;
		System.out.println("           ____________________________________________");
		System.out.println("          |          ZOHO MULTIPLEX BILLING            |");
		System.out.println("          |____________________________________________|");
		System.out.println(String.format("          |     MOVIE COST    |    %-6s              |", movieCost));
		System.out.println(String.format("          |     GST           |    %-6s              |", GST));
		System.out.println(String.format("          |     DISCOUNT      |    %-6s              |", discount));
		System.out.println(String.format("          |     Snacks Cost   |    %-6s              |", snacksCost));
		System.out.println("          |___________________|________________________|");
		System.out.println(String.format("          |     TOTAL COST    |    %-6s              |", totalCost));
		System.out.println("          |___________________|________________________|");
		System.out.println();

	}

	public static void snacksOrdering() {
		double quantity = 0.0;
		SnacksInterval.POPCORN.showSnackBoard();
		SnacksInterval.BUTTERPOPCORN.showSnackBoard();
		SnacksInterval.ICECREAM.showSnackBoard();
		SnacksInterval.COCOCOLA.showSnackBoard();

		System.out.println();
		System.out.println("✔ 1 To Order Popcorn");
		System.out.println("✔ 2 To Order Butter Popcorn");
		System.out.println("✔ 3 To Order Ice Cream");
		System.out.println("✔ 4 To Order Cococola");
		System.out.println("✔ -1 To Exit");
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
		if (choice != -1) {
			System.out.println("Enter The Quantity You Want :");
			while(true) {
			try {
				quantity = userInput.nextDouble();
				break ;
			} catch (Exception e) {
				System.out.println("Enter Valid Input !");
				userInput.reset();
				userInput.next();
			}
		}}

		switch (choice) {
		case 1 -> {snacksCost = quantity * SnacksInterval.POPCORN.getCost();}
		case 2 -> {snacksCost = quantity * SnacksInterval.BUTTERPOPCORN.getCost();}
		case 3 -> {snacksCost = quantity * SnacksInterval.ICECREAM.getCost();}
		case 4 -> {snacksCost = quantity * SnacksInterval.COCOCOLA.getCost();}
		case -1 -> {
			snacksCost = 0.0;
			break;
		}
		default -> {
			System.out.println("Please Enter The Correct Option !");
			snacksCost = 0.0;
		}

		}

	}

}
