package common;

public class ComparableFather implements Comparable<ComparableFather>{

	private String name;

	public ComparableFather(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ComparableFather [name=" + name + "]";
	}

	@Override
	public int compareTo(ComparableFather o) {
		return this.name.compareTo(o.name);
	}

	
}
