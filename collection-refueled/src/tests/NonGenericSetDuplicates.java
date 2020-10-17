package tests;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSetDuplicates {
public static void main(String[] args) {
	Set strs = new HashSet();
	//hashset uses hashcode and equals to check if item alreayd exist
	//so that duplicates can be skipped
	// according to me line 13 shud give exception 
	//-> Integer and String have hashCode and equals in place so they are not comparable
	strs.add(23);
	strs.add("23");
	strs.add("jai shree ram");
	System.out.println(strs);
}
}
