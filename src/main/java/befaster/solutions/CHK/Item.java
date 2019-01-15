package befaster.solutions.CHK;

public class Item {
	private char itemSKU;
	private int unitPrice;
	private int qtyForSpecial;
	private int priceForSpecial;
	boolean specialAvailable;
	
	public Item (char sku, int price) {
		itemSKU = sku;
		unitPrice = price;
	}
	public void setSpecial(int qty, int price) {
		qtyForSpecial = qty;
		priceForSpecial = price;
		specialAvailable=true;
	}
	
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
	public int checkCost(int qty) {
		return qty * unitPrice;
	}
	public int checkSpecialCost(int qty) {
		// calculate for the special price by division of total quantity - do not handle remainder
		return (qty/qtyForSpecial*priceForSpecial);
	}
}
