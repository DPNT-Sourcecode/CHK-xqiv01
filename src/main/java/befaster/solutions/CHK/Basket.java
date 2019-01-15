package befaster.solutions.CHK;

public class Basket {
	int totalA;
	int totalB;
	int totalC;
	int totalD;
	int totalE;
	int totalF;
	int totalG;
	int totalH;
	int totalI;
	int totalJ;
	int totalK;
	int totalL;
	int totalM;
	int totalN;
	int totalO;
	int totalP;
	int totalQ;
	int totalR;
	int totalS;
	int totalT;
	int totalU;
	int totalV;
	int totalW;
	int totalX;
	int totalY;
	int totalZ;
	
	public Basket() {
		totalA=0;
		totalB=0;
		totalC=0;
		totalD=0;
		totalE=0;
		totalF=0;
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
		case 'F':
			totalF++;
			break;
		case 'G':
			totalG++;
			break;
		case 'H':
			totalH++;
			break;
		case 'I':
			totalI++;
			break;
		case 'J':
			totalJ++;
			break;
		case 'K':
			totalK++;
			break;
		case 'L':
			totalL++;
			break;
		case 'M':
			totalM++;
			break;
		case 'N':
			totalN++;
			break;
		case 'O':
			totalO++;
			break;
		case 'P':
			totalP++;
			break;
		case 'Q':
			totalQ++;
			break;
		case 'R':
			totalR++;
			break;
		case 'S':
			totalS++;
			break;
		case 'T':
			totalT++;
			break;
		case 'U':
			totalU++;
			break;
		case 'V':
			totalV++;
			break;
		case 'W':
			totalW++;
			break;
		case 'X':
			totalX++;
			break;
		case 'Y':
			totalY++;
			break;	
		case 'Z':
			totalZ++;
			break;
		default:
			throw new Exception();
		}
	}
	
	
}
