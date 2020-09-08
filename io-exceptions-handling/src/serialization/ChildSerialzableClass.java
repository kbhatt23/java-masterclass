package serialization;

import java.io.Serializable;

public class ChildSerialzableClass extends SuperSerializableClass implements
Serializable{
	private String property2;
	public ChildSerialzableClass(String property1, String property2) {
		super(property1);
		this.property2=property2;
	}
	public String getProperty2() {
		return property2;
	}
	public void setProperty2(String property2) {
		this.property2 = property2;
	}
	@Override
	public String toString() {
		return "ChildSerialzableClass [property2=" + property2 + ", getProperty1()=" + getProperty1() + "]";
	}
	
	
  
}
