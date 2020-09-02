package abstractclasses;

public class Bat extends Animal implements CanFly{

	public Bat(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.println("Bat with name "+getName()+ "flying heavily" );
	}

	@Override
	public void eat() {
		System.out.println("Bat with name "+getName()+" eatng meal");
	}

}
