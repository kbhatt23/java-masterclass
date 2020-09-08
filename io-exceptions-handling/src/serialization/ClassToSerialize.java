package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ClassToSerialize implements Serializable{
	//if this is used to serialoize and then changed and then file is derialize will goive exception at runtime
	private static final long serialVersionUID = 3411966141121983990L;

	private String name;
	private transient UserClassTOSerialize userClass;
	private transient ComplexPropertyClass complexClass;

	public ClassToSerialize(String name, int age) {
		this.name = name;
		this.userClass = new UserClassTOSerialize(name);
		this.complexClass = new ComplexPropertyClass(name, age);
	}

	public ClassToSerialize(String name) {
		this.name = name;
		this.userClass = new UserClassTOSerialize(name);
	}

	
	@Override
	public String toString() {
		return "ClassToSerialize [name=" + name + ", userClass=" + userClass + ", complexClass=" + complexClass + "]";
	}

	//call back
	//this can help us to skip transient isntance variable
	//and manually store the state internal in data stream
	private void writeObject(ObjectOutputStream os) throws IOException{
		System.out.println("callback during serialziation");
		os.defaultWriteObject();
		os.writeUTF(name);
		//as constructor one create it null other cosntrucotr make object
		if( complexClass != null) {
			os.writeInt(complexClass.getAge());
		}
	}
	
	private void readObject(ObjectInputStream is) throws IOException , ClassNotFoundException{
		System.out.println("callback during deserialziation");
		is.defaultReadObject();
		String readUTF = is.readUTF();
		userClass = new UserClassTOSerialize(readUTF);
		try {
			int age = is.readInt();
			complexClass = new ComplexPropertyClass(readUTF, age);
		}catch(Exception e) {
			
		}
	}
	
}
