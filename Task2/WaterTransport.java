package Task2;

public class WaterTransport implements Transport {

	@Override
	public void pickUpSpeed() {
		System.out.println("pickup speed is 200kmph to 350kmph");

	}

	@Override
	public void numberOfTyres() {
		System.out.println("no tyres");

	}

	@Override
	public void mileage() {
		System.out.println("water transport has milage 20kmpl");
	}

	@Override
	public void canFly() {
		System.out.println("water transport cant fly");
	}

	@Override
	public void canSail() {
		System.out.println("it can sail");
	}

	@Override
	public void canRide() {
		System.out.println();

	}
}
