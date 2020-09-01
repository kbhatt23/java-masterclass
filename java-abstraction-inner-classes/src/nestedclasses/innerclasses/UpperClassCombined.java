package nestedclasses.innerclasses;
//adding both kind of nested class here
public class UpperClassCombined {
	private static int staticProperty=10;
	private  int instanceProperty;
	private InnerClassComibedPrivate innerClassComibedPrivate;
	
	private InnerStaticClassCombinedPrivate privateStaticclass;
	public UpperClassCombined(int instanceProperty) {
		this.instanceProperty = instanceProperty;
	}
	
	public UpperClassCombined(int instanceProperty, int innerInstanceProperty) {
		this.instanceProperty = instanceProperty;
		this.innerClassComibedPrivate = new InnerClassComibedPrivate(innerInstanceProperty);
	}
	
	public UpperClassCombined(int instanceProperty, int innerInstanceProperty, boolean isStaticClass) {
		this.instanceProperty = instanceProperty;
		this.privateStaticclass = new InnerStaticClassCombinedPrivate(innerInstanceProperty);
	}
	
	//for private inner class we need to call methods from here
	public void printAllPrivate() {
		this.innerClassComibedPrivate.printAll();
	}
	
	public void printAllPrivateStatic() {
		System.out.println("upper instance property in private staitc method "+this.instanceProperty);
		this.privateStaticclass.printAll();
	}
	
	
	
	//inner class
	public class InnerClassComibed{
		private  int instanceProperty;

		public InnerClassComibed(int instanceProperty) {
			this.instanceProperty = instanceProperty;
		}
		
		public void printAll() {
			System.out.println("inner class property "+this.instanceProperty);
			//inner class can access instance variable of upper class withoyut even creating object
			System.out.println("upper class static proeprty "+staticProperty);
			//if peropty name is same we need to call Class.this.proeprtyname
			//no need to create object as inner class object lies on the same object of upper class
			System.out.println("upper class instance property "+UpperClassCombined.this.instanceProperty);
		}
	}
	//private inner class
	private class InnerClassComibedPrivate{
		private  int instanceProperty;

		public InnerClassComibedPrivate(int instanceProperty) {
			this.instanceProperty = instanceProperty;
		}
		
		private void printAll() {
			System.out.println("inner class property "+this.instanceProperty);
			//inner class can access instance variable of upper class withoyut even creating object
			System.out.println("upper class static proeprty "+staticProperty);
			//if peropty name is same we need to call Class.this.proeprtyname
			//no need to create object as inner class object lies on the same object of upper class
			System.out.println("upper class instance property "+UpperClassCombined.this.instanceProperty);
		}
	}
	
	//public static nested class
	public static class InnerStaticClassCombined{
		//static inner class can existin even without upper class
		//client can create object of it
		//this class can have static ase wll as non satic thing
		//only static instance thing from upper c;ass can be accesed in static inner class 
		private int instanceProperty;
		private static int staticProperty=100;

		public InnerStaticClassCombined(int instanceProperty) {
			this.instanceProperty = instanceProperty;
		}
		
		public void printAll() {
			System.out.println("static inner class instanceproperty "+this.instanceProperty);
			System.out.println("static inner class static proeprty "+this.staticProperty);
			//non staitc peropty wont be accesible insise static class
			//System.out.println("upper class static property "+UpperClassCombined.this.instanceProperty);
			System.out.println("upper class static property "+UpperClassCombined.staticProperty);
		}
		
	}
	
	//private static nested class
	private static class InnerStaticClassCombinedPrivate{
		//static inner class can existin even without upper class
		//client can create object of it
		//this class can have static ase wll as non satic thing
		//only static instance thing from upper c;ass can be accesed in static inner class 
		private int instanceProperty;
		private static int staticProperty=100;

		public InnerStaticClassCombinedPrivate(int instanceProperty) {
			this.instanceProperty = instanceProperty;
		}
		
		public void printAll() {
			System.out.println("static inner class instanceproperty "+this.instanceProperty);
			System.out.println("static inner class static proeprty "+this.staticProperty);
			//non staitc peropty wont be accesible insise static class
			//System.out.println("upper class static property "+UpperClassCombined.this.instanceProperty);
			System.out.println("upper class static property "+UpperClassCombined.staticProperty);
		}
		
	}
}
