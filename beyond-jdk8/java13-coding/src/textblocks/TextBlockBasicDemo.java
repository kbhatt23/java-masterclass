package textblocks;

public class TextBlockBasicDemo {

	public static void main(String[] args) {
		//tougher to read
		//might forget adding \n
		//tougher to use
		String address = "C502 Majestic Apartment\n"+"Sector 18 Dwarka\n"+"New Delhi\n"+"-110075";
		
		System.out.println(address);
		
		System.out.println("====================================");
		
		String addressTextBlock = """
				C502 Majestic Apartment
				Sector 18 Dwarka
				New Delhi
				"name": "kaka"
				-110075""";
		System.out.println(addressTextBlock);
		
	}
}
