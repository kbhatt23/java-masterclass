package basics;

public class SuperClass {
	protected String superPropertyy = "radha madhav";

	public SuperClass(String superProperty) {
		System.out.println("jai shre ram from super arg const");
		this.superPropertyy = superProperty;
	}

	public SuperClass() {
		System.out.println("jai shre ram from super no arg");
	}

	@Override
	public String toString() {
		return "SuperClass [superPropertyy=" + superPropertyy + "]";
	}
	
	}
