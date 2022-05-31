package diamondprobleminterface;

public interface DiamondImplementorA extends DiamondContractInterface {

	@Override
	default void method() {
		System.out.println("approach a executed");
	}

}
