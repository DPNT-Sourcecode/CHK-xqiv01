package befaster.solutions.CHK;

//import befaster.runner.SolutionNotImplementedException;


public class CheckoutSolution {
    public Integer checkout(String skus) {
        //throw new SolutionNotImplementedException();
    	
    	
    	char [] items = skus.toCharArray();
    	Basket allItems = new Basket();
   	
    	// buying no items is no cost but shouldn't be considered an illegal input
    	if (skus.isEmpty()) return 0;
    	
    	try {
    		for (char item:items) {
    			allItems.addItem(item); //add each character (item sku) to basket
    		}
    		Register checkingOut = new Register (allItems);
    		
    		return checkingOut.checkTotals();
    	}
    	catch (Exception e) {
    		return -1;
    	}
    	
    }
}


