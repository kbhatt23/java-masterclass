package abstractclasses;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println("Cat with name "+getName()+" drinking milk");
	}

	
}
