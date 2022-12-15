package designpatterns.decorator;

public class VanillaIceCream extends IceCreamDecorator implements IceCream{

	public VanillaIceCream(IceCream iceCream) {
		super(iceCream);
	}

	@Override
	protected int calculateBasicCost() {
		int cost = 20;
		System.out.println("VanillaIceCream.calculateBasicCost cost: "+cost);
		return cost;
	}

	@Override
	protected void prepareBasicIceCream() {
		System.out.println("VanillaIceCream.prepareBasicIceCream prepared vanilla icecream");
	}

}
