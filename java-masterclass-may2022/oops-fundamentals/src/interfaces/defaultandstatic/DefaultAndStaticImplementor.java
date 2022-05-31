package interfaces.defaultandstatic;

//static context and instance context is completely seprate in itnerface
//normally in extends class we can use static as well as non static methods inherited
//but not in case of interface
//static can take statically and instance can use only defalt method inherited
public class DefaultAndStaticImplementor  extends AbstractDefaultAndStaticInterface implements DefaultAndStaticInterface{

	@Override
	public void greet() {
		defaultShreeRam();
		
		//not able to call static method of interfaces 
		//staticShreeRam();
		//With reference we can
		DefaultAndStaticInterface.staticShreeRam();
		System.out.println("child also says jai shree ram");
	}
	
	
}
