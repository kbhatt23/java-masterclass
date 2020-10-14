package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWithLambda {
public static void main(String[] args) {
	List<Employee> employees = Arrays.asList(new Employee("sita ram", 108108), new Employee("radhe shyam", 108),
			new Employee("raghav", 101
					), new Employee("ramaduta hanuman", 107)
			, new Employee("kali mata", 1)
			);
	employees.forEach(System.out::println);
	//Collections.sort(employees, (a,b) -> {
		//return Integer.valueOf(a.getAge()).compareTo(Integer.valueOf(b.getAge()));
	//});
	
	Collections.sort(employees, new Comparator<Employee>() {
	@Override
	public int compare(Employee a, Employee b) {
		return Integer.valueOf(a.getAge()).compareTo(Integer.valueOf(b.getAge()));
	}
	
	});
	System.out.println("sorted===========================================");
	employees.forEach(System.out::println);
}
}
