package serialization;

import java.io.Serializable;

public class SelfSerialization {

	public static void main(String[] args) {
		SelfStateStore selfStateStore = new SelfStateStore("krishna kanhayya", -108);
		String file = "files/statestore1.ser";
		SerializationUtil.serialize(file, selfStateStore);
		
		System.out.println("serialization done");
		
		SelfStateStore deserialize = SerializationUtil.deserialize(file);
		System.out.println("deserialzed object: "+deserialize);
		
		System.out.println(selfStateStore.equals(deserialize));
		System.out.println(selfStateStore == deserialize);
	}
}

class SelfStateStore implements Serializable{

	private static final long serialVersionUID = -4636348119473434454L;
	
	private String name;
	
	private int age;

	public SelfStateStore(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "SelfStateStore [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SelfStateStore other = (SelfStateStore) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
