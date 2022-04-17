package Task2Constructor;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("enter the datatype of the 2 inputs  for addition process(int,double,char,boolean):");
		String a = in.nextLine();
		Addition addinteger; 

		switch (a) {
		case "int":
			System.out.println("enter two numbers:");
			int b = in.nextInt();
			int c = in.nextInt();
			addinteger = new Addition(b, c);
			System.out.println("the addition of " + addinteger.getValuesa() + " + " + addinteger.getValueb() + " = "
					+ addinteger.displayans());
			break;
		case "double":
			System.out.println("enter two double values:");
			double d = in.nextDouble();
			double e = in.nextDouble();
			Addition adddoubles = new Addition(d, e);
			System.out.println("the addition of " + adddoubles.getValuesa() + " + " + adddoubles.getValueb() + " = "
					+ adddoubles.displayans());
			break;

		case "boolean":
			System.out.println("enter two boolean values:");
			boolean f = in.nextBoolean();
			boolean g = in.nextBoolean();
			Addition addboolean = new Addition(f, g);
			System.out.println("the addition of " + addboolean.getValuesa() + " + " + addboolean.getValueb() + " = "
					+ addboolean.displayans());
			break;

		case "char":
			System.out.println("enter two characters:");
			char h = in.next().charAt(0);
			char i = in.next().charAt(0);
			Addition addchar = new Addition(h, i);
			System.out.println("the addition of " + addchar.getValuesa() + " + " + addchar.getValueb() + " = "
					+ addchar.displayans());
			break;

		}

	}

}
