package serialization;

import fileoperations.FileUtils;

public class BasicSerializtion2 {
public static void main(String[] args) {
	//wrpper class closes the inner internal user class also
	ClassToSerialize obj = new ClassToSerialize("sita-ram",23);
	String fileName = FileUtils.ROOT_PATH+"serialze.dat";
	System.out.println("initial object"+obj +"hashCode "+obj.hashCode());
	SerialziationUtils<ClassToSerialize> serailzeUtils = new SerialziationUtils<ClassToSerialize>();
	serailzeUtils.serialzieObject(obj, fileName);
	
	ClassToSerialize obj1 = serailzeUtils.deserialzeObject(fileName);
	System.out.println("object deserialzed "+obj1+" has hashcode "+obj1.hashCode());
	
	
}
}
