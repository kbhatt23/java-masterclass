package designpatterns.decorator;

public abstract class IceCreamDecorator implements IceCream{

	private IceCream iceCream;
	
	public IceCreamDecorator(IceCream iceCream) {
		this.iceCream = iceCream;
	}

	@Override
	public int calculateCost() {
		int calculateCost = iceCream.calculateCost();
		return calculateCost + calculateBasicCost();
	}

	protected abstract int calculateBasicCost() ;
	
	protected abstract void prepareBasicIceCream() ;

	@Override
	public void prepareIceCream() {
		iceCream.prepareIceCream();
		prepareBasicIceCream();
	}

}
