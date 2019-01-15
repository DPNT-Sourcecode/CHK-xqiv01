package befaster.solutions.CHK;

public class Basket {
	int totalA=0;
	int totalB=0;
	int totalC=0;
	int totalD=0;
	int totalE=0;
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
	
}


