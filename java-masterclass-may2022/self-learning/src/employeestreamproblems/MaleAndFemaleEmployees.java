package employeestreamproblems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaleAndFemaleEmployees {

	public static void main(String[] args) {
		List<Employee> employes = EmployeeDB.findAll();
		
		Map<String, Long> genderCountMap = employes.stream().collect(Collectors.groupingBy(Employee :: getGender,
				Collectors.counting()
				)
				);
		
		genderCountMap.forEach((gender , count) -> System.out.println(gender + " : "+count));
	}
}
