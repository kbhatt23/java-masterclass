package serialization;

import java.io.Serializable;

public class SuperNonSerializable{

	private String name;
	
	private int age;

	public SuperNonSerializable(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//creating for handling exception in deserialzation process
	public SuperNonSerializable() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "SuperSerializable [name=" + name + ", age=" + age + "]";
	}
	
	
}
