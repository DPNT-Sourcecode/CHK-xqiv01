package befaster.solutions.CHK;

public class Basket {
	int totalA;
	int totalB;
	int totalC;
	int totalD;
	int totalE;
	int totalF;
	
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
	
	
}



