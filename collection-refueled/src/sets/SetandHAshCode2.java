package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import common.BasicFather;
import common.HashCodeFather;

public class SetandHAshCode2 {
public static void main(String[] args) {
	//hashcode of basicFather class do not exist
	//hence every item will be considered unique
	Set<HashCodeFather> set = new HashSet<HashCodeFather>();
	HashCodeFather o1 = new HashCodeFather("first");
	HashCodeFather o2 = new HashCodeFather("second");
	HashCodeFather o3 = new HashCodeFather("second");
	
	set.add(o1);
	set.add(o2);
	//hould not add as we are passing same object and hence hashcode is same and == is also same
	set.add(o2);
	//if hashcode and equals are implemented it will consider this as duplicate and skip it
	set.add(o3);
	
	System.out.println("size "+set.size());
	System.out.println(set);
	
	Set<HashCodeFather> set1 = new LinkedHashSet<HashCodeFather>();
	
	set1.add(o1);
	set1.add(o2);
	set1.add(o2);
	set1.add(o3);
	
	System.out.println("size "+set.size());
	System.out.println(set1);
}
}
