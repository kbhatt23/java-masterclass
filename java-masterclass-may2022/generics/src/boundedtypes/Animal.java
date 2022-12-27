package boundedtypes;

//all animals will have name
// all animals eat atleast
// all animals must move: maybeimplemetation will be different
public abstract class Animal {

	protected final String name;

	protected Animal(String name) {
		this.name = name;
	}

	
	public void eat() {
		System.out.println(getClass().getSimpleName() +": "+name+" eating food");
	}
	
	public abstract void makeSound();
	
	
}
