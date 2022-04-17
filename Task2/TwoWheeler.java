package Task2;


public class TwoWheeler extends RoadTransport{
    
	private String nameOfVehicle;
	static int wheels=2;

    
    
    TwoWheeler(String vehicleName){
        nameOfVehicle = vehicleName;
    }

    TwoWheeler(){}

    public void pickUpSpeed(){
        System.out.println("it has 10 to 100hp");
    }
    public String getVehicleName(){
        return nameOfVehicle;
    }
    public void numberOfTyres() {
        System.out.println("it has two wheels");
    }

    public void mileage() {
        System.out.println("85kmpl");
    }
    


}
