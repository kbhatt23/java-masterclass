package basics;

public interface SelfMap<K,V> {

	//for first entry return null
	//for existing entry overrrides old value and return old value
	V put(K key, V value);
	
	boolean containsKey(K key);
	
	V delete(K key);
}
