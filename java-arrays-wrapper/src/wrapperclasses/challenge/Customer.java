package wrapperclasses.challenge;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Double> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Double> transactions) {
		this.transactions = transactions;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	private String name;
	private List<Double> transactions;
	private double balance;
	public Customer(String name, double balance) {
		if(name == null || name.length() == 0) {
			throw new RuntimeException("Name of customer is invalid");
			}
		if(balance < 0) {
			throw new RuntimeException("Balance can not be negative");
		}
		this.name = name;
		//0 balance and empty transaction list
		this.balance = balance;
		this.transactions = new ArrayList<Double>();
		this.transactions.add(balance);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Customer other = (Customer) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", transactions=" + transactions + ", balance=" + balance + "]";
	}
	
	public void credit(double amount) {
		if(amount <= 0 ) {
			System.err.println("Can not credit negative or zero balance");
		}else {
			balance += amount;
			transactions.add(amount);
		}
	}
	public void debit(double amount) {
		if(amount <= 0 ) {
			System.err.println("Can not debit negative or zero balance");
		}
		else if(amount > balance) {
			System.err.println("Can not debit more than balance");
		}
		else {
			amount = -1*amount;
			balance += amount;
			transactions.add(amount);
		}
	}
}
