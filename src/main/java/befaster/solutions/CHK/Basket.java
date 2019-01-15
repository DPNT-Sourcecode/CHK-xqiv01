package befaster.solutions.CHK;

public class Basket {
	int totalA;
	int totalB;
	int totalC;
	int totalD;
	int totalE;
	
	Item itemA = new Item('A',50);
	Item itemB = new Item('B',30);
	Item itemC = new Item('C',20);
	Item itemD = new Item('D',15);
	Item itemE = new Item('E',40);
	
	public Basket() {
		totalA=0;
		totalB=0;
		totalC=0;
		totalD=0;
		totalE=0;
	}
	public void addItem(char sku) throws Exception {
		// add to SKU item sum if it is a valid SKU 
		switch (sku) {
		case 'A':
			totalA++;
			break;
		case 'B':
			totalB++;
			break;
		case 'C':
			totalC++;
			break;
		case 'D':
			totalD++;
			break;
		case 'E':
			totalE++;
			break;
		default:
			throw new Exception();
		}
	}
	
	// calculations for the total cost for each item
	public int checkTotals() {
		int totalCost = 0;
		//check for specials of item A in multiples of 5
		itemA.setSpecial(5, 200);
		totalCost += itemA.checkSpecialCost(totalA);
		totalA %= 5;
		//check for specials of item A in multiples of 3
		itemA.setSpecial(3, 130);
		totalCost += itemA.checkSpecialCost(totalA);
		totalA %= 3;
		//check total cost of item A after specials applied
		totalCost += itemA.checkCost(totalA);
		// remove one free B item for every 2 E items
		totalB -= totalE/2;
		if (totalB <0) totalB=0;
		//check for specials of item B in multiples of 2
		itemB.setSpecial(2, 45);
		totalCost += itemB.checkSpecialCost(totalB);
		totalB %= 2;
		//check total cost of item B after specials applied
		totalCost += itemB.checkCost(totalB);
		//check total cost of item C after specials applied
		totalCost += itemC.checkCost(totalC);
		//check total cost of item D after specials applied
		totalCost += itemD.checkCost(totalD);
		//check total cost of item E after specials applied
		totalCost += itemE.checkCost(totalE);
		
		return totalCost;
	}
}


