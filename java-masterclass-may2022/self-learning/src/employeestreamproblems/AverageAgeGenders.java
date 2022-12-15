package employeestreamproblems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageAgeGenders {

	public static void main(String[] args) {
		List<Employee> employes = EmployeeDB.findAll();
		
		Map<String, Double> genderAverageAge =  employes.stream()
		      .collect(Collectors.groupingBy(Employee :: getGender, 
		    		  Collectors.averagingInt(Employee :: getAge)
		    		  ));
		
		genderAverageAge.forEach((gender , count) -> System.out.println(gender + " : "+count));
	}
}
