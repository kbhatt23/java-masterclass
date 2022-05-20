package polymorphism.notoverridden;

//child class in this case will inheirt both instance and static methods and variables
//however only instacne method is supposed to be overriden
//if we overrite instance variable, static variable and static method
//it will be more like creating new method/variable 
//variable reference tpe will define the value
 class ParentNotOverridenExample {

	 int instanceVariable = 10;
	 
	 int instanceMethod() {
		 return instanceVariable;
	 }
	 
	 static int staticVariable = 100;
	 
	 static int staticMethod() {
		 return staticVariable;
	 }
}
