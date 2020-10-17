package maps;

import java.util.HashMap;
import java.util.Map;

import common.BasicFather;

public class HashMapComplexKey {
	public static void main(String[] args) {
		
		Map<BasicFather, String> map = new HashMap<BasicFather, String>();
		BasicFather obj1 = new BasicFather();
		BasicFather obj2 = new BasicFather();
		BasicFather obj3 = new BasicFather();
		//hash code will be different for all the 3 keyobjects
		//hence equals need not to be checked at all
		map.put(obj1, "first");
		map.put(obj2, "second");
		map.put(obj3, "third");
		System.out.println("val with same obj1 "+map.get(obj1));
		
		System.out.println("val with same obj2 "+map.get(obj1));
		System.out.println("val with same obj3 "+map.get(obj1));
		System.out.println("val with logical same object "+map.get(new BasicFather()));
		System.out.println("full map "+map );
	}
}
