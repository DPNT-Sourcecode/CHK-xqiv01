package befaster.solutions.CHK;

import java.util.HashMap;

public class AvailableItems {
	HashMap<Character, Item> itemSet = new HashMap<Character, Item>();
	public AvailableItems() {
		itemSet.put('A',new Item('A',50));
		itemSet.put('B',new Item('B',30));
		itemSet.put('C',new Item('C',20));
		itemSet.put('D',new Item('D',15));
		itemSet.put('E',new Item('E',40));
		itemSet.put('F',new Item('F',10));
		itemSet.put('G',new Item('G',20));
		itemSet.put('H',new Item('H',10));
		itemSet.put('I',new Item('I',35));
		itemSet.put('J',new Item('J',60));
		itemSet.put('K',new Item('K',70));
		itemSet.put('L',new Item('L',90));
		itemSet.put('M',new Item('M',15));
		itemSet.put('N',new Item('N',40));
		itemSet.put('O',new Item('O',10));
		itemSet.put('P',new Item('P',50));
		itemSet.put('Q',new Item('Q',30));
		itemSet.put('R',new Item('R',50));
		itemSet.put('S',new Item('S',20));
		itemSet.put('T',new Item('T',20));
		itemSet.put('U',new Item('U',40));
		itemSet.put('V',new Item('V',50));
		itemSet.put('W',new Item('W',20));
		itemSet.put('X',new Item('X',17));
		itemSet.put('Y',new Item('Y',20));
		itemSet.put('Z',new Item('Z',21));
	}
	
	public Item getValidItem (char sku) throws Exception{
		return itemSet.get(sku);
	}
}

