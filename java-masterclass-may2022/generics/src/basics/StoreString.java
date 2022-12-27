package basics;

public class StoreString implements Container<String> {
	private String data;

	public void set(String data) {
		this.data = data;
	}
	
	public String get() {
		return this.data;
	}
}
