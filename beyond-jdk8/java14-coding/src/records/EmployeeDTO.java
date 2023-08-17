package records;

//Represents DTO
//immutable and private final fields
//constructor basseed init
//no setters have only getters
//declaartive and intentional
//hashcode, equals , tostring auto added : no boilerplate
public record EmployeeDTO(int id , String name , int age) {
	
	//only validataion
	//this.name= name will be added for all the field automatically
	public EmployeeDTO{
		if(id <= 0 || name == null || name.isBlank() || age <=0)
			throw new IllegalArgumentException("wrong id or name or age passed");
	}
	
	
	
}
