package sealedclass2;

import sealedclass1.Animal;

//children of sealed class/interface must be either final or non sealed
//final means it can not be extended , non-selade means it can be extended

public non-sealed class Dog extends Animal{

	@Override
	public void move() {
		System.out.println("Dog moving");
	}

}
