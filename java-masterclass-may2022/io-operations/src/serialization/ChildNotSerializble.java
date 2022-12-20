package serialization;

//if super is serialzable child is auto serialzable
//both the parent and child states are stored and recovered after derserialztion
public class ChildNotSerializble extends SuperSerializable{

	private double salary;

	public ChildNotSerializble(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "ChildNotSerializble [salary=" + salary + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
	
}
