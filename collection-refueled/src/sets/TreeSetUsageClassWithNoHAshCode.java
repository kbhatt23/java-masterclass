package sets;

import java.util.NavigableSet;
import java.util.TreeSet;

import common.BasicFather;
import common.ComparableFather;

public class TreeSetUsageClassWithNoHAshCode {
public static void main(String[] args) {
	NavigableSet<BasicFather> navigableSet = new TreeSet<BasicFather>();
	//wont insert as comparable interface is not there
	//navigableSet.add(new BasicFather());

	NavigableSet<ComparableFather> navigableSetFather = new TreeSet<>();
	navigableSetFather.add(new ComparableFather("radha madhav"));
	
	navigableSetFather.add(new ComparableFather("sita ram"));
	navigableSetFather.add(new ComparableFather("jai shree ram"));
	
	//duplication based on compare to and no need of hashcode and equals
	navigableSetFather.add(new ComparableFather("jai shree ram"));
	
	System.out.println(navigableSetFather);
}
}
