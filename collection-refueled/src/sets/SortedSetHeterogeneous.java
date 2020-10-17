package sets;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import common.ComparableFather;

public class SortedSetHeterogeneous {
public static void main(String[] args) {
	SortedSet sortedSet = new TreeSet();
	sortedSet.add(new ComparableFather("sita ram"));
	//comparator will die
	//actualy hascode and equals could have collected it but comparbale do not habdle this
	//sortedSet.add(23);
	System.out.println(sortedSet);
	
	//iot uses hashcode and equals
	//returns flase whenh string is equals checked with integer
	Set hashSet = new HashSet();
	hashSet.add(new ComparableFather("sita ram"));
	//equals retuns false and hence adds it
	hashSet.add(23);
	System.out.println(hashSet);
}
}
