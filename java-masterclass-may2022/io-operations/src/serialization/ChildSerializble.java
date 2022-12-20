package serialization;

import java.io.Serializable;

//only child field will be stored during serialzation
//during serialztion only child data willbe recovered
//also during deserialzation parent no arg constructor is called
//so ensure no arg constructor of parent
public class ChildSerializble extends SuperNonSerializable implements Serializable{

	private double salary;

	public ChildSerializble(String name, int age, double salary) {
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
