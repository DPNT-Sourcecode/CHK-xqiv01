package befaster.solutions.CHK;

public class Register {
	Basket shopping;
	
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
			//check total cost of item G after specials applied
			totalCost += itemG.checkCost(shopping.totalG);
			//check total cost of item H after specials applied
			totalCost += itemH.checkCost(shopping.totalH);
			//check total cost of item I after specials applied
			totalCost += itemI.checkCost(shopping.totalI);
			//check total cost of item J after specials applied
			totalCost += itemJ.checkCost(shopping.totalJ);
			//check total cost of item K after specials applied
			totalCost += itemK.checkCost(shopping.totalK);
			//check total cost of item L after specials applied
			totalCost += itemL.checkCost(shopping.totalL);
			//check total cost of item M after specials applied
			totalCost += itemM.checkCost(shopping.totalM);
			//check total cost of item N after specials applied
			totalCost += itemN.checkCost(shopping.totalN);
			//check total cost of item O after specials applied
			totalCost += itemO.checkCost(shopping.totalO);
			//check total cost of item P after specials applied
			totalCost += itemP.checkCost(shopping.totalP);
			//check total cost of item Q after specials applied
			totalCost += itemQ.checkCost(shopping.totalQ);
			//check total cost of item R after specials applied
			totalCost += itemR.checkCost(shopping.totalR);
			//check total cost of item S after specials applied
			totalCost += itemS.checkCost(shopping.totalS);
			//check total cost of item T after specials applied
			totalCost += itemT.checkCost(shopping.totalT);
			//check total cost of item U after specials applied
			totalCost += itemU.checkCost(shopping.totalU);
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


