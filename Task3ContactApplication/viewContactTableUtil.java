package Task3ContactApplication;

import java.util.ArrayList;

public class viewContactTableUtil {
	
	public static void contactTable(ArrayList<ContactDetails> contact_list) {
		System.out
				.println(" _________________________________________________________________________________________");
		System.out
				.println("|S.NO|         NAME            |           MAIL ID               |        Number          |");
		System.out
				.println("|____|_________________________|_________________________________|________________________|");
		for (int i = 1; i < (contact_list.size() + 1); i++) {
			System.out.println(String.format("| %s  |   %-22s|  %-30s |    %-19s |", i, contact_list.get(i - 1).name,
					contact_list.get(i - 1).mail_id, contact_list.get(i - 1).number));
			System.out.println(
					"|____|_________________________|_________________________________|________________________|");

		}
	}

}
