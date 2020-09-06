package wronghashcodeandequals;

public class Planet {

	private final String name;

	public Planet(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Planet [name=" + name + "]";
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	//since we allow sublsess to be comparable we should block overrding for this method
	@Override
	public final boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		//i am allowing comaprision check even for subclasses
		//below is doing only for that class
		if (!(obj instanceof Planet))
			return false;
		Planet other = (Planet) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
