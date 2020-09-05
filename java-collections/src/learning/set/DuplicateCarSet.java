package learning.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCarSet {
public static void main(String[] args) {
	Set<Car> carset = new HashSet<Car>();
	Car car = new Car("kala", "kala");
	car.setNonDependentPReorpty(23);
	Car car1 = new Car("kala", "kala");
	car1.setNonDependentPReorpty(99);
	
	carset.add(car);carset.add(car1);
	carset.forEach(e -> System.out.println(e.getNonDependentPReorpty()));
	
	Map<Car, Integer> carMap = new HashMap<Car, Integer>();
	carMap.put(car, 1);
	carMap.put(car1, 2);
	
	carMap.entrySet().forEach(e -> System.out.println(e.getKey().getNonDependentPReorpty()+ " value:" +e.getValue()));
	Integer fetch = (Integer)carMap.get(new Car("kala", "kala"));
	System.out.println(fetch);
} 

}
