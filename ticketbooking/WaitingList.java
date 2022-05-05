package ticketbooking;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class WaitingList {

	HashMap<String, Queue<Customer>> waitingDetails = new HashMap<>();
	Scanner comfirmation = new Scanner(System.in);

	public void waitingProcess(Customer customer, String ticketNo) {
		Queue<Customer> waitingQueue = new PriorityQueue<>();
		System.out.println(" _____________________________________________");
		System.out.printf("| There Are %s People Already In WaitingList  |\n", waitingDetails.get(ticketNo).size());
		System.out.println("|_____________________________________________|");
		System.out.println();
		System.out.println("✔ Press 1 To Add Your request Waiting List ! ");
		int choice;
		while (true) {
			try {
				choice = comfirmation.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Enter Valid Input !");
				comfirmation.reset();
				comfirmation.next();
			}
		}
		if (choice == 1) {
			if (waitingDetails.containsKey(ticketNo)) {
				waitingDetails.get(ticketNo).offer(customer);
			} else {
				waitingQueue.offer(customer);
				waitingDetails.put(ticketNo, waitingQueue);
			}
		}
		return;

	}
}
