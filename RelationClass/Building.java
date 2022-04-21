package RelationClass;

public class Building {
	
	String height ;
	String colour ;
	String breath ;
	int no_carparks ;
	
	Building(String height , String colour , String breath ,int nos){
		this.height = height ;
		this.colour = colour ;
		this.breath = breath ;
		this.no_carparks= nos ;
		
	
	}
	
	public void viewBuildingDetails() {
		System.out.println("--------------------BUILDING DETAILS--------------------");
		System.out.println();
		System.out.println(String.format("Height of the building : %s %ncolour of the building is: %s %nBreath of the building is: %s %nNumber of car park present: %s %n",height , colour ,breath , no_carparks));
		System.out.println();
	}
	
}
