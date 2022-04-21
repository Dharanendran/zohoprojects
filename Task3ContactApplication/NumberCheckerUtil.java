package Task3ContactApplication;

public class NumberCheckerUtil {
	
	public static boolean numberChecker(String num) {
		if (num.length() == 10 && (Character.getNumericValue(num.charAt(0))) < 10
				&& (Character.getNumericValue(num.charAt(0))) > 5) {

			return true;
		}
		System.out.println("OOPS! ,The Number You Entered Is InValid !");
		return false;
	}

}
