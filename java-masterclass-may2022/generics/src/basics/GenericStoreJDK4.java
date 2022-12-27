package basics;

//prior to jdk 5 we did not have generics
//to store general data we need to have Object referece
public class GenericStoreJDK4 {

	private Object data;

	public GenericStoreJDK4(Object data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
}
