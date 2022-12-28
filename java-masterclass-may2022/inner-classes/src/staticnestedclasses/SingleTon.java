package staticnestedclasses;

public class SingleTon {
	
	{
		System.out.println("object initiation starts");
	}
	
	private SingleTon() {}
	
	private static class SingleTonBuilder {
		
		private static final SingleTon INSTANCE = new SingleTon();
	}
	
	public static SingleTon build() {
		return SingleTonBuilder.INSTANCE;
	}
}
