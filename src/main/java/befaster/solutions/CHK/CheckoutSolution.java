package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;
import java.io.*;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        //throw new SolutionNotImplementedException();
    	
    	int totalCost = 0;
    	char [] items = skus.toCharArray();
    	
    	Item itemA = new Item('A',50);
    	itemA.setSpecial(3, 130);
    	Item itemB = new Item('B',30);
    	itemB.setSpecial(2, 45);
    	Item itemC = new Item('C',20);
    	Item itemD = new Item('D',15);
    	
    	int totalA=0;
    	int totalB=0;
    	int totalC=0;
    	int totalD=0;
    	
    	// buying no items is no cost but shouldn't be considered an illegal input
    	if (skus.isEmpty()) return 0;
    	
    	try {
    		for (char item:items) {
    			switch (item) {
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
    			default:
    				throw new Exception();
    					
    			}
    		}
    		
    		
    		return totalCost;
    	}
    	catch (Exception e) {
    		return -1;
    	}
    	
    }
}


