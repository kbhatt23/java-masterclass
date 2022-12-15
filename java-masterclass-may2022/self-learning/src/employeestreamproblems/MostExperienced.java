package employeestreamproblems;

import java.util.Comparator;
import java.util.List;

public class MostExperienced {

	public static void main(String[] args) {
		List<Employee> employes = EmployeeDB.findAll();
		
		employes.stream()
		     .min(Comparator.comparingInt(Employee :: getYearOfJoining))
		     .ifPresent(System.out::println);
		     ;
	}
}
