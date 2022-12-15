package designpatterns.decorator;

public class IceCreamCounter {

	public static void main(String[] args) {
		IceCream chocolate = new ChocolateIceCream(new BaseIceCream());
		
		chocolate.prepareIceCream();
		System.out.println(chocolate.calculateCost());
	}
}
