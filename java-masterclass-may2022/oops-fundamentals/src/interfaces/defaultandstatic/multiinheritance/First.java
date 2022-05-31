package interfaces.defaultandstatic.multiinheritance;

public interface First {

	default void go() {
		System.out.println("First interface says go");
	}
}
