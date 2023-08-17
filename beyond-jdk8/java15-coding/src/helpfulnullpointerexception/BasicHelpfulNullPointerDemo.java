package helpfulnullpointerexception;

public class BasicHelpfulNullPointerDemo {

	public static void main(String[] args) {
		//String name = null;
		String name = "kaka";
		System.out.println(name.contains(" "));
		
		Address address = new Address("c 502 apartment", null);
		Order order = new Order(1, address);
		//no arg constructor wont be created
		//new Order();
		
		System.out.println(order.address().country().toUpperCase());
	}
}

record Order(int id, Address address){
	public Order{
		if(id <= 0)
			throw new IllegalArgumentException("id can not be <=0");
	}
}
record Address(String address1 , String country){
	
	//we forgot to add validation for country constructor call
	public Address{
		if(address1 == null || address1.isBlank())
			throw new IllegalArgumentException("address1 can not be empty");
	}
}
