package Task2;

import java.util.Scanner;

public class Task2Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String choice;
		System.out.println("Chooce the Transport you want(car/bike/ship/plane)");
		choice = in.next().toLowerCase();
		
		switch (choice) {
		
		case "car":
			System.out.print("Enter the name of the car: ");
			String vehicleName = in.next();
			FourWheeler car = new FourWheeler();
			car.pickUpSpeed();
			car.numberOfTyres();
			car.mileage();
			System.out.println("No.of wheels:" + FourWheeler.wheel);
			break;
			
		case "bike":
			System.out.print("Enter the name of the bike: ");
			String bikeName = in.next();
			TwoWheeler bike = new TwoWheeler(bikeName);
			System.out.println("Bike name: " + bike.getVehicleName());
			System.out.println("No.of wheels:" + TwoWheeler.wheels);
			bike.canSail();
			RoadTransport bicycle = new TwoWheeler();
			bicycle.canRide();
			bicycle.mileage();
			break;
			
		case "ship":
			System.out.print("Enter the name of the ship: ");
			String shipName = in.next();
			Submarine ship = new Submarine();
			ship.canSail();
			ship.canFly();

		}
//		System.out.print("Enter the name of the vehicle Name: ");
//		Scanner in = new Scanner(System.in);
//		String vehicleName = in.next();

	}
}
