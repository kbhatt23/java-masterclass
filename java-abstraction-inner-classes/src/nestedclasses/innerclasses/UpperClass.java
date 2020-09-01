package nestedclasses.innerclasses;

public class UpperClass {

	public UpperClass(String upperName) {
		this.upperName = upperName;
		//inner name from inner classs wont be accesible directly
		//only inner class can clal all methoid/access all variable without creating objects
	}
	public void printALlNames(String innerName) {
		System.out.println(this);
		InnerClass innerclass = new InnerClass(innerName);
		System.out.println(innerclass);
	}

	@Override
	public String toString() {
		return "UpperClass [upperName=" + upperName + "]";
	}

	private String upperName;
	
	private class InnerClass{
		private String innerName;

		@Override
		public String toString() {
			return "InnerClass [innerName=" + innerName + "]";
		}

		public InnerClass(String innerName) {
			this.innerName = innerName;
		}
		
	}
}
