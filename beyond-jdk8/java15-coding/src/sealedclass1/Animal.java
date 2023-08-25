package sealedclass1;

import sealedclass2.Dog;

public sealed abstract class Animal permits Dog{

	public void eat() {
		System.out.println("Generic Animal Eating");
	}
	
	//all animal must move to be alive
	public abstract void move();
}
