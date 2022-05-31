package interfaces;

public class InterfaceFakeChild implements SuperInterface , AnotherSuperInterface{

	@Override
	public void bar() {
		System.out.println("fake child implements bar");
	}

	@Override
	public void foo() {
		System.out.println("fake child implements foo");		
	}


}
