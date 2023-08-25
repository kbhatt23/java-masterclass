package jdk16recordsindepth;

public class ProductDTORunner {

	public static void main(String[] args) {
		//no arg construtor wont be added
		
		//ProductDTO fake = new ProductDTO();
		
		ProductDTO phone = new ProductDTO(null,null,null);
		
		System.out.println(phone);
	}

}
