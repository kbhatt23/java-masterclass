package nestedclasses.innerclasses;

import nestedclasses.innerclasses.UpperClassCombined.InnerStaticClassCombined;

public class UpperClassCombinedTest {
public static void main(String[] args) {
	UpperClassCombined upper = new UpperClassCombined(11);
	//UpperClassCombined.InnerClassComibed inner = new UpperClassCombined.InnerClassComibed(12);
	UpperClassCombined.InnerClassComibed inner = upper.new InnerClassComibed(12);
	inner.printAll();
	//private inner class
	//client can not create object of private inner class
	//only upper class can create object and has to hold it
	System.out.println("private inner class============");
	UpperClassCombined upperPrivate = new UpperClassCombined(14,15);
	
	upperPrivate.printAllPrivate();
	
	System.out.println("static nested class ================");
	InnerStaticClassCombined staticinner = new UpperClassCombined.InnerStaticClassCombined(99);
	staticinner.printAll();
	
	System.out.println("static nested class private -=============");
	UpperClassCombined upperPRicatestatic = new UpperClassCombined(101, 102, true);
	upperPRicatestatic.printAllPrivateStatic();
}
}
