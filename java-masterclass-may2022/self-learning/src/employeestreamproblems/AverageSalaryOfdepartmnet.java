package employeestreamproblems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalaryOfdepartmnet {

	public static void main(String[] args) {
List<Employee> employes = EmployeeDB.findAll();
		
		Map<String, Double> collect = employes.stream()
		        .collect(Collectors.groupingBy(Employee :: getDepartment,
		        		Collectors.averagingDouble(Employee :: getSalary)
		        		));
	
		collect.forEach((gender , count) -> System.out.println(gender + " : "+count));
	}
}
