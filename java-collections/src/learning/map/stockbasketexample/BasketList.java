package learning.map.stockbasketexample;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

//
public class BasketList {

	// using set as we do not have to find key value
	// stock can be huge thats why key value for O(1) search case was useful
	// each user will have unique list and henc emaking it non static
	// private Set<StockItem> basketItems;

	// moving it to map for ease of usage
	private Map<StockItem, Integer> basketItems;

	public BasketList() {
		//this.basketItems = new HashMap<StockItem, Integer>();
		this.basketItems = new TreeMap<StockItem, Integer>();
	}

	public void addItemToCart(String skuId, int quantity) {
		if (quantity <= 0) {
			System.err.println("Can not add negative quantity to basket");
			return;
		}
		StockItem newStock = StockList.fetchStockItem(skuId);
		if (newStock == null) {
			System.err.println("Kindly choose valid skuId");
			return;
		}
		if (basketItems.containsKey(newStock)) {
			System.out.println("modifying existing basket item");
			int existingCount = basketItems.get(newStock);
			quantity += existingCount;
		} else {
			System.out.println("Inserting new item in basket");

		}
		// also we need to reduce the sotkc quantity
		
		//lets not do adjustment directly , lets do soft locking
		//boolean adjustQuantity = newStock.adjustQuantity(-quantity);
		
		boolean adjustQuantity = newStock.adjustReservation(quantity);
		if (adjustQuantity) {
			basketItems.put(newStock, quantity);
		}

	}

	public void removeItemFromCart(String skuId, int quantity) {
		if (quantity <= 0) {
			System.err.println("Can not delete negative quantity to basket");
			return;
		}
		StockItem newStock = StockList.fetchStockItem(skuId);
		if (newStock == null) {
			System.err.println("Kindly choose valid skuId");
			return;
		}
		if (basketItems.containsKey(newStock)) {
			System.out.println("modifying existing basket item");
			int existingCount = basketItems.get(newStock);
			if (quantity >= existingCount) {
				basketItems.remove(newStock);
				quantity= existingCount;
			} else {
				basketItems.put(newStock,existingCount-quantity );
			}
			// also we need to reduce the sotkc quantity
			//newStock.adjustQuantity(quantity);
			newStock.adjustReservation(newStock.getReserved()-quantity);
			
		} else {
			System.out.println("stock item not present in basket");
			return;
		}

	}

	public void displayAllItems() {
		if (basketItems.isEmpty()) {
			System.err.println("Your basket is empty");
		} else {
			for (Entry<StockItem, Integer> entry : basketItems.entrySet()) {
				StockItem stockitem = entry.getKey();
				System.out.println("* " + stockitem.getSkuId() + ", qty: " + entry.getValue() + ", total price: "
						+ entry.getValue() * stockitem.getUnitPrice() + ", unit price " + stockitem.getUnitPrice());
			}
		}
	}
	
	public void checkout() {
		System.out.println("doing chcekout kindly pay total price");
		boolean failure = false;
		for (Entry<StockItem, Integer> entry : basketItems.entrySet()) {
			StockItem stockitem = entry.getKey();
			boolean adjustQuantity = stockitem.adjustQuantity(-stockitem.getReserved());
			if(!adjustQuantity) {
				System.err.println("Kindly adjust the cart");
				failure=true;
				break;
			}else {
				stockitem.setReserved(0);
			}
		}
		if(!failure) {
			System.out.println("checkout completed sucesfully");
			basketItems.clear();
		}
	}
}
