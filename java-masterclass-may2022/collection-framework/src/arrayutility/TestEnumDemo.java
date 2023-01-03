package arrayutility;

public class TestEnumDemo {

	public static void main(String[] args) {
		TestEnum[] types = TestEnum.values();
		for (TestEnum type : types) {
			System.out.println(type.ordinal() + ":" + type.name());
		}
	}
}
