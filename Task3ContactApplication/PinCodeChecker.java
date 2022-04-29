package Task3ContactApplication;

import java.util.Scanner;
import java.util.regex.*;

public class PinCodeChecker {
	
	static Scanner choice = new Scanner(System.in);
	static int pin_code;
	
	
	public static int getValidPincode() {
		System.out.print("pin code    :");
		pin_code = choice.nextInt();
		if(PinCodeChecker.isValidPinCode(Integer.toString(pin_code))){
			return pin_code;
		}
		System.out.println();
		System.out.println("Enter valid pin code !");
		System.out.println();
		return getValidPincode();
	}

	public static boolean isValidPinCode(String pinCode) {

		String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";

		Pattern p = Pattern.compile(regex);

		if (pinCode == null) {
			return false;
		}

		Matcher m = p.matcher(pinCode);

		return m.matches();
	}
}
