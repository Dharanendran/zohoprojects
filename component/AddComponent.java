package component;

import Task3ContactApplication.AddContact;
import Task3ContactApplication.AddItemListener;
import organisationlist.AddOrg;

public class AddComponent {

	public void add_item (AddItemListener addItemListener) {
		if(addItemListener instanceof AddOrg)
			addItemListener.getList().add(addItemListener.getNewItem());
		else if(addItemListener instanceof AddContact)
			addItemListener.getList().add(addItemListener.getNewItem());
			//addItemListener.getorgHashMap().put( addItemListener.getOrgObj().getOrg_name(), addItemListener.getOrgObj());
	}
}
