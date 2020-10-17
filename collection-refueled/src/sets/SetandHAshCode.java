package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import common.BasicFather;

public class SetandHAshCode {
public static void main(String[] args) {
	//hashcode of basicFather class do not exist
	//hence every item will be considered unique
	Set<BasicFather> set = new HashSet<BasicFather>();
	BasicFather o1 = new BasicFather();
	BasicFather o2 = new BasicFather();
	
	set.add(o1);
	set.add(o2);
	//hould not add as we are passing same object and hence hashcode is same and == is also same
	set.add(o2);
	
	System.out.println("size "+set.size());
	
	Set<BasicFather> set1 = new LinkedHashSet<BasicFather>();
	
	set1.add(o1);
	set1.add(o2);
	set1.add(o2);
	
	System.out.println("size "+set.size());
}
}
