package learning.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {
	public static void main(String[] args) {
		Map<String, String> godMantras = new HashMap<String, String>();
		System.out.println("initial size " + godMantras.size());

		godMantras.put("ram", "jai sita ram");
		godMantras.put("krishna", "jai radhe krishna");

		// overide same key
		if (!godMantras.containsKey("ram"))
			System.out.println("old value of ram " +godMantras.put("ram", "jai shree sita ram"));
		else
			System.out.println("ram mantra already exist");
		
		godMantras.putIfAbsent("sheni", "om shan shanishcharaya namah");
		godMantras.putIfAbsent("ram", "jai ramaduta hanuman");
		godMantras.put("keshava", "jai radha madhav");

		System.out.println("final size " + godMantras.size());
		System.out.println(godMantras.get("ram"));
		
		//remove things
		//asuming keshava is also known as krishna
		//wont remove until both meets
		godMantras.remove("keshava", "kaun hain ji");
		

		//replace method
		//like in case of putifabsent ->< put only if item is not there
		//this method expects to update the entry only if exists unline put whihc override if exist and add if do not exist
		//in case itmeis not there it wont even add the new entry
		
		//it will replace just based on key
		//godMantras.replace("keshava", "jai radhe krishna");
		//just ike remove if we want to repalce if both key and value exists
		
		//godMantras.replace("keshava","kaun hain ji", "jai radhe krishna");
		godMantras.replace("keshava","jai radha madhav", "jai radhe krishna");
		
		//wont insert entry as fakedeva do not exist , if we had used put a new entry wud have been added
		godMantras.replace("fakedeva", "jai fakedeva");
		
		// hashset return s random keys, not in order
		for (String keyName : godMantras.keySet()) {
			System.out.println("mantra of " + keyName + " is " + godMantras.get(keyName));
		}
	}
}
