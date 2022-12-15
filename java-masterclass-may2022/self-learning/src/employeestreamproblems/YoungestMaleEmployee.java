package employeestreamproblems;

import java.util.Comparator;
import java.util.List;import javax.management.RuntimeErrorException;

public class YoungestMaleEmployee {

	public static void main(String[] args) {
		List<Employee> employes = EmployeeDB.findAll();
		
		employes.stream()
		      .filter(employee -> employee.getDepartment().equals("Product Development"))
		      .filter(employee -> employee.getGender().equals("Male"))
		      .min(Comparator.comparingInt(Employee :: getAge))
		      .ifPresent(System.out::println);
		      //.orElseThrow(() -> new RuntimeException("no young male found"))
		      ;
	}
}
