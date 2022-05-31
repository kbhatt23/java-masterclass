package interfaces;

//abstract is not mandatory and is by default abstract
//100 percent abstract
public abstract interface BasicInterfaceRule {

	//all members are public 
	
	//all fields are public static final
	//if we add private or abstract or strictfp for field it gives compilation error
	//has to be compile time constant : value to be available at compile time
	/* strictfp */ int fakeField = 99 ;
	
	//fakeField =99;
	
	//all methods are public and abstract
	//compiler cries when we use private static
	/* protected */ void test();
}
