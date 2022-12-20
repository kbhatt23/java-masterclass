package serialization;

public class StudentSerialzationDemo {

	public static void main(String[] args) {
		String file = "files/student1.ser";
		Address a = new Address("dwarka", "delhi");
		Student s = new Student(30, new String[]{"football","gym"},"kanishk", a);
		serialize(file,s);
		Student deserialize = deserialize(file);
		
		System.out.println("original: "+s);
		System.out.println("copy: "+deserialize);
		
		System.out.println(s == deserialize);
		System.out.println(s.STATIC_FIELD);
		System.out.println(deserialize.STATIC_FIELD);
	}

	private static Student deserialize(String file) {
		return SerializationUtil.deserialize(file);
	}

	private static void serialize(String file, Student student) {
		SerializationUtil.serialize(file, student);
	}
}
