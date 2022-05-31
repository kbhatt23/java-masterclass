package diamondprobleminterface;

public interface DiamondImplementorB extends DiamondContractInterface {

	@Override
	default void method() {
		System.out.println("approach b executed");
	}

}
