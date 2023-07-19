package localtypeinference;

import java.util.List;

public class TypeInferenceUsage {
	
	//not possible to use
	//private var str = "king";
	
	//type to be defined explicitly
	private String str2 = "king";

	public static void main(String[] args) {
		methodLocalVariables();
	}

	private static void methodLocalVariables() {
		var names = List.of("sita rama", "radhe shyam");
		
		for(var name : names) {
			System.out.println(name+"="+name.length());
		}
		
		//can use with try with resources etc
	}
}
