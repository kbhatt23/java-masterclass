package basics;

public class Store<T> implements Container<T> {
	private T data;

	public void set(T data) {
		this.data = data;
	}
	public T get() {
		return data;
	}
	
	//primitives can not be used in generic type
	//class level type can not be used in static methods and static fields
	
	public static /* T */String storeRepresentation() {
		//T item = data;
		return "fake";
	}
	
	//static field can not use class typed data type
	//public static T item = null;
	
}
