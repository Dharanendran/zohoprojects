package APR_25_interfacetask;

import java.util.ArrayList;

public class StudentExInterface{
	
	
	String name ;
	int age ;
	
	StudentExInterface(String name , int  age ){
		this.name = name ; 
		this.age = age ;
	}
	
	public static void main(String[] args) {
		
		ArrayList<StudentExInterface> stu_arr = new ArrayList<>(4);
		ArrayList<Department> dep_arr = new ArrayList<>();
		stu_arr.add(new StudentExInterface("dharan" , 19));
		stu_arr.add(new StudentExInterface("harish" , 20));
		stu_arr.add(new StudentExInterface("prakash" , 20));
		stu_arr.add(new StudentExInterface("barath" , 20));
		
		dep_arr.add(new Department("cse" , 50 ,stu_arr));
		
		Department dep = new Department("ece" , 40 , stu_arr);
		
		

		for(Department i :dep_arr) {System.out.println(i.dept_name);}
		Component comp = new Component(dep);
		comp.add(dep_arr , dep);
		for(Department i :dep_arr) {System.out.println(i.dept_name);}

	}
}


class Department implements Component.D{
	String dept_name ;
	int strength ;
	ArrayList<StudentExInterface> student_list ;
	
	Department(String name , int strength ,ArrayList<StudentExInterface> arr){
		this.dept_name = name ;
		this.strength =strength ;
		this.student_list = arr ;
	}
	
	
	@Override
	public Department getObjA() {
		return this;
	}
	
	
	
}

class Component{
	
	D obj ;
	
	interface D{
		Department getObjA();
		
	}
	
	Component(D obj){
		this.obj = obj ;
	}
	
	
	void add(ArrayList <Department> arr , D obj) {
		arr.add((Department) obj);
		
		
	}
	
}
