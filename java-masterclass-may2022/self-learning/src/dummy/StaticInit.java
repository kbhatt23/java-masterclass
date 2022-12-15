package dummy;

public class StaticInit {
	StaticInit(){
		System.out.println("jai shree ram says constructor");
	}
	{
		System.out.println("jai shree ram says init block");
	}
	
	static {
		System.out.println("jai shree ram says static block");
	}
	public static void main(String[] args) {
		System.out.println("jai shree ram says main method");
		
	}
}
