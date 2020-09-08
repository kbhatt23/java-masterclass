package serialization;
//we do not have acces toof this class to make serialzble
//but still want to save the sate of this class
public class ComplexPropertyClass {
	private String name;
	private int age;
	public int getAge() {
		return age;
	}
	public ComplexPropertyClass(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "ComplexPropertyClass [name=" + name + ", age=" + age + "]";
	}
}
