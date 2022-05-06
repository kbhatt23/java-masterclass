public class VarArgObjectNull{

	
	public static void main(String... args){
		Object[] a = null;
		store(true, a);
		
		
		
	}
	
	static void store(boolean success , Object... obj){
	
		for(Object o : obj){
			System.out.println("element is "+o);
		}
	}

}