package Task3ContactApplication;

import java.util.ArrayList;

public class viewContactTableUtil {

	public static void contactTable(ArrayList<ContactDetails> contact_list) {
		if (contact_list.size() != 0) {
			System.out.println(
					" _________________________________________________________________________________________");
			System.out.println(
					"|S.NO|         NAME            |           MAIL ID               |        Number          |");
			System.out.println(
					"|____|_________________________|_________________________________|________________________|");
			for (int i = 1; i < (contact_list.size() + 1); i++) {
				System.out.println(
						String.format("| %s  |   %-22s|  %-30s |    %-19s |", i, contact_list.get(i - 1).getName(),
								contact_list.get(i - 1).getMail_id(), contact_list.get(i - 1).getNumber()));
				System.out.println(
						"|____|_________________________|_________________________________|________________________|");

			}
		}
		else {
			System.out.println();
			System.out.println("The contact Table is empty !");
		}
	}

}
