package codetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeStream {
	
	private static List<Employee> employees;
	
	static {
		employees = new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setHobbies(Arrays.asList("football", "cricket"));
		employee.setName("kanishk");

		Employee employee1 = new Employee();
		employee1.setHobbies(Arrays.asList("tv series", "cricket"));
		employee1.setName("chetan");
		
		employees.add(employee1);
		employees.add(employee);
}

	public static void main(String[] args) {
		System.out.println(uniqueHobbies());
		
		System.out.println(nameOfAllemployees());
	}
	
	public static Set<String> uniqueHobbies(){
		return employees.stream()
		         .flatMap(employee -> employee.getHobbies().stream())
		         .collect(Collectors.toSet());
	}
	
	public static List<String> nameOfAllemployees(){
		return employees.stream()
		         .map(Employee :: getName)
		         .collect(Collectors.toList());
	}
	
	
}

class Employee{
	
	private String name;
	
	private List<String> hobbies;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
}
