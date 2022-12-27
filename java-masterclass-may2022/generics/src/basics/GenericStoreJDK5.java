package basics;

//generic + compile time safety check
// generics is used only at compile time
public class GenericStoreJDK5<T> {

	private T data;

	public GenericStoreJDK5(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
