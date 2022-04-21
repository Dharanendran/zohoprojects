package RelationClass;

import java.util.ArrayList;

public class Office {
	String company_name ;
	
	ArrayList<Employee>  employees;
	
	ArrayList<Intern>  intern ;
   
	final Building building ;
	  
	Office( String c_name , ArrayList<Intern> intern , ArrayList<Employee> list){
		this.company_name = c_name ;
		this.intern = intern;
		this.employees =list;
	    building = new Building("100m","black","40m",5);
		
	}
	public Building getBuildingObject() {
		return building ;
		
	}
	
	void  viewCompanyName() {
		System.out.println();
		System.out.println();
		System.out.println(String.format("******************************** %S *******************************",company_name));
		System.out.println();
	}
	
	void viewBuildingDetails() {
		if(building != null) {
		
		building.viewBuildingDetails();}
	}
	

	void viewInterns() {
		for(Intern i : intern) {
			i.internDetails();
		}
	}

	void viewEmployee() {
		
		for(Employee i : employees) {
			i.viewEmployeeDetails();
		}
	}
}
