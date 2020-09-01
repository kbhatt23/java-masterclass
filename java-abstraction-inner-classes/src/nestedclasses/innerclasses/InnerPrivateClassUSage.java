package nestedclasses.innerclasses;


public class InnerPrivateClassUSage {
public static void main(String[] args) {
	UpperClass class1 = new UpperClass("outer main");
	//had it been public inner clas it would be accesible
	//InnerClass innerClass = class1.new InnerClass("inner main");
	
	class1.printALlNames("inner main");
}
}
