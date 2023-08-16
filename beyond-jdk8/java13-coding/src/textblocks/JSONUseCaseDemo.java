package textblocks;

public class JSONUseCaseDemo {

	public static void main(String[] args) {
		String profileJson = "{\"name:\": kanishk}";
		System.out.println(profileJson);
		
		System.out.println("====================================");
		
		String profileJsonTextBlocj = """
				{
				  "name" : "kanishk"  
				  "address":{
				    "address1": "C 502 Majestic Apartment"
				    "country" : "india"
				}                   
				""";
		System.out.println(profileJsonTextBlocj);
	}
}
