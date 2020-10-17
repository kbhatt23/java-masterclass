package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheUsingLinkedHashMap<K,V> extends LinkedHashMap<K, V>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8644605638044903090L;
	private  int maxSize ;
	public LRUCacheUsingLinkedHashMap(int maxSize){
		super(16, 0.75f, true);
		this.maxSize=maxSize;
	}
	
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		if(size() > maxSize) {
			System.out.println("Starting to clean old");
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		LRUCacheUsingLinkedHashMap<Integer, String> map = new LRUCacheUsingLinkedHashMap<Integer, String>(3);
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(1, "one updated");
		map.put(4, "four");
		map.put(3, "three updated");
		map.put(5, "five");
		//should remove the oldest entry -> in case we are updaing the same key it istill newer than the other one
		System.out.println(map);
		System.out.println("again");
		//size is mrpoe and hence no need to delete older accesed entry
		Map<Integer, String> mapTest = new LRUCacheUsingLinkedHashMap<Integer, String>(7);
		mapTest.put(1, "one");
		mapTest.put(2, "two");
		mapTest.put(null, "null key wala");
		mapTest.put(null, "null key wala updated");
		mapTest.put(23, null);
		mapTest.put(null, "null key wala updated again");
		mapTest.put(33, null);
		
		System.out.println("size "+mapTest.size());
		System.out.println(mapTest);
	}
}
