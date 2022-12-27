package basics;

import java.util.HashMap;
import java.util.Map;

public class SelfHashMap<K,V> implements SelfMap<K, V>{

	private Map<K, V> storage;
	
	public SelfHashMap() {
		this.storage = new HashMap<>();
	}

	@Override
	public V put(K key, V value) {
		return storage.put(key, value);
	}

	@Override
	public boolean containsKey(K key) {
		return storage.containsKey(key);
	}

	@Override
	public V delete(K key) {
		return storage.remove(key);
	}

	@Override
	public String toString() {
		return storage.toString();
	}

	
	
}
