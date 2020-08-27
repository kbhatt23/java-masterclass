package inheritance;

public class DogTest {
public static void main(String[] args) {
	Animal dog = new Dog("sheepu");
	dog.makeSound();
	
	Dog dog1 = new Dog("leepu");
	dog1.custom();
}

}
