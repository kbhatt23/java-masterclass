module java9.module.user{
	//when client is module
	//requires java9.coding;
	
	//when clien is non module need to add in module path only
	//as this project is modular
	//can add non module library in non modular project using classpath
	//to add non modular library in modular project need to add in modulepath
	requires java8.coding;
	requires java.logging;
}