package RelationClass;

public class Employee {
	static String ceo ="Sridhar Vembhu";
	String name ;
	String domain ;
	int experience ;
	int salary ;
	String designation ;
	
	Employee(String name , String domain , int exp , String designation , int salary){
		this.name = name ;
		this.domain = domain ;
		this.experience = exp ;
		this.designation = designation ;
		this.salary = salary ;
	}
	
	public void viewEmployeeDetails() {
		
		System.out.println();
		System.out.println(String.format("Name : %s %nDomain : %s %nExperience : %s %nSalary : %s %nDesignation : %s ",name, domain , experience , salary , designation));
	}
	
}
