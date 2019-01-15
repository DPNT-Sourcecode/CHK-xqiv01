package befaster.solutions.CHK;

public class Register {
	Basket shopping;
	
	Item itemA = new Item('A',50);
	Item itemB = new Item('B',30);
	Item itemC = new Item('C',20);
	Item itemD = new Item('D',15);
	Item itemE = new Item('E',40);
	Item itemF = new Item('F',10);
	
	public Register (Basket shopping) {
		this.shopping = shopping;
	}
	
	// calculations for the total cost for each item
		public int checkTotals() {
			int totalCost = 0;
			//check for specials of item A in multiples of 5
			itemA.setSpecial(5, 200);
			totalCost += itemA.checkSpecialCost(shopping.totalA);
			shopping.totalA %= 5;
			//check for specials of item A in multiples of 3
			itemA.setSpecial(3, 130);
			totalCost += itemA.checkSpecialCost(shopping.totalA);
			shopping.totalA %= 3;
			//check total cost of item A after specials applied
			totalCost += itemA.checkCost(shopping.totalA);
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
			
			return totalCost;
		}
}

