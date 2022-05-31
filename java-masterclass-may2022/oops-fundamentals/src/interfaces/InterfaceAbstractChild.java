package interfaces;

//no implmemenation is forced by compiler
public abstract class InterfaceAbstractChild implements SuperInterface , AnotherSuperInterface{

	abstract void lalla();
	
	//can not restrict to default or protected or private
	//can only be public
	@Override
	public void foo() {
		System.out.println("foo implemented by abstract class");
	}
	
}
