package serialization;

import fileoperations.FileUtils;

public class InheritanceSerialziation1 {
public static void main(String[] args) {
	ChildSerialzableClass ch = new ChildSerialzableClass("jai shree ram", "jai radha madhav");
	System.out.println("inital object "+ch + " with hashcode "+ch.hashCode());
	
	SerialziationUtils<ChildSerialzableClass> util = new SerialziationUtils<ChildSerialzableClass>();
	String fileName = FileUtils.ROOT_PATH+"inheritance.txt";
	util.serialzieObject(ch, fileName);
	
	ChildSerialzableClass deserialzeObject = util.deserialzeObject(fileName);
	
	System.out.println("deserialzed object "+deserialzeObject+ " with hashcode "+deserialzeObject.hashCode());
}
}
