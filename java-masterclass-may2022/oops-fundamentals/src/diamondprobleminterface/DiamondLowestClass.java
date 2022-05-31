package diamondprobleminterface;

//multiple interfaces can be implemented
public class DiamondLowestClass implements DiamondImplementorA , DiamondImplementorB{


	//compiler forced to override even though it was implemented in interface
	//lets use method of a implementor
	@Override
	public void method() {
		DiamondImplementorA.super.method();
	}
}
