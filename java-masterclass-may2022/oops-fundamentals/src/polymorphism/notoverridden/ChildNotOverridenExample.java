package polymorphism.notoverridden;

 class ChildNotOverridenExample extends ParentNotOverridenExample{

	 int instanceVariable = 11;
	 
	 //only this will reflect  in polymorphic overriden object
	 int instanceMethod() {
		 return instanceVariable;
	 }
	 
	 static int staticVariable = 101;
	 
	 static int staticMethod() {
		 return staticVariable;
	 }

	 
}
