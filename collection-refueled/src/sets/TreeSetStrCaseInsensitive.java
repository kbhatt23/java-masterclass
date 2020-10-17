package sets;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetStrCaseInsensitive {
//tree set do not need hashcode and equals for duplication and any check
	//compare to is enough
	public static void main(String[] args) {
		NavigableSet<String> set = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		//it considers messi and MESSI equals and no need of checking hashCode and equals in treeset
		set.add("messi");
		set.add("xavi");
		set.add("alba");
		//case sensitive equals so considers it duplciate
		set.add("MeSsI");
		System.out.println(set);
		//contains also uses comparable whihc is case insensitive
		System.out.println("dangerous check which uses solely comparable "+set.contains("MESSI"));
		
		//had we used hashset , it will have considered it as different and woud have added element
		
		//while copying treeset , it wont cosniuder sorting and will use hashcode and equals and hecne 4 items will be there
		Set<String> set1 = new HashSet<String>();
		set1.add("messi");
		set1.add("xavi");
		set1.add("alba");
		//case sensitive equals so considers it duplciate
		set1.add("MeSsI");
		//it considers messi and MESSI equals and no need of checking hashCode and equals in treeset
		System.out.println(set1);
		System.out.println("dangerous check whihch uses hashcode and equals "+set1.contains("MESSI"));
	}
}
