package boundedtypes;

//asuming this will store atleast animal
//shuld inhibit atleast animal behavior
public class AnimalStore<T extends Animal> {

	private T animal;

	public AnimalStore(T animal) {
		this.animal = animal;
	}

	
	public void eat() {
		animal.eat();
	}
	
	public void makeSound () {
		animal.makeSound();
	}
}
