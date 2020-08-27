package inheritance;

public class Animal {

	private String name;
	private boolean haslegs;
	private int brains;
	public Animal(String name, boolean haslegs, int brains) {
		super();
		this.name = name;
		this.haslegs = haslegs;
		this.brains = brains;
	}
	
	public void makeSound() {
		System.out.println("animal making sound");
	}
	
}
