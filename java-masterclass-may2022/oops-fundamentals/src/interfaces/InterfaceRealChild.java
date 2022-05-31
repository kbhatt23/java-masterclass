package interfaces;

public class InterfaceRealChild extends InterfaceAbstractChild{

	@Override
	public void bar() {
		System.out.println("real child implements bar");
		//also print num
		//both interface have same variable name and data type
		//so will give ocmpilation error
		System.out.println("NUM is: "+SuperInterface.NUM);
	}

	@Override
	void lalla() {
		System.out.println("real child implements lalla");
	}
	

}
