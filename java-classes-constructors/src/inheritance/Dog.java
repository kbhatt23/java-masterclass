package inheritance;

public class Dog extends Animal{
	public Dog(String name) {
		super(name, true, 1);
	}
	
	private void bark() {
		System.out.println("dog barking");
	}

	public void makeSound() {
		bark();
	}
	
	public void custom() {
		System.out.println("dog custom method called");
		//super will always call method of super class
		//if we miss super it will first check if method is overriden -> if not then it calls super
		//super.makeSound();
		makeSound();
	}
}
