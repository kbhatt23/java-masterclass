package learning.map.stockbasketexample;
//class collects the stock of all available items

//we are using map for perfoamrcae
//as searching in set is O(n) and in map it is O(1)
//we know that ksuid is good enough priamry key/unique for all entries in map

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class StockList {
	// assuming the stock will come from DB, and wont be affected by instance
	// should not be final as in future we can add new items and hence becuase of
	// immutability we might overid ethe object
	// but as of no wkeeping it final, assuming only way will be to modify
	private static final Map<String, StockItem> stockItems;
	static {
		// good use case for static block
		System.out.println("Adding stock items in stock");
		//stockItems = new HashMap<String, StockItem>();
		//we already have comparable interface implemenet in stirng , so it will sort by key string name
		stockItems = new TreeMap<String, StockItem>();
		StockItem lenovoLaptop = new StockItem("lenovo",10, 1000);
		stockItems.put(lenovoLaptop.getSkuId(), lenovoLaptop);

		StockItem appleLaptop = new StockItem("apple",4, 3000);
		stockItems.put(appleLaptop.getSkuId(), appleLaptop);

		StockItem dellLaptop = new StockItem("dell",11, 1500);
		stockItems.put(dellLaptop.getSkuId(), dellLaptop);

		StockItem hpLaptop = new StockItem("hp",9, 2000);
		stockItems.put(hpLaptop.getSkuId(), hpLaptop);
	}

	public static Map<String, StockItem> fetchStockUnitsAvailable() {
		// good use case of unmodifable
		// as the user should only read the map and do not modify -> insert or add new
		// entries in map
		return Collections.unmodifiableMap(stockItems);
	}
	
	public static int fetchStockUnitsAvailable(String skuId) {
		//since key is skuid ->  we cna do in O(1) using map
		if(!stockItems.containsKey(skuId)) {
			System.err.println("Sku "+skuId+" do not have stock item");
			return -1;
		}
		return stockItems.get(skuId).getAvailableQuantity();
	}
	public static StockItem fetchStockItem(String skuId) {
		//since key is skuid ->  we cna do in O(1) using map
		if(!stockItems.containsKey(skuId)) {
			System.err.println("Sku "+skuId+" do not have stock item");
			return null;
		}
		return stockItems.get(skuId);
	}
}
