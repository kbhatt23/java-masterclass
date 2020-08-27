package inheritance.challenge;

public class CarTestClass {
public static void main(String[] args) {
	Vehicle car = new Car(4, "mercedes", 112232d, "powerstearing");
	if(car instanceof Car) {
		Car carType = (Car) car;
		System.out.println("car power stearing type "+carType.getStearingType());
		carType.moving();
	}
}
}
