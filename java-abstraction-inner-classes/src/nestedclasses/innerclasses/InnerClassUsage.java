package nestedclasses.innerclasses;

public class InnerClassUsage {
public static void main(String[] args) {
	//InnerClassExample.InnerClass obj2 = new InnerClass("inner main");
	InnerClassExample mainObj = new InnerClassExample("outer main");
	InnerClassExample.InnerClass innerObj = mainObj.new InnerClass("inner main");
	innerObj.printAllNames();
	System.out.println("====================");
	mainObj.printNameOfInnerClass();
}
}
