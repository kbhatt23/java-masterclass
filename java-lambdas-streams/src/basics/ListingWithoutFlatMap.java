package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListingWithoutFlatMap {
public static void main(String[] args) {
	Employee e1 = new Employee("sita ram", 23 , Arrays.asList("study", "fight", "dance", "singing"));
	Employee e2 = new Employee("kannu", 29, Arrays.asList("football","java", "squats"));
	Employee e3 = new Employee("hanuman", 27, Arrays.asList("ram bhajan","ram bhajan","ram bhajan"));
	
	List<Employee> employees = new ArrayList<Employee>();
	employees.add(e1);employees.add(e2);
	employees.add(e3);
	
	Stream<Employee> tryUsingTwice = employees.stream();
	
	//tryUsingTwice.peek(e -> {});
	//flat map basic
	List<String> hobbies = tryUsingTwice.
			map(Employee::getHobbies)
			.flatMap(List::stream)
		.collect(Collectors.toList());
	;
	System.out.println(hobbies);
	System.out.println("second manipulation===============");
	List<List<String>> hobieDoubleList= employees.stream()
			 .map(Employee::getHobbies)
			 .collect(Collectors.toList());
	System.out.println(hobieDoubleList);
}
}
