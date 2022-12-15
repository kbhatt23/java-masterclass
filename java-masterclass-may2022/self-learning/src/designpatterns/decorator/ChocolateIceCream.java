package designpatterns.decorator;

public class ChocolateIceCream extends IceCreamDecorator implements IceCream{

	public ChocolateIceCream(IceCream iceCream) {
		super(iceCream);
	}

	@Override
	protected int calculateBasicCost() {
		int cost = 30;
		System.out.println("ChocolateIceCream.calculateBasicCost cost: "+cost);
		return cost;
	}

	@Override
	protected void prepareBasicIceCream() {
		System.out.println("ChocolateIceCream.prepareBasicIceCream prepared chocolate icecream");
	}

}
