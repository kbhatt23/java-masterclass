package learntest;

public class CachingTest {

	public static void main(String[] args) {
		CachingDataStructure cachingDataStructure = new CachingDataStructure(new TimeProviderImpl(), 2);
		
		
		String key = "sitaram";
		cachingDataStructure.put(key, "jai shree ram", 1000);
		
		System.out.println(cachingDataStructure.get(key));
		System.out.println(cachingDataStructure.size());
		
		sleep(100);
		cachingDataStructure.put(key, "jai shree sita ram", 100);
		
		System.out.println(cachingDataStructure.get(key));
		System.out.println(cachingDataStructure.size());
	}

	private static void sleep(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
