package nestedclasses.innerclasses;

public class InnerClassExample {

	private String name;
	
	private void printName() {
		System.out.println("jai shree ram from "+name);
	}
	public void printNameOfInnerClass()
	{
		InnerClass classK = new InnerClass("inner class form upper class");
		classK.printInnerName();
	}

	public InnerClassExample(String name) {
		this.name = name;
	}
	
	public class InnerClass{
		
		private String innerName;
		public InnerClass(String innerName) {
			this.innerName = innerName;
		}
		public void printAllNames() {
			printInnerName();
			System.out.println("main class variable name "+name);
			printName();
		}
		private void printInnerName() {
			System.out.println("inner name "+this.innerName);
		}
	}
}
