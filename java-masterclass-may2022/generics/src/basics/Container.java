package basics;

//to demonstrate generic with inheritance
public interface Container<T> {

	void set(T t);
	T get();
}
