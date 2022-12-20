package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable {
	// primitives are auto Serializable
	private int age;

	// array is also auto Serializable
	private String[] hobbies;

	// String is Serializable, object graph will be stored
	private String name;

	// all fields are checked for beeing Serializable, if not it throws runtime
	// exception
	// we can use transient to save ourselves
	private transient Address address;

	public Student(int age, String[] hobbies, String name, Address address) {
		this.age = age;
		this.hobbies = hobbies;
		this.name = name;
		this.address = address;
	}

	// static field have single copy and hence is skipped during Serialization
	public static int STATIC_FIELD = 101;

	@Override
	public String toString() {
		return "Student [age=" + age + ", hobbies=" + Arrays.toString(hobbies) + ", name=" + name + ", address="
				+ address + "]";
	}

	// reflection hook methods
	private void writeObject(ObjectOutputStream aOutputStream) throws IOException {
		//aOutputStream.writeObject(address); //wont work as objectoutputstream needs it to be serializable
		//instead use auto serialzable options

		aOutputStream.defaultWriteObject();
		aOutputStream.writeUTF(address.getAddress1());
		aOutputStream.writeUTF(address.getCity());
	}

	private void readObject(ObjectInputStream aInputStream) throws ClassNotFoundException, IOException {
		aInputStream.defaultReadObject();
		this.address = new Address(aInputStream.readUTF(), aInputStream.readUTF()); // sequence should be same as write
	}

}
