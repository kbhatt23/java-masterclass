package interfaces.defaultandstatic.multiinheritance;

public class MultiImplementor implements First,Second{

	@Override
	public void go() {
		//First.super.go();
		//Second.super.go();
		System.out.println("MultiImplementor says go");
	}
	
}
