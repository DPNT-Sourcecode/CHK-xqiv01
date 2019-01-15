package befaster.solutions.CHK;

import java.util.HashMap;

public class Register {
	HashMap<Item, Integer> itemsInBasket;
	AvailableItems allItems;
	
	public Register (Basket shopping) {
		this.itemsInBasket = shopping.itemsInBasket;
		this.allItems = shopping.itemsAvail;
	}
	
	// calculations for the total cost for each item
		public int checkTotals() throws Exception {
			int totalCost = 0;
			
			//total count for items
			int total=0;
			
			// Multi buy special (round 5)
			Item itemS = allItems.getValidItem('S');
			Item itemT = allItems.getValidItem('T');
			Item itemX = allItems.getValidItem('X');
			Item itemY = allItems.getValidItem('Y');
			Item itemZ = allItems.getValidItem('Z');
			total += itemsInBasket.getOrDefault(itemS,0);
			total += itemsInBasket.getOrDefault(itemT,0);
			total += itemsInBasket.getOrDefault(itemX,0);
			total += itemsInBasket.getOrDefault(itemY,0);
			total += itemsInBasket.getOrDefault(itemZ,0);
			while (total>=3) {
				totalCost+=45;
				int currGroup = 3; // allows items to be removed from count 3 at a time in price priority for best customer outcome
				if (itemsInBasket.getOrDefault(itemZ,0)>=currGroup) itemsInBasket.replace(itemZ, itemsInBasket.get(itemZ)-currGroup);
				else {
					currGroup-=itemsInBasket.getOrDefault(itemZ,0);
					if (itemsInBasket.getOrDefault(itemS,0)>=currGroup) itemsInBasket.replace(itemS, itemsInBasket.get(itemS)-currGroup);
					else {
						currGroup-=itemsInBasket.getOrDefault(itemS,0);
						if (itemsInBasket.getOrDefault(itemT,0)>=currGroup) itemsInBasket.replace(itemT, itemsInBasket.get(itemT)-currGroup);
						else {
							currGroup-=itemsInBasket.getOrDefault(itemT,0);
							if (itemsInBasket.getOrDefault(itemY,0)>=currGroup) itemsInBasket.replace(itemY, itemsInBasket.get(itemY)-currGroup);
							else {
								currGroup-=itemsInBasket.getOrDefault(itemY,0);
								if (itemsInBasket.getOrDefault(itemX,0)>=currGroup) itemsInBasket.replace(itemX, itemsInBasket.get(itemX)-currGroup);
								else {
									currGroup-=itemsInBasket.getOrDefault(itemX,0);
								
								}
							}
						}
					}
				}
				total-=3;
			}
			
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

