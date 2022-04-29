package APR_25_interfacetask;

import java.util.ArrayList;

public class InterfaceMain {

	public static void main(String[] args) {

		ArrayList<Student> stu_arr = new ArrayList<>(4);

		ArrayList<Department> dep_arr = new ArrayList<>();

		stu_arr.add(new Student("dharan", 19));
		stu_arr.add(new Student("harish", 20));
		stu_arr.add(new Student("prakash", 20));
		stu_arr.add(new Student("barath", 20));

		dep_arr.add(new Department("cse", 50, stu_arr));


		for (Department i : dep_arr) {
			System.out.println(i.dept_name);
		}

		Department dep = new Department("ece", 40, stu_arr);
		Component.D comp = new Department();
		Component objcomp = new Component(comp);
		objcomp.add(dep_arr , dep);

		for (Department i : dep_arr) {
			System.out.println(i.dept_name);
		}

	}

}

class Student {

	String name;
	int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

}

class Department implements Component.D {
	String dept_name;
	int strength;
	ArrayList<Student> student_list;

	Department(String name, int strength, ArrayList<Student> arr) {
		this.dept_name = name;
		this.strength = strength;
		this.student_list = arr;
	}

	public Department() {

	}

	@Override
	public Department getObjA() {
		return this;
	}

}

class Component {

	D obj;

	Component(D obj) {
		this.obj =obj;
		System.out.println(obj.getClass());	
	}

	interface D {
		Department getObjA();
	}

	void add(ArrayList<Department> arr , D obj) {

		arr.add(((Department)obj));
		System.out.println("within method");
		for (Department i : arr) {
			System.out.println(i.dept_name);
		}
		System.out.println();
		;

	}

}
