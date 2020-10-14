package treesetcomplexities;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import common.PrintUtility;

public class TreeSetComplexityInsertionCaseInsenstivie {
	public static void main(String[] args) {
		Set<String> stringsHashSet = new HashSet<String>();
		//String have defaul compoarator 
		stringsHashSet.add("aaa");
		stringsHashSet.add("bbb");
		stringsHashSet.add("ZZZ");
		stringsHashSet.add("AAA");
		stringsHashSet.add("zzz");
		stringsHashSet.add("BBB");
		//copying collection
		//also using compartor this time for case insensitiveness -> considers AAA and aa as equal
		//alos considers ZZZ and zzz as smae and hence sorting order will be tricky
		Comparator<String> caseInsensitiveOrder = String.CASE_INSENSITIVE_ORDER;
		Set<String> stringsTreeSet = new TreeSet<String>(caseInsensitiveOrder);
		stringsTreeSet.addAll(stringsHashSet);
		
		//comparator is used for equality check in tree set unlike equals merhod in hashset
		//if a.compareto(b) == 0 it means they are equal and hence duplicates are not allowed in Treeset based on comparator
		PrintUtility.printJoinedStream(stringsHashSet.stream(), "hashset string with case sensitive: ");
		//it sorts and add upper case first sort thema mon themnselves and then sort lower case
		PrintUtility.printJoinedStream(stringsTreeSet.stream(), "Sorted string with case sensitive: ");
		
		//if we will add in hashset it will be random
		
	}

}
