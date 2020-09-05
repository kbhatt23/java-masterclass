package learning.set;

public class SuzukiCar extends Car{

	public SuzukiCar(String number, String name) {
		super(number, name);
	}
public static void main(String[] args) {
	SuzukiCar car = new SuzukiCar("kala12","kala");
	System.out.println(new Car("kala12", "kala").equals(car));
}
}
