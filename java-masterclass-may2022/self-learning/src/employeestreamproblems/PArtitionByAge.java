package employeestreamproblems;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PArtitionByAge {

	public static void main(String[] args) {
		List<Employee> employes = EmployeeDB.findAll();
		
		Map<Boolean, List<Employee>> collect = employes.stream()
			.collect(Collectors.partitioningBy(emp -> emp.getAge() <= 25))
		;
		
		collect.forEach((gender , count) -> System.out.println(gender + " : "+count));
	}
}
