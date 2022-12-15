package employeestreamproblems;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AverageAndTotalSalary {

	public static void main(String[] args) {
		List<Employee> employes = EmployeeDB.findAll();
		
		DoubleSummaryStatistics stats = employes.stream()
			.collect(Collectors.summarizingDouble(Employee :: getSalary));
		
		System.out.println(stats.getAverage());
		System.out.println(stats.getSum());
	}
}
