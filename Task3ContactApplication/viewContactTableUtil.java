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
						String.format("| %s  |   %-22s|  %-30s |    %-19s |", i, contact_list.get(i - 1).getName().length()>22 ? (contact_list.get(i - 1).getName().subSequence(0, 17)+"."+"."+"."+"."):contact_list.get(i - 1).getName(),
								contact_list.get(i - 1).getMail_id().length() > 30 ?( contact_list.get(i - 1).getMail_id().subSequence(0, 24)+"."+"."+ "."+".") :contact_list.get(i - 1).getMail_id(), contact_list.get(i - 1).getNumber()));
				System.out.println(
						"|____|_________________________|_________________________________|________________________|");

			}
			System.out.println();
			System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
			System.out.println();
			System.out.println(
					" _________________________________________________________________________________________");
			System.out.println(
					"|                                                                                         |");
			System.out.println(
					"|                                    ADDRESS DETAILS                                      |");
			System.out.println(
					"|_________________________________________________________________________________________|");
			System.out.println(
					"|S.NO|      Door No            |         Street Name             |        pin code        |");
			System.out.println(
					"|____|_________________________|_________________________________|________________________|");
			for (int i = 1; i < (contact_list.size() + 1); i++) {

				System.out.println(String.format("| %s  |        %-17s|      %-26s |        %-15s |", i,
						contact_list.get(i - 1).address.getDoor_no() > 0 ? contact_list.get(i - 1).address.getDoor_no()
								: "-",
						contact_list.get(i - 1).address.getStreet_name() != null
								? contact_list.get(i - 1).address.getStreet_name()
								: "-",
						contact_list.get(i - 1).address.getPin_code() > 0
								? contact_list.get(i - 1).address.getPin_code()
								: "-"));
				System.out.println(
						"|____|_________________________|_________________________________|________________________|");

			}
		} else {
			System.out.println();
			System.out.println("The contact Table is empty ! please add contact by pressing 3");
		}
	}

}
