package befaster.solutions.CHK;

import java.util.HashMap;

public class Basket {
	
	HashMap<Item, Integer> itemsInBasket = new HashMap<Item, Integer>();
	AvailableItems itemsAvail = new AvailableItems();
	
	public Basket() {

	}
	public void addItem(char sku) throws Exception {
		// add to SKU item sum if it is a valid SKU 
		
		Item newItem = itemsAvail.getValidItem(sku);
		
		if (itemsInBasket.containsKey(newItem)) itemsInBasket.replace(newItem, itemsInBasket.get(newItem)+1);
		else itemsInBasket.put(newItem,1);
	}
	
	
}

