package learning.map;

import java.util.IdentityHashMap;
import java.util.Map;

import learning.set.Car;

public class IdentityHAshMapUsage {
public static void main(String[] args) {
	Map<Car, Integer> hashmap = new IdentityHashMap<Car, Integer>();
	Car car1 = new Car("1234", "wagonr");
	Car car2 = new Car("1235", "zen");
	Car car3 = new Car("1236", "benz");
	Car car4 = new Car("1235", "zen");
	hashmap.put(car1, 1);hashmap.put(car2, 2);hashmap.put(car3, 3);hashmap.put(car4, 4);
	System.out.println("inital map");
	
	hashmap.entrySet().forEach(System.out::println);
	
	System.out.println(hashmap.get(car4));
	System.out.println(hashmap.get(new Car("1235", "zen")));
	
}
}
