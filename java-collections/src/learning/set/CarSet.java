package learning.set;

import java.util.HashSet;
import java.util.Set;

public class CarSet {
public static void main(String[] args) {
	Set<Car> carsMapRating = new HashSet<Car>();
	Car car1 = new Car("1234", "wagonr");
	Car car2 = new Car("1235", "zen");
	Car car3 = new Car("1236", "benz");
	Car car4 = new Car("1237", "polo");
	Car car5 = new Car("1238", "ertiga");
	Car car6 = new Car("1239", "jeep");
	Car car7 = new Car("1230", "innova");
	carsMapRating.add(car1);
	carsMapRating.add(car2);
	carsMapRating.add(car3);
	carsMapRating.add(car4);
	carsMapRating.add(car5);
	carsMapRating.add(car6);
	carsMapRating.add(car7);
	Car car11 = new Car("1234", "wagonr");
	carsMapRating.add(car11);
	System.out.println(carsMapRating.size());
	System.out.println(carsMapRating.contains(new Car("1237", "polo")));
	
}
}
