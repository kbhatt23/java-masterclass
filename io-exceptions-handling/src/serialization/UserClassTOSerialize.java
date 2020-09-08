package serialization;

import java.io.Serializable;

public class UserClassTOSerialize /* implements Serializable */{

	private static final long serialVersionUID = 4223589515725263593L;
	private String name;

	public UserClassTOSerialize(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserClassTOSerialize [name=" + name + "]";
	}
}
