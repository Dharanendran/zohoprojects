package Task3ContactApplication;

public class EmailCheckerUtil {
	static boolean emailChecker(String mail_id) {

		if (mail_id.length() >= 11 && mail_id.contains("@") && mail_id.contains(".") && comchecker(mail_id)
				&& gmailChecker(mail_id)) {
			return true;
		}
		return false;
	}

	public static boolean gmailChecker(String mail_id) {

		for (int i = 0; i < mail_id.length(); i++) {
			if (mail_id.charAt(i) == '@' && mail_id.length() - (i + 1) == 9) {
				if (mail_id.charAt(i + 6) == '.') {
					return true;
				}

			}
		}

		return false;
	}

	public static boolean comchecker(String mail_id) {
		int letterCount = 0;
		for (int i = mail_id.length() - 1; i > -1; i--) {
			if (mail_id.charAt(i) == '.') {
				break;
			}
			letterCount++;

		}

		if (letterCount == 3) {

			return true;
		}

		return false;
	}

}
