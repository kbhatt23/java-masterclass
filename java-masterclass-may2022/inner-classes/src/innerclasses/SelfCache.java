package innerclasses;

public class SelfCache<T> {

	private T[] storage;
	
	private int size;
	
	private int maxCapacity;

	public SelfCache(int maxCapacity) {
		this.storage = (T[])new Object[maxCapacity];
		this.maxCapacity=maxCapacity;
	}
	
	public void addEntry(T data) {
		if(size >= maxCapacity)
			throw new IllegalStateException("cache is full");
		
		storage[size++] = data;
	}
	
	public int size() {
		return size;
	}
	
	public CacheIterator<T> iterator(){
		return new CacheIteratorImpl<>();
	}
	
	//good use case of inner class: non static class member class
	
	private class CacheIteratorImpl<T> implements CacheIterator<T>{
		
		//static method and field can not live inside non static inner class
//		public static void hello() {
//			System.out.println("hello");
//		}
		
		//static field also can not exist in static non inner classes
		//public static int ka=99;
		
		private int iteration;
		
		@Override
		public boolean hasNext() {
			//able to access outer clas private field
			//also instacnce field is accessed without creating object
			//
			return iteration < size;
		}

		@Override
		public T next() {
			//it is able to access even private field
			//it is able to access instance field and methods without creating object of outer class
			//as inner class lives under outerclass
			return (T)storage[iteration++];
		}
		
	}
}
