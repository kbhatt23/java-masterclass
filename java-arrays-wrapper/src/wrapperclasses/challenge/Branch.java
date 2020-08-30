package wrapperclasses.challenge;

import java.util.ArrayList;
import java.util.List;

public class Branch {

	private String name;
	
	private List<Customer> customers;

	public Branch(String name) {
		if(name == null || name.length() == 0) {
			throw new RuntimeException("Name of branch is invalid");
		}
		this.name = name;
		customers = new ArrayList<Customer>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Customer> getCustomers() {
		return customers;
	}
	
	public void addCustomer(Customer customer) {
		if(customers.contains(customer)) {
			System.err.println("Customer "+customer + " already existing in branch "+this.getName());
		}else {
			customers.add(customer);
		}
	}
	
	public Customer findCustomer(String customerName) {
		return customers.stream().filter(customer -> customer.getName().equals(customerName)).findFirst()
			.orElse(null);
	}

	@Override
	public String toString() {
		return "Branch [name=" + name + ", customers=" + customers + "]";
	}
	
	public void printAllCusotmers() {
		if(customers.isEmpty()) {
			System.err.println("Branch do not ave any customers");
		}else {
			customers.stream().map(customer -> " * " + customer.getName()+ " -> "+ customer.getBalance())
					.forEach(System.out::println);
		}
	}
}
