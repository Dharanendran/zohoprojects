package RelationClass;

import java.util.ArrayList;

public class Intern {
	ArrayList<Intern> intern_list ;
	String name ;
	int days ;
	int age ;
	static String work ="work is learning java";
	
	
	Intern(String name , int days , int age){
		this.name = name ;
		this.days = days;
		this.age = age ;
		
	}
	
	public void internDetails() {
		
		System.out.println();
		System.out.println(String.format("Intern Name : %s %nWorking_Days : %s %nIntern age : %s",this.name ,this.days ,this.age,this.work));
	}
	
	

	
}
