package basics;

public final class SelfEnumDemo {
	public static void main(String[] args) {
		//client can not pass corrupt data hence it is compile time type safe
		//printName(new SelfEnum(1,"fake"));
		printName(SelfEnum.TYPE_ONE_INSTANNCE);
		printName(SelfEnum.TYPE_TWO_INSTANNCE);
		printAll();
	}
	
	private static void printAll() {
		for(SelfEnum selfEnum : SelfEnum.values()){
			printName(selfEnum);
		}
	}

	private static void printName(SelfEnum selfEnum) {
		System.out.println(selfEnum.name());
	}
}
