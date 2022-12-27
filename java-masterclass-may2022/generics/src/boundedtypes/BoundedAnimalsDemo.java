package boundedtypes;

import java.util.ArrayList;
import java.util.List;

public class BoundedAnimalsDemo {

	public static void main(String[] args) {
		AnimalStore<Animal> store = new AnimalStore<>(new Dog("kabuki"));
		manipulaeanimal(store);
		
		//not possible
		//AnimalStore<String> ka = null;
		
		//not possible
		//AnimalStore<Animal> store1 = new AnimalStore<>(new Object()));
		
		store = new AnimalStore<>(new Cat("michi"));
		
		//this is also possible
		AnimalStore<Dog> dogStore = new AnimalStore<>(new Dog("kainchuli")); 
		
		manipulaeanimal(dogStore);
		manipulaeanimal(store);

		//possible
		List<int[]> kanha = new ArrayList<>();
	}

	private static void manipulaeanimal(AnimalStore<? extends Animal> store) {
		store.eat();
		store.makeSound();
	}
}
