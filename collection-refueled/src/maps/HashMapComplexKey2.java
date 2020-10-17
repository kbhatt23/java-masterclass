package maps;

import java.util.HashMap;
import java.util.Map;

import common.BasicFather;
import common.HashCodeFather;

public class HashMapComplexKey2 {
	public static void main(String[] args) {
		
		Map<HashCodeFather, String> map = new HashMap<HashCodeFather, String>();
		HashCodeFather obj1 = new HashCodeFather("one");
		HashCodeFather obj2 = new HashCodeFather("two");
		HashCodeFather obj3 = new HashCodeFather("three");
		//hash code will be different for all the 3 keyobjects
		//hence equals need not to be checked at all
		map.put(obj1, "first");
		map.put(new HashCodeFather("one"), "first updated");
		map.put(obj2, "second");
		map.put(obj3, "third");
		System.out.println("val with same obj1 "+map.get(obj1));
		
		System.out.println("val with same obj2 "+map.get(obj2));
		System.out.println("val with same obj3 "+map.get(obj3));
		System.out.println("val with logical same object "+map.get(new HashCodeFather("one")));
		System.out.println("val with logical same object "+map.get(new HashCodeFather("two")));
		System.out.println("val with logical same object "+map.get(new HashCodeFather("three")));
		System.out.println("val with logical same object "+map.get(new HashCodeFather("four")));
		System.out.println("full map "+map );
	}
}
