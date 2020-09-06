package learning.map.stockbasketexample;

//each item represent one stick item for each sku
//will have a modifiable quantity
//and a price tha can be changed in future
//however skuid is not supposed to change for stock item
//not considering subclassing for classitem
public final class StockItem implements Comparable<StockItem>{
	// will be unique and final for all
	// good case for primary key

	private final String skuId;
	private int quantity;
	private double unitPrice;
	//by default nothoing is reserved and hence default 0 is good
	private int reserved;

	public int getReserved() {
		return reserved;
	}

	public void setReserved(int reserved) {
		this.reserved = reserved;
	}

	public int getAvailableQuantity() {
		return quantity;
	}

	public boolean adjustQuantity(int quantity) {
		int existingQty = this.quantity;
		existingQty += quantity;
		if (existingQty < 0) {
			System.err.println("Stock can not be set to negative value");
			return false;
		} else {
			this.quantity = existingQty;
			return true;
		}
	}
	public boolean adjustReservation(int quantity) {
		int existingQty = quantity;
		if (existingQty < 0) {
			System.err.println("Stock reservation can not be set to negative value");
			return false;
		} else {
			if(existingQty <= this.quantity) {
				this.reserved = existingQty;
				return true;
			}else{
				System.err.println("Stock can not be reserved more than the actual quantity");
				return false;
			}
			
		}
	}

	public double getUnitPrice() {
		return unitPrice;
	}
	//making it flexible to modify the price for future
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getSkuId() {
		return skuId;
	}

	public StockItem(String skuId, int quantity, double unitPrice) {
		this.skuId = skuId;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	// default can be 0
	public StockItem(String skuId, double unitPrice) {
		this.skuId = skuId;
		this.unitPrice = unitPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((skuId == null) ? 0 : skuId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		// not considering subclassing for stock item
		if (null == obj || obj.getClass() != this.getClass())
			return false;
		String objSkuId = ((StockItem) obj).skuId;
		return this.skuId.equals(objSkuId);

	}

	@Override
	public String toString() {
		return "StockItem [skuId=" + skuId + ", quantity=" + quantity + ", unitPrice=" + unitPrice + "]";
	}

	//sorting by name thats it
	@Override
	public int compareTo(StockItem o) {
		return this.skuId.compareTo(o.skuId);
	}

}
