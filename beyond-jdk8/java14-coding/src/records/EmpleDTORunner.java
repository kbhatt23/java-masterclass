package records;

public class EmpleDTORunner {

	public static void main(String[] args) {
		//EmployeeDTO fake = new EmployeeDTO(0, "fake");
		
		EmployeeDTO emp1 = new EmployeeDTO(1, "kaka", 23);
		System.out.println(emp1);
		System.out.println(emp1.name());
		System.out.println(emp1.age());
		
		EmployeeDTO emp2 = new EmployeeDTO(1, "kaka", 23);
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
	}
}
