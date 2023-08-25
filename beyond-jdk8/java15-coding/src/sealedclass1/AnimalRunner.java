package sealedclass1;

import sealedclass2.Dog;
import sealedclass2.GreatDane;

public class AnimalRunner {

	public static void main(String[] args) {
		execute(new Dog());
		execute(new GreatDane());
	}

	public static void execute(Animal animal) {
		animal.eat();
		animal.move();
	}
}
