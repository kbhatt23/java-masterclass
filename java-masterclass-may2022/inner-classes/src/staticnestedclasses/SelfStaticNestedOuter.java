package staticnestedclasses;

public class SelfStaticNestedOuter {

	private String name;
	
	private static int maxAge = 100;

	public SelfStaticNestedOuter(String name) {
		this.name = name;
	}
	
	private String getName() {
		return this.name;
	}
	
	//static field
	//static context can not use this and hence can not access static method or field
	public static class SelfStaticNestedInner{
		
		private String innerName;
		
		private static int maxAge = 90;

		public SelfStaticNestedInner(String innerName) {
			this.innerName = innerName;
		}
		
		public void printNames() {
			//can not access instance field or method
		//	System.out.println("outer name "+name);
			//System.out.println("outer name "+getName());
			System.out.println("inner name: "+innerName);
			System.out.println("outer maxage "+SelfStaticNestedOuter.maxAge);
			System.out.println("inner maxage "+maxAge);
		}
	}
}
