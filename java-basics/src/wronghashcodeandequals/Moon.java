package wronghashcodeandequals;

public class Moon extends Planet{

	public Moon(String name) {
		super(name);
	}
	
	/*
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; //i am allowing comaprision check even for
	 * subclasses //below is doing only for that class if (!(obj instanceof Moon))
	 * return false; Moon other = (Moon) obj; if (getName() == null) { if
	 * (other.getName() != null) return false; } else if
	 * (!getName().equals(other.getName())) return false; return true; }
	 */

}
