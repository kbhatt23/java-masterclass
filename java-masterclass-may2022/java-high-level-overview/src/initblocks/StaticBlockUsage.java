package initblocks;

import java.util.HashMap;
import java.util.Map;

//static block helps in initializing static fields of a class
// why: we can not add multiple line of code on class level, so to have some logic to initialize static fields we need static block
public class StaticBlockUsage {

	//lets say we have dummy data
	//static field can not be updated in multiple lines here in class directly
	//put it in static init block
	public static  final Map<Integer, String> numberMap;
	//we must know once a variable is decalred on isntance level it can not be reassingned here on instance level
	//static int count=1;
	
	//can not reassing static or instance field once declared and initialized
	// count=23;
	
	//init block can not be reassinged also if else condition can anot be kept directly on class level
	
//	int k = 23;
//	k=24;
	
	static {
		//its importatnt
		//multiple line code has to be here
		//also once static or instance field of class is initialized we can not reiniatize it on class level directly
		numberMap = new HashMap<>();
		numberMap.put(1, "one");
		numberMap.put(2, "two");
	}
	
	public static void main(String[] args) {
		System.out.println(numberMap);
	}
}
