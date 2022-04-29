package Task3ContactApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import organisationlist.OrganizationDetails;

public interface AddItemListener {

	public ArrayList<ContactDetails> getList();

	public ContactDetails getNewItem();
	
	public OrganizationDetails getOrgObj() ;
	
	public HashMap<String , OrganizationDetails> getorgHashMap();
	
}
