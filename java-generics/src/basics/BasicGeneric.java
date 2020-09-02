package basics;

public class BasicGeneric<T> {

	private T t;

	public BasicGeneric(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "BasicGeneric [t=" + t + "]";
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}
