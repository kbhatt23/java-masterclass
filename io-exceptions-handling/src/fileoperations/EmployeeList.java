package fileoperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList {
	// we are assuming in code we nca not add employee object
	private static List<Employee> employees;

	// creating unmodifiable list, so that no one can add
	static {
		employees = new ArrayList<Employee>();
		employees.add(new Employee("emp1", "krishna"));
		employees.add(new Employee("emp2", "madhav"));
		boolean ka = false;
		if (ka) {
			try {
				throw new Exception();
			} catch (Exception e) {

			}
		}
		employees.add(new Employee("emp3", "damodar"));
		employees.add(new Employee("emp4", "keshav"));
		employees.add(new Employee("emp5", "gangadhar"));
	}

	public static List<Employee> returnReadOnlyEmployees() {
		return Collections.unmodifiableList(employees);
	}
}
