package RelationClass;

import java.util.ArrayList;

public class Association{
	
	public static void main(String[] args) {
		
		 ArrayList<Employee> employee_list = new ArrayList<>();
		 
		 employee_list.add(new Employee("ajay" , "V Touch" , 10 , "developer" , 45000));
		 employee_list.add(new Employee("vikram" , "V Touch" , 10 , "developer" , 45000));
		 employee_list.add(new Employee("prakash" , "V Touch" , 10 , "manager" , 65000));
		 
		 ArrayList<Intern> intern_list = new ArrayList<>();
		 
		 intern_list.add(new Intern("dharan" , 100 , 19));
		 intern_list.add(new Intern("harish" , 100 , 20));
		 intern_list.add(new Intern("lokesh" , 100 , 20));
		 
		 Office zoho = new Office("Zoho" ,intern_list , employee_list);
		 zoho.viewCompanyName();
		 zoho.viewBuildingDetails();
		 zoho.getBuildingObject();
		 
		 
		 
		 System.out.println("--------------------EMPLOYEE DETAILS--------------------");
		 zoho.viewEmployee();
		 System.out.println("--------------------INTERN DETAILS----------------------");
		 zoho.viewInterns();
		 
	}
}
