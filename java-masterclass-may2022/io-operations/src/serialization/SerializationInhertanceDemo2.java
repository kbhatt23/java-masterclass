package serialization;

public class SerializationInhertanceDemo2 {

	public static void main(String[] args) {
		ChildSerializble child  = new ChildSerializble("kanhayya", -10, 10.10);
		
		System.out.println("initial: "+child);
		String file = "files/inheritance2.ser";
		SerializationUtil.serialize(file, child);
		
		ChildSerializble clone=  SerializationUtil.deserialize(file);
		System.out.println("after: "+clone);
	}
}
