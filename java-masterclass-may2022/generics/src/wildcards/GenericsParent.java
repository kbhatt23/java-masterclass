package wildcards;

public class GenericsParent {

	protected String name;

	public GenericsParent(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "GenericsParent [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
