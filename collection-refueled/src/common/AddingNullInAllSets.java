package common;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AddingNullInAllSets {
	public static void main(String[] args) {
		// hashset allow only one null value
		Set<String> hashSet = new HashSet<String>();
		populateNullsInSet(hashSet);
		System.out.println("======================");

		// linked hashset also support only one null value
		Set<String> linkedHAshSet = new LinkedHashSet<String>();
		populateNullsInSet(linkedHAshSet);
		System.out.println("======================");

		// tree set do not support null values -> unable to compare as equality in tree set is based on compartor .compareto returning 0 and not equals
		//default String comaraotr can not compare null and throw nullpointer exception
		//Set<String> treeSet = new TreeSet<String>();
		//nuls filrst can be used in that case
		Set<String> treeSet = new TreeSet<String>(Comparator.nullsFirst(Comparator.naturalOrder()));
		populateNullsInSet(treeSet);
		System.out.println("======================");
	}

	private static void populateNullsInSet(Set<String> set) {
		set.add("jai shree ram");
		set.add(null);
		set.add(null);
		PrintUtility.printJoinedStream(set.stream(), set.getClass().getSimpleName() + " with null items: ");
	}

}
