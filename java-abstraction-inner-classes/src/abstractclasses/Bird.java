package abstractclasses;

public abstract class Bird extends Animal implements CanFly{

	public Bird(String name) {
		super(name);
	}

	//all the child class of this need not to define this
	//we are expecting all birds to eat food
	@Override
	public void eat() {
		System.out.println("Bird with name "+getName()+" eating food");
	}
	//all birds can dly differently
	//hence adding abstract method
	//child only need to implement abstract methods only
	//for good practise moving it to interface
	//not all birds cna fly, also some aniumal can fly like bad
	
	//public abstract void fly();

}
