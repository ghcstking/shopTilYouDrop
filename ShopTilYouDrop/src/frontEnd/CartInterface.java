package frontEnd;

import java.util.ArrayList;

import customer.StoreItem;

public interface CartInterface {
	void addItem(StoreItem i);

	void removeItem(StoreItem i);
	
	//public ArrayList<StoreItem> getPurchasedItems();
}
