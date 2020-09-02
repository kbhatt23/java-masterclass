package abstractclasses;

public class AnimalTest {
	public static void main(String[] args) {
		Animal dog1 = new Dog("shippu");
		dog1.eat();
		Animal cat = new Cat("dheku");
		cat.eat();
		
		Bird shinkhu  = new Pigeon("shinkhu");
		shinkhu.eat();
		shinkhu.fly();
	}
}
