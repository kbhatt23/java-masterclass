package abstractclasses;

public abstract class Animal {
	//child need to call constructor to initialize this
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	//child will inherit this for view
	public String getName() {
		return this.name;
	}
	//can be protected as well
	public abstract void eat();
}
