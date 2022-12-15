package designpatterns.decorator;

public class BaseIceCream implements IceCream{

	@Override
	public int calculateCost() {
		int cost = 10;
		System.out.println("BaseIceCream.calculateCost: Calculated cost: "+cost);
		return cost;
	}

	@Override
	public void prepareIceCream() {
		System.out.println("BaseIceCream.prepareIceCream: Base ice cream prepared");
	}

	

}
