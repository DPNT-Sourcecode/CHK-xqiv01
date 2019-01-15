package befaster.solutions.CHK;

import java.util.HashMap;

public class Register {
	HashMap<Item, Integer> itemsInBasket;
	AvailableItems allItems;
	
	Item itemA = new Item('A',50);
	Item itemB = new Item('B',30);
	Item itemC = new Item('C',20);
	Item itemD = new Item('D',15);
	Item itemE = new Item('E',40);
	Item itemF = new Item('F',10);
	Item itemG = new Item('G',20);
	Item itemH = new Item('H',10);
	Item itemI = new Item('I',35);
	Item itemJ = new Item('J',60);
	Item itemK = new Item('K',80);
	Item itemL = new Item('L',90);
	Item itemM = new Item('M',15);
	Item itemN = new Item('N',40);
	Item itemO = new Item('O',10);
	Item itemP = new Item('P',50);
	Item itemQ = new Item('Q',30);
	Item itemR = new Item('R',50);
	Item itemS = new Item('S',30);
	Item itemT = new Item('T',20);
	Item itemU = new Item('U',40);
	Item itemV = new Item('V',50);
	Item itemW = new Item('W',20);
	Item itemX = new Item('X',90);
	Item itemY = new Item('Y',10);
	Item itemZ = new Item('Z',50);
	
	public Register (Basket shopping) {
		this.itemsInBasket = shopping.itemsInBasket;
		this.allItems = shopping.itemsAvail;
	}
	
	// calculations for the total cost for each item
		public int checkTotals() throws Exception {
			int totalCost = 0;
			
			//total count for items
			int total;
			
			// check for buy items/get free
			Item buyItem;
			Item freeItem;
			buyItem = allItems.getValidItem('E');
			freeItem = allItems.getValidItem('B');
			if (itemsInBasket.containsKey(buyItem)&&itemsInBasket.containsKey(freeItem)) {
				total = itemsInBasket.get(freeItem);
				total -= itemsInBasket.get(buyItem)/2;
				if (total <0) total=0;
				itemsInBasket.replace(freeItem, total);
			}
			buyItem = allItems.getValidItem('F');
			freeItem = allItems.getValidItem('F');
			if (itemsInBasket.containsKey(buyItem)&&itemsInBasket.containsKey(freeItem)) {
				total = itemsInBasket.get(freeItem);
				total -= itemsInBasket.get(buyItem)/3;
				if (total <0) total=0;
				itemsInBasket.replace(freeItem, total);
			}
			buyItem = allItems.getValidItem('N');
			freeItem = allItems.getValidItem('M');
			if (itemsInBasket.containsKey(buyItem)&&itemsInBasket.containsKey(freeItem)) {
				total = itemsInBasket.get(freeItem);
				total -= itemsInBasket.get(buyItem)/3;
				if (total <0) total=0;
				itemsInBasket.replace(freeItem, total);
			}
			buyItem = allItems.getValidItem('R');
			freeItem = allItems.getValidItem('Q');
			if (itemsInBasket.containsKey(buyItem)&&itemsInBasket.containsKey(freeItem)) {
				total = itemsInBasket.get(freeItem);
				total -= itemsInBasket.get(buyItem)/3;
				if (total <0) total=0;
				itemsInBasket.replace(freeItem, total);
			}
			buyItem = allItems.getValidItem('U');
			freeItem = allItems.getValidItem('U');
			if (itemsInBasket.containsKey(buyItem)&&itemsInBasket.containsKey(freeItem)) {
				total = itemsInBasket.get(freeItem);
				total -= itemsInBasket.get(buyItem)/4;
				if (total <0) total=0;
				itemsInBasket.replace(freeItem, total);
			}
			
			//apply specials

			Item specialItem = allItems.getValidItem('A');
			if (itemsInBasket.containsKey(specialItem)) {
				total = itemsInBasket.get(specialItem);
				specialItem.setSpecial(5, 200);
				totalCost += specialItem.checkSpecialCost(total);
				total %= 5;
				specialItem.setSpecial(3, 130);
				totalCost += specialItem.checkSpecialCost(total);
				total %= 3;
				itemsInBasket.replace(specialItem, total);
			}
			specialItem = allItems.getValidItem('B');
			if (itemsInBasket.containsKey(specialItem)) {
				total = itemsInBasket.get(specialItem);
				specialItem.setSpecial(2, 45);
				totalCost += specialItem.checkSpecialCost(total);
				total %= 2;
				itemsInBasket.replace(specialItem, total);
			}
			specialItem = allItems.getValidItem('H');
			if (itemsInBasket.containsKey(specialItem)) {
				total = itemsInBasket.get(specialItem);
				specialItem.setSpecial(10, 80);
				totalCost += specialItem.checkSpecialCost(total);
				total %= 10;
				specialItem.setSpecial(5, 45);
				totalCost += specialItem.checkSpecialCost(total);
				total %= 5;
				itemsInBasket.replace(specialItem, total);
			}
			specialItem = allItems.getValidItem('K');
			if (itemsInBasket.containsKey(specialItem)) {
				total = itemsInBasket.get(specialItem);
				specialItem.setSpecial(2, 120);
				totalCost += specialItem.checkSpecialCost(total);
				total %= 2;
				itemsInBasket.replace(specialItem, total);
			}
			specialItem = allItems.getValidItem('P');
			if (itemsInBasket.containsKey(specialItem)) {
				total = itemsInBasket.get(specialItem);
				specialItem.setSpecial(5, 200);
				totalCost += specialItem.checkSpecialCost(total);
				total %= 5;
				itemsInBasket.replace(specialItem, total);
			}
			specialItem = allItems.getValidItem('Q');
			if (itemsInBasket.containsKey(specialItem)) {
				total = itemsInBasket.get(specialItem);
				specialItem.setSpecial(3, 80);
				totalCost += specialItem.checkSpecialCost(total);
				total %= 3;
				itemsInBasket.replace(specialItem, total);
			}
			specialItem = allItems.getValidItem('V');
			if (itemsInBasket.containsKey(specialItem)) {
				total = itemsInBasket.get(specialItem);
				specialItem.setSpecial(3, 130);
				totalCost += specialItem.checkSpecialCost(total);
				total %= 3;
				specialItem.setSpecial(2, 90);
				totalCost += specialItem.checkSpecialCost(total);
				total %= 2;
				itemsInBasket.replace(specialItem, total);
			}
			
			//calculate remainder
			for(Item currItem: itemsInBasket.keySet()) {
				totalCost += currItem.checkCost(itemsInBasket.get(currItem));
			}
			
						
			return totalCost;
		}
}

