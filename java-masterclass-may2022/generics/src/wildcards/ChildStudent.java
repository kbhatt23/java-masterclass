package wildcards;

public class ChildStudent extends GenericsParent{

	private String standard;

	public ChildStudent(String name, String standard) {
		super(name);
		this.standard = standard;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	@Override
	public String toString() {
		return "ChildStudent [standard=" + standard + ", super.toString()=" + super.toString() + "]";
	}
	
	
}
