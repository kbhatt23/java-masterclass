package employeestreamproblems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageMAleAndFemaleSalary {

	public static void main(String[] args) {

		List<Employee> employes = EmployeeDB.findAll();
		
		Map<String, Double> result=  employes.stream()
					 .collect(Collectors.groupingBy(Employee :: getGender,
							 Collectors.averagingDouble(Employee :: getSalary))
							 );
		result.forEach((gender , count) -> System.out.println(gender + " : "+count));
	
	}
}
