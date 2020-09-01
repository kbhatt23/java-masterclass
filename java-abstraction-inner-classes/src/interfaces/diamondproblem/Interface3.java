package interfaces.diamondproblem;

public interface Interface3 extends Interface1, Interface2{

	@Override
	default void test() {
		System.out.println("jai shree ram from interface 3");
	}

}
