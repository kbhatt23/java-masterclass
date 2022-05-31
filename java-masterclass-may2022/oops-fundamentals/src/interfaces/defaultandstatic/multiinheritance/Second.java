package interfaces.defaultandstatic.multiinheritance;

public interface Second extends First{

	default void go() {
		System.out.println("Second interface says go");
	}
	
}
