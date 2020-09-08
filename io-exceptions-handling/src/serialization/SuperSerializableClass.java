package serialization;

import java.io.Serializable;

public class SuperSerializableClass /*
									 * implements Serializable
									 */ {

	public SuperSerializableClass(String property1) {
		this.property1 = property1;
	}

	// scenario when super class is not serialzble but cild is
	// while deserailzing it calls no arg construcot of super class
	public SuperSerializableClass() {
		this.property1 = "default property says jai shree ram";
	}

	public String getProperty1() {
		return property1;
	}

	public void setProperty1(String property1) {
		this.property1 = property1;
	}

	@Override
	public String toString() {
		return "SuperSerializableClass [property1=" + property1 + "]";
	}

	private String property1;
}
