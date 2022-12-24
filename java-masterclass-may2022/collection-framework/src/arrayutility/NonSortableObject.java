package arrayutility;

public class NonSortableObject {

	private String stringField;
	
	private int intField;

	public String getStringField() {
		return stringField;
	}

	public void setStringField(String stringField) {
		this.stringField = stringField;
	}

	public int getIntField() {
		return intField;
	}

	public void setIntField(int intField) {
		this.intField = intField;
	}

	public NonSortableObject(String stringField, int intField) {
		super();
		this.stringField = stringField;
		this.intField = intField;
	}

	@Override
	public String toString() {
		return "NonSortableObject [stringField=" + stringField + ", intField=" + intField + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + intField;
		result = prime * result + ((stringField == null) ? 0 : stringField.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NonSortableObject other = (NonSortableObject) obj;
		if (intField != other.intField)
			return false;
		if (stringField == null) {
			if (other.stringField != null)
				return false;
		} else if (!stringField.equals(other.stringField))
			return false;
		return true;
	}
	
	
}
