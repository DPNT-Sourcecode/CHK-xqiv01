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
			int totalS = itemsInBasket.getOrDefault(itemS,0);
			int totalT = itemsInBasket.getOrDefault(itemT,0);
			int totalX = itemsInBasket.getOrDefault(itemX,0);
			int totalY = itemsInBasket.getOrDefault(itemY,0);
			int totalZ = itemsInBasket.getOrDefault(itemZ,0);
			total += totalS;
			total += totalT;
			total += totalX;
			total += totalY;
			total += totalZ;
			while (total>=3) {
				int currGroup = 3; // allows items to be removed from count 3 at a time in price priority for best customer outcome
								
				if (totalZ>0&&currGroup>0) {
					if (totalZ>=3) currGroup-=3;
					else currGroup-=totalZ;
				}
				
				if (totalS>0&&currGroup>0) {
					if (totalS>=3) currGroup-=3;
					else currGroup-=totalS;
				}
				if (totalT>0&&currGroup>0) {
					if (totalT>=3) currGroup-=3;
					else currGroup-=totalT;
				}
				if (totalY>0&&currGroup>0) {
					if (totalY>=3) currGroup-=3;
					else currGroup-=totalY;
				}
				if (totalX>0&&currGroup>0) {
					if (totalX>=3) currGroup-=3;
					else currGroup-=totalX;
				}
				
				totalCost+=45;				
				total-=3;
			}
			itemsInBasket.replace(itemZ, totalZ);
			itemsInBasket.replace(itemS, totalS);
			itemsInBasket.replace(itemT, totalT);
			itemsInBasket.replace(itemY, totalY);
			itemsInBasket.replace(itemX, totalX);
			System.out.println("curr:"+totalCost);
			System.out.println(itemsInBasket.getOrDefault(itemX,0));
			System.out.println(itemsInBasket.getOrDefault(itemY,0));
			System.out.println(itemsInBasket.getOrDefault(itemZ,0));
			
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



