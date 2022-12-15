package employeestreamproblems;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeesAfter2015 {

	public static void main(String[] args) {
		List<Employee> employes = EmployeeDB.findAll();
		
		List<String> names = employes.stream()
		       .filter(employee -> employee.getYearOfJoining() > 2015)
		       .map(Employee :: getName)
		       .collect(Collectors.toList());
		
		System.out.println(names);
	}
}
