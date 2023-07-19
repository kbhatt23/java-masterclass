package localtypeinference;

import java.util.ArrayList;
import java.util.List;

public class ExamplesOFGoodAndBad {

	public static void main(String[] args) {
		usingLiterals();
		useCollections();
	}

	private static void useCollections() {
		//not possible to use
		//as jdk 7 added type inference from left to right 
		//hence can not use var interence here
		
		List<String> names = new ArrayList<>();
		names.add("radhe krishna");
		
		var namesBad= new ArrayList<>();
		namesBad.add(new Object());
		
		var namesBetter= new ArrayList<Integer>();
		//namesBetter.add(new Object());
		namesBetter.add(23);
		
	}

	private static void usingLiterals() {
//		boolean isRegistered = true;
//		ExamplesOFGoodAndBad examplesOFGoodAndBad = new ExamplesOFGoodAndBad();
//		String option = "print";
//		
//		System.out.println(option+": "+isRegistered+" for "+examplesOFGoodAndBad.toString());
		
		//better readability , all variables are inline
		var isRegistered = true;
		var examplesOFGoodAndBad = new ExamplesOFGoodAndBad();
		var option = "print";
		
		System.out.println(option+": "+isRegistered+" for "+examplesOFGoodAndBad.toString());
		
		//below is bad because of performance
//		byte count = 1; // stored in byte will be space efficient 
		var count=1; //int takes more space
		
	}
	
}
