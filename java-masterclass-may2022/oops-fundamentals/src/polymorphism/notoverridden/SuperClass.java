package polymorphism.notoverridden;

/*public*/ class SuperClass extends Object {

	int instanceVariable = 10;

	int instanceMethod() {
		return instanceVariable;
	}

	static int staticVariable = 100;

	static int staticMethod() {
		return staticVariable;
	}
}
