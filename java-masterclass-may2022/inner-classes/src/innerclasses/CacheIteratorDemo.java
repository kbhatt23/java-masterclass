package innerclasses;

public class CacheIteratorDemo {

	public static void main(String[] args) {
		SelfCache<String> cache = new SelfCache<>(4);
		cache.addEntry("sita rama");
		cache.addEntry("lakshman hanuman");
		cache.addEntry("uma mahesh");
		//cache.addEntry("fake");
		
		cache.addEntry("nandi bhaktagana");
		
		System.out.println(cache.size());
		CacheIterator<String> iterator = cache.iterator();
		
		while(iterator.hasNext())
			System.out.println("cache item "+iterator.next());
	}
}
