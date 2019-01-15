package befaster.solutions.CHK;

public class Item {
	private char itemSKU;
	private int unitPrice;
	private int qtyForSpecial;
	private int priceForSpecial;
	//boolean specialAvailable;
	
	// set item specifics with default "specials quantity" set to 1 so that checkSpecialCost() function remains valid
	public Item (char sku, int price) {
		itemSKU = sku;
		unitPrice = price;
		qtyForSpecial = 1;
		priceForSpecial = price;
	}
	
	// update specials values
	public void setSpecial(int qty, int price) {
		qtyForSpecial = qty;
		priceForSpecial = price;
		//specialAvailable=true;
	}
	
	// get methods as good practice for keeping variables private
	public char getSKU() {
		return itemSKU;
	}
	public int getPrice() {
		return unitPrice;
	}
	public int getPriceForSpecial() {
		return priceForSpecial;
	}
	public int getQtyForSpecial() {
		return qtyForSpecial;
	}
	// return cost of units with no specials applied
	public int checkCost(int qty) {
		return qty * unitPrice;
	}
	// calculate cost of items with specials applied
	public int checkSpecialCost(int qty) {
		// calculate for the special price by division of total quantity - do not handle remainder
		return (qty/qtyForSpecial*priceForSpecial);
	}
}
