package abstractclasses;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	//all overriding rules are applied
	public void eat() {
		System.out.println("Dog with name "+getName() + " eating pedigree");
	}
}
