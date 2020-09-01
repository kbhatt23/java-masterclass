package interfaces;
//interface access modifier can only be public or default
public interface ITelephone {
	
	//all methods are force public and abstract 
	/* private */ /* static */ void powerOn(); 
	
	 void call(String /*int*/ phoneNumber);

}
