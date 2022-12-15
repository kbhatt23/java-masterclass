package employeestreamproblems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaleAndFemaleInMarketing {

	public static void main(String[] args) {
		List<Employee> employes = EmployeeDB.findAll();
		
		Map<String, Long> result=  employes.stream()
		    .filter(employee -> employee.getDepartment().equals("Sales And Marketing"))
		    .collect(Collectors.groupingBy(Employee::getGender,
		    		Collectors.counting()
		    		));
		
		result.forEach((gender , count) -> System.out.println(gender + " : "+count));
	}
}
