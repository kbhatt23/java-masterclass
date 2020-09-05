package learning.set;

import java.util.HashSet;
import java.util.Set;

import com.base.BasicClassForCollection;

public class SetCopy {
public static void main(String[] args) {
	Set<Integer> set = new HashSet<Integer>();
	set.add(12);set.add(13);
	set.add(12);set.add(1);
	set.stream().forEach(System.out::println);
	
	Set<Integer> setCopy = new HashSet<Integer>(set);
	setCopy.stream().forEach(System.out::println);
	
	//for object
	Set<BasicClassForCollection> setObj = new HashSet<BasicClassForCollection>();
	setObj.add(new BasicClassForCollection("jai shree ram"));

	Set<BasicClassForCollection> setObjCopy = new HashSet<BasicClassForCollection>(setObj);
	setObjCopy.add(new BasicClassForCollection("jai radha madhav"));
	
	for(BasicClassForCollection i : setObjCopy) {
		if(i.getName().equals("jai shree ram")) {
			i.setName("jai radha madhav");
		}
	}
	System.out.println("==============");
	setObj.stream().forEach(System.out::println);
	System.out.println("================");
	setObjCopy.stream().forEach(System.out::println);
}
}
