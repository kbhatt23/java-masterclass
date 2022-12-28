package innerclasses;

public class ComplexOuterClass {

	private int outerProperty;
	
	//name will remain at both places
	//name can be different
	private String name;

	public ComplexOuterClass(int outerProperty, String name) {
		this.outerProperty = outerProperty;
		this.name = name;
	}

	private void namoNarayan() {
		System.out.println("Namo Laxmi narayan says outer class");
	}
	@Override
	public String toString() {
		return "ComplexOuterClass [outerProperty=" + outerProperty + ", name=" + name + "]";
	}
	
	public class ComplexInnerClass{
		private int innerProperty;
		
		//even outer class uses this
		private String name;

		public ComplexInnerClass(int innerProperty, String name) {
			this.innerProperty = innerProperty;
			this.name = name;
		}

		@Override
		public String toString() {
			return "ComplexInnerClass [innerProperty=" + innerProperty + ", name=" + this.name  
					//+ "outerProperty="+this.outerProperty // this wont work
					+ ", outerProperty="+outerProperty
					+", outerclass name="+ComplexOuterClass.this.name
					+
					"]";
			//logic is here i must print every property outer and inner both
			
			
		}
		
		public void namoNarayan() {
			System.out.println("Namo Laxmi narayan says inner class");
		}
		
		public void completeNamoNarayan() {
			//first localnamonaryana and then outerclass namonaryan
			
			namoNarayan(); // since method exist locally it takes local inner class method
			//this.namoNarayan(); // same as above but in case method did not exist and existed
			ComplexOuterClass.this.namoNarayan();
		}
		
	}
}
