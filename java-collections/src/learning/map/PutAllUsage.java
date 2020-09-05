package learning.map;

import java.util.HashMap;
import java.util.Map;

import learning.set.Car;

public class PutAllUsage {
	public static void main(String[] args) {
		Map<Car, Integer> hashmap = new HashMap<Car, Integer>();
		Car car1 = new Car("1234", "wagonr");
		Car car2 = new Car("1235", "zen");
		Car car3 = new Car("1236", "benz");
		Car car4 = new Car("1235", "zen");
		hashmap.put(car1, 1);hashmap.put(car2, 2);hashmap.put(car3, 3);hashmap.put(car4, 4);
		System.out.println("inital map");
		
		hashmap.entrySet().forEach(System.out::println);
		
		Map<Car, Integer> hashmap2 = new HashMap<Car, Integer>();
		hashmap2.put(new Car("9999", "kepala"), 9);
		hashmap2.put(new Car("1235", "zen"), 108);
		hashmap.putAll(hashmap2);
		System.out.println("===================");
		hashmap.entrySet().forEach(System.out::println);
	}
}
