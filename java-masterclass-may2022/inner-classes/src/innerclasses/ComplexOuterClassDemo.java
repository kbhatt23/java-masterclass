package innerclasses;


public class ComplexOuterClassDemo {
	public static void main(String[] args) {
		ComplexOuterClass outer = new ComplexOuterClass(0, "outer");
		
		ComplexOuterClass.ComplexInnerClass complexInnerClass = outer.new ComplexInnerClass(9, "inner");
		
		//complexInnerClass.namoNarayan();
		complexInnerClass.completeNamoNarayan();
		
		System.out.println(outer);
		System.out.println(complexInnerClass);
	}
}
