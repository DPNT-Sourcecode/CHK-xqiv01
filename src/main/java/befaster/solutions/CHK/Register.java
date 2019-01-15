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
		public int checkTotals() {
			int totalCost = 0;
			// check for buy items/get free
			itemsInBasket.getOrDefault(allItems.getValidItem('A'), defaultValue)
			
			//apply specials
			int total;
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
			
			
						
			// remove one free B item for every 2 E items
			shopping.totalB -= shopping.totalE/2;
			if (shopping.totalB <0) shopping.totalB=0;
			//check for specials of item B in multiples of 2
			itemB.setSpecial(2, 45);
			totalCost += itemB.checkSpecialCost(shopping.totalB);
			shopping.totalB %= 2;
			//check total cost of item B after specials applied
			totalCost += itemB.checkCost(shopping.totalB);
			//check total cost of item C after specials applied
			totalCost += itemC.checkCost(shopping.totalC);
			//check total cost of item D after specials applied
			totalCost += itemD.checkCost(shopping.totalD);
			//check total cost of item E after specials applied
			totalCost += itemE.checkCost(shopping.totalE);
			// reduction in totalF for free items
			shopping.totalF -= (shopping.totalF/3);
			//check total cost of item F after specials applied
			totalCost += itemF.checkCost(shopping.totalF);
			//check total cost of item G after specials applied
			totalCost += itemG.checkCost(shopping.totalG);
			//check for specials of item H in multiples of 10
			itemH.setSpecial(10, 80);
			totalCost += itemH.checkSpecialCost(shopping.totalH);
			shopping.totalH %= 10;
			//check for specials of item H in multiples of 5
			itemH.setSpecial(5, 45);
			totalCost += itemH.checkSpecialCost(shopping.totalH);
			shopping.totalH %= 5;
			//check total cost of item H after specials applied
			totalCost += itemH.checkCost(shopping.totalH);
			//check total cost of item I after specials applied
			totalCost += itemI.checkCost(shopping.totalI);
			//check total cost of item J after specials applied
			totalCost += itemJ.checkCost(shopping.totalJ);
			//check for specials of item K in multiples of 2
			itemK.setSpecial(2, 150);
			totalCost += itemK.checkSpecialCost(shopping.totalK);
			shopping.totalK %= 2;
			//check total cost of item K after specials applied
			totalCost += itemK.checkCost(shopping.totalK);
			//check total cost of item L after specials applied
			totalCost += itemL.checkCost(shopping.totalL);
			// remove one free M item for every 3 N items
			shopping.totalM -= shopping.totalN/3;
			if (shopping.totalM <0) shopping.totalM=0;
			//check total cost of item M after specials applied
			totalCost += itemM.checkCost(shopping.totalM);
			//check total cost of item N after specials applied
			totalCost += itemN.checkCost(shopping.totalN);
			//check total cost of item O after specials applied
			totalCost += itemO.checkCost(shopping.totalO);
			//check for specials of item P in multiples of 5
			itemP.setSpecial(5, 200);
			totalCost += itemP.checkSpecialCost(shopping.totalP);
			shopping.totalP %= 5;
			//check total cost of item P after specials applied
			totalCost += itemP.checkCost(shopping.totalP);
			// remove one free Q item for every 3 R items
			shopping.totalQ -= shopping.totalR/3;
			if (shopping.totalQ <0) shopping.totalQ=0;
			//check for specials of item Q in multiples of 3
			itemQ.setSpecial(3, 80);
			totalCost += itemQ.checkSpecialCost(shopping.totalQ);
			shopping.totalQ %= 3;
			//check total cost of item Q after specials applied
			totalCost += itemQ.checkCost(shopping.totalQ);
			//check total cost of item R after specials applied
			totalCost += itemR.checkCost(shopping.totalR);
			//check total cost of item S after specials applied
			totalCost += itemS.checkCost(shopping.totalS);
			//check total cost of item T after specials applied
			totalCost += itemT.checkCost(shopping.totalT);
			// reduction in totalU for free items
			shopping.totalU -= (shopping.totalU/4);
			//check total cost of item U after specials applied
			totalCost += itemU.checkCost(shopping.totalU);
			//check for specials of item V in multiples of 3
			itemV.setSpecial(3, 130);
			totalCost += itemV.checkSpecialCost(shopping.totalV);
			shopping.totalV %= 3;
			//check for specials of item V in multiples of 2
			itemV.setSpecial(2, 90);
			totalCost += itemV.checkSpecialCost(shopping.totalV);
			shopping.totalV %= 2;
			//check total cost of item V after specials applied
			totalCost += itemV.checkCost(shopping.totalV);
			//check total cost of item W after specials applied
			totalCost += itemW.checkCost(shopping.totalW);
			//check total cost of item X after specials applied
			totalCost += itemX.checkCost(shopping.totalX);
			//check total cost of item Y after specials applied
			totalCost += itemY.checkCost(shopping.totalY);
			//check total cost of item Z after specials applied
			totalCost += itemZ.checkCost(shopping.totalZ);
			
			return totalCost;
		}
}


