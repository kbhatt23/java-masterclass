package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

import common.BasicFather;

public class WeakHashMapVsHashmap {
public static void main(String[] args) {
	Map<BasicFather, String> hashMap= new HashMap<BasicFather, String>();
	checkGcForMap(hashMap);
	
	Map<BasicFather, String> weakMap= new WeakHashMap<BasicFather, String>();
	checkGcForMap(weakMap);
}

private static void checkGcForMap(Map<BasicFather, String> hashMap) {
	System.out.println("started for "+hashMap.getClass().getSimpleName());
	BasicFather obj1 = new BasicFather();
	BasicFather obj2 = new BasicFather();
	hashMap.put(obj1, "one");
	hashMap.put(obj2, "two");
	
	obj1= null ;
	System.gc();
	//looks like obj1 is available for G.C
	//but since hashmpa is string it blocks G.c
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("map items "+hashMap);
}
}
