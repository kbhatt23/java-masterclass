package treesetcomplexities;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import common.PrintUtility;

public class TreeSetComplexityInsertion {
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
		Set<String> stringsTreeSet = new TreeSet<String>(stringsHashSet);
		
		PrintUtility.printJoinedStream(stringsHashSet.stream(), "hashset string with case sensitive: ");
		//it sorts and add upper case first sort thema mon themnselves and then sort lower case
		PrintUtility.printJoinedStream(stringsTreeSet.stream(), "Sorted string with case sensitive: ");
		
		//if we will add in hashset it will be random
		
	}

}
