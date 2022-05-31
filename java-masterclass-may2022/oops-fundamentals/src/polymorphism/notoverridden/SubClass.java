package polymorphism.notoverridden;

/*
 * a. Subclass inherits static and instance variables and methods both,
 *    depending upon access modifier and package
 * b. However Subclass can only override only instance method
 * c. The value of static method, variable and instance variable will be same: Reference tyoe not the object will define it   
 */

/*public*/ class SubClass extends SuperClass {

	int instanceVariable = 11;

	int instanceMethod() {
		return instanceVariable;
	}

	static int staticVariable = 101;

	static int staticMethod() {
		return staticVariable;
	}

}
