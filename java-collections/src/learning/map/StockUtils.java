package learning.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class StockUtils {
public static void main(String[] args) {
	//good use case ->  we need to sort by key while inserting itself
	//key is the time in integer , value is price of stock
	NavigableMap<Integer, Double> stockPriceMap = new TreeMap<Integer, Double>();
	stockPriceMap.put(3, 23.23);
	stockPriceMap.put(4, 24.23);
	stockPriceMap.put(5, 25.23);
	
	stockPriceMap.put(8, 26.23);
	stockPriceMap.put(9, 27.23);
	stockPriceMap.put(10, 28.23);
	
	//current time is 7 how to do
	//we can either display 7 or less than that
	for(int i = 3; i< 11; i++) {
		System.out.println("price at "+i +" is "+stockPriceMap.floorEntry(i).getValue());
	}
}
}
