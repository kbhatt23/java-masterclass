package wildcards;

public class ChildWorker extends GenericsParent{

	private double salary;

	public ChildWorker(String name, double salary) {
		super(name);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "ChildWorker [salary=" + salary + ", super.toString()=" + super.toString() + "]";
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
