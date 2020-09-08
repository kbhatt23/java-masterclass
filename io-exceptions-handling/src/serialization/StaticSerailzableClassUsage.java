package serialization;

import java.io.Serializable;

import fileoperations.FileUtils;

public class StaticSerailzableClassUsage {
public static void main(String[] args) {
	StaticSerailzableClass obj = new StaticSerailzableClass("jai shree ram");
	obj.numberStatic=33;
	SerialziationUtils<StaticSerailzableClass> util = new SerialziationUtils<>();
	String fileName = FileUtils.ROOT_PATH+"statics.txt";
	util.serialzieObject(obj, fileName);
	System.out.println("objet inital state "+obj);
	System.out.println("init static property "+obj.numberStatic);
	obj.numberStatic=99;
	
	StaticSerailzableClass deserialzeObject = util.deserialzeObject(fileName);
	System.out.println("deserailzed object state "+deserialzeObject);
	System.out.println("satic property after deerailziton "+deserialzeObject.numberStatic);
}
}

class StaticSerailzableClass implements Serializable{
	
	private String name;
	public static int numberStatic  =23;

	public StaticSerailzableClass(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "StaticSerailzableClass [name=" + name + "]";
	}
}
