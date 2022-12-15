package employeestreamproblems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberOFEmployeeInDepartment {

	public static void main(String[] args) {
		List<Employee> employes = EmployeeDB.findAll();
		
		Map<String, Long> collect = employes.stream()
		        .collect(Collectors.groupingBy(Employee :: getDepartment,
		        		Collectors.counting()
		        		));
	
		collect.forEach((gender , count) -> System.out.println(gender + " : "+count));
	}
}
