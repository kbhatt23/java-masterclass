package learning.set;

import java.util.HashMap;
import java.util.Map;

public class CarMap {
public static void main(String[] args) {
	Map<Car, Integer> carsMapRating = new HashMap<Car,Integer>();
	Car car1 = new Car("1234", "wagonr");
	Car car2 = new Car("1235", "zen");
	Car car3 = new Car("1236", "benz");
	Car car4 = new Car("1237", "polo");
	Car car5 = new Car("1238", "ertiga");
	Car car6 = new Car("1239", "jeep");
	Car car7 = new Car("1230", "innova");
	carsMapRating.put(car1,1);
	carsMapRating.put(car2,2);
	carsMapRating.put(car3,3);
	carsMapRating.put(car4,4);
	carsMapRating.put(car5,5);
	carsMapRating.put(car6,6);
	carsMapRating.put(car7,7);
	carsMapRating.put(new Car("1237", "polo"), 11);
	System.out.println(carsMapRating.size());
	
	System.out.println(carsMapRating.get(new Car("1234","wagonr")));
	System.out.println(carsMapRating.get(new Car("1237", "polo")));
	
	
}
}
