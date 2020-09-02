package abstractclasses;

public class Pigeon extends Bird{

	public Pigeon(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.println("Pigeon with name"+ getName()+"is flying at height 100m");
	}

}
