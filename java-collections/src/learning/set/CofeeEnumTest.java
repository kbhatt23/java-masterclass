package learning.set;

public class CofeeEnumTest {
	public static void main(String[] args) {
		CofeeType small = CofeeType.SMALL;
		System.out.println("Kindly bring cofee of small Type " + small);
		// CofeeType small2 = CofeeType.SMALL;
		CofeeType big = CofeeType.BIG;
		System.out.println("Does enum type same " + (big == small));
		
		CofeeType[] cofees = CofeeType.values();
		for(CofeeType cofee : cofees) {
			System.out.println("Price of type "+cofee.name()+" is "+cofee.getPrice());
			cofee.prepareCofee();
		}
	}
}

//enum cna be declared withing the class or as a seperate file
enum CofeeType {
	// each constatnt is type of Cofeetype
	SMALL(10){
		public  void prepareCofee() {
			System.out.println("preapring small cofee");
		}
	}, BIG(15){
		public  void prepareCofee() {
			System.out.println("preapring big cofee");
		}
	}, LARGE(20){
		public  void prepareCofee() {
			System.out.println("preapring large cofee");
		}
	};

	// no need to add finla , as enum onstructor can be called only through enum
	// only internally
	private int price;

	public int getPrice() {
		return price;
	}

	// construcotr of enum cna not be public -> by default it is private and u can
	// not insert any pother type of access modifier
	/* public */ private CofeeType(int price) {
		this.price = price;
	}
	
	public abstract void prepareCofee();

}
