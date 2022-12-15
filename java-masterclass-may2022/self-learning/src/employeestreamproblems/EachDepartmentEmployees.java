package employeestreamproblems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EachDepartmentEmployees {

	public static void main(String[] args) {

		List<Employee> employes = EmployeeDB.findAll();
		
		Map<String, List<String>> names = employes.stream()
		    .collect(Collectors.groupingBy(Employee :: getDepartment,
		    		Collectors.mapping(Employee :: getName, Collectors.toList())
		    		)
		    		
		    		);
		names.forEach((gender , count) -> System.out.println(gender + " : "+count));
		
	}
}
