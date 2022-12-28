package innerclasses;

//this is called outer class
public class SelfInnerClassDemo {

	private int age = -1;
	
	private SelfInner inner;
	
	public SelfInnerClassDemo(int age) {
		this.age = age;
	}
	private static String staticField = "outer static";
	
	@Override
	public String toString() {
		return "SelfInnerClassDemo [age=" + age + "]";
	}
	
	public void printInner() {
	//not possible	System.out.println("inner: "+innerField);
		if(inner != null)
			System.out.println("inner:"+inner);
	}
	

	public void setInner(SelfInner inner) {
		this.inner = inner;
	}



	public static void main(String[] args) {
		SelfInnerClassDemo obj = new SelfInnerClassDemoChild(32, 43d);
		System.out.println(obj);
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		SelfInnerClassDemo outer = new SelfInnerClassDemo(99);
		SelfInner inner = outer.new SelfInner(55);
		
		System.out.println(inner);
		outer.setInner(inner);
		outer.printInner();
	}
	
	//this can even access private methods/fields of outer class
	//this can use static/instance methods and fields directly 
	//as this object i part of outer class's object
	public class SelfInner{
		private int innerField;
		
		
		public SelfInner(int innerField) {
			this.innerField = innerField;
		}


		public String toString() {
			return "SelfInner: [ innerField:"+innerField+" ,age: "+age+" ,staticField:"+staticField+ " ]";
		}
	}
}

class SelfInnerClassDemoChild extends SelfInnerClassDemo{
	private double salary;
	
	public SelfInnerClassDemoChild(int age, double salary) {
		super(age);
		this.salary=salary;
	}
	
	//wont inherit age field at all
	@Override
	public String toString() {
		//not possible to fetch private field
		//return "SelfInnerClassDemoChild: [ salary:"+salary+" ,age: "+age+" ]";
		return "SelfInnerClassDemoChild: [ salary:"+salary+" ,super.toString(): "+super.toString()+" ]";
	}
}