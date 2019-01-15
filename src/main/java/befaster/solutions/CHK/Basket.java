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
	
	public int checkTotals() {
		
	}
}




