package maps;

import java.util.LinkedHashMap;

public class LRUCache<K,V> extends LinkedHashMap<K, V>{

	private static final long serialVersionUID = -5782381419101660050L;

	private final int maxSize;
	
	public LRUCache(int maxSize, int initialCapacity, float loadFactor ) {
		super(initialCapacity, loadFactor, true);
		this.maxSize=maxSize;
	}
	
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		boolean evictCache =  this.size() > maxSize;
		if(evictCache)
			System.out.println("removeEldestEntry: evicting oldest entry");
		return evictCache;
	}
	
}
