package interfaces.diamondproblem;

public class ChildClass implements Interface3 {

	@Override
	public void test1() {
		System.out.println("jai shree ram test1");
	}

	@Override
	public void test2() {
		System.out.println("jai shree ram test1");		
	}
	
	public static void main(String[] args) {
		Interface1 i1 = new ChildClass();
		i1.test();
		i1.test1();
	}
}
