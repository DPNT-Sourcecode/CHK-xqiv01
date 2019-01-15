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
		if (specialAvailable) {
			// calculate for the special price based on remainder and division of total quantity
			return (qty%qtyForSpecial*unitPrice)+(qty/qtyForSpecial*priceForSpecial);
		}
		return qty * unitPrice;
	}
}


