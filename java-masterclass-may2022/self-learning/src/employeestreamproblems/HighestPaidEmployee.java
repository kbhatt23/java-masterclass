package employeestreamproblems;

import java.util.Comparator;
import java.util.List;

public class HighestPaidEmployee {

	public static void main(String[] args) {
		List<Employee> employes = EmployeeDB.findAll();
		
		Employee orElseThrow = employes.stream()
		       .max(Comparator.comparingDouble(Employee :: getSalary))
		       .orElseThrow(() -> new RuntimeException("no employee found"));
		
		System.out.println(orElseThrow);
	}
}
