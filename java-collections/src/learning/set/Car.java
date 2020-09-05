package learning.set;

public class Car {
	private int nonDependentPReorpty;

	public int getNonDependentPReorpty() {
		return nonDependentPReorpty;
	}
	public void setNonDependentPReorpty(int nonDependentPReorpty) {
		this.nonDependentPReorpty = nonDependentPReorpty;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		System.out.println("passing object class name "+obj.getClass());
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	private String number;
	private String name;
	public Car(String number, String name) {
		this.number = number;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Car [number=" + number + ", name=" + name + "]";
	}
}
