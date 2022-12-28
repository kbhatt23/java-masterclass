package staticnestedclasses;

public class SingletonDemo {

	public static void main(String[] args) {
		//SingleTonBuilder one = new SingleTonBuilder();
		
		//SingleTon one  = new SingleTon();
		SingleTon one = SingleTon.build();
		
		SingleTon two = SingleTon.build();
		
		System.out.println(one == two);
	}
}
