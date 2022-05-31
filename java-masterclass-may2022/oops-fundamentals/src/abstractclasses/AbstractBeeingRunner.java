package abstractclasses;

public class AbstractBeeingRunner {
	//instance field can not be initalized after decalaration at root level of class
	//int fake;
	//fake=99;
	
	public static void main(String[] args) {
		// reuzable and clean code
		// polymorphic

		AbstractLivingBeeing beeing = new HumanBeeing(1001, "Kanishk");
		greet(beeing);
		sleep(beeing);

		System.out.println("-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		beeing = new CatBeeing(1002, "billa");
		greet(beeing);
		sleep(beeing);
	}

	private static void greet(AbstractLivingBeeing beeing) {
		beeing.greet();
	}
	
	private static void sleep(AbstractLivingBeeing beeing) {
		beeing.sleep();
	}
}
