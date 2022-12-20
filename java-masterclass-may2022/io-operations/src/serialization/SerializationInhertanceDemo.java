package serialization;

public class SerializationInhertanceDemo {

	public static void main(String[] args) {
		ChildNotSerializble child  = new ChildNotSerializble("kanha", -1, 0.00001);
		
		System.out.println("initial: "+child);
		String file = "files/inheritance1.ser";
		SerializationUtil.serialize(file, child);
		
		ChildNotSerializble clone=  SerializationUtil.deserialize(file);
		System.out.println("after: "+clone);
	}
}
