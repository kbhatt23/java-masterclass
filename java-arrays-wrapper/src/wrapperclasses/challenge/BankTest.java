package wrapperclasses.challenge;

import java.util.List;
import java.util.Scanner;

public class BankTest {
	private static Scanner scanner = new Scanner(System.in);
	private Bank bank = new Bank("Radha Madhav Bank");

	public static void main(String[] args) {
		boolean quit = false;
		BankTest obj  = new BankTest();
		while (!quit) {
			try {
				printInstructions();
				if (scanner.hasNextInt()) {
					int option = scanner.nextInt();
					switch (option) {
					case 1:
						obj.createBranch();
						break;
					case 2:
						obj.listAllBranches();
						break;
					case 3:
						obj.addCustomerToBranch();
						break;
					case 4:
						obj.creditBalance();
						break;
					case 5:
						obj.debitBalance();
						break;
					case 6:
						obj.listAllTransactions();
						break;
					case 7:
						obj.listAllCustomers();
						break;
					case 8:
						quit=true;
						break;
					default:
						break;
					}
				} else {
					System.out.println("Please enter valid option");
				}
				scanner.nextLine();
			} catch (Exception e) {

			}
		}
		scanner.close();
	}

	private void addCustomerToBranch() {
		System.out.println("Please enter Branch name ");
		String branchName = scanner.next();
		System.out.println("Please enter cusotmer name");
		String customerName = scanner.next();
		System.out.println("Please enter balance amount");
		double amount = scanner.nextDouble();
		Branch findBranchByName = bank.findBranchByName(branchName);
		if(findBranchByName == null) {
			System.err.println("Please enter vlaid branch name");
			return;
		}
		findBranchByName.addCustomer(new Customer(customerName, amount));
		System.out.println("Customer added to branch");
	}
	
	private void creditBalance() {
		System.out.println("Please enter Branch name ");
		String branchName = scanner.next();
		System.out.println("Please enter cusotmer name");
		String customerName = scanner.next();
		System.out.println("Please enter amount to credit");
		double amount = scanner.nextDouble();
		Branch findBranchByName = bank.findBranchByName(branchName);
		if(findBranchByName == null) {
			System.err.println("Please enter vlaid branch name");
			return;
		}
		Customer findCustomer = findBranchByName.findCustomer(customerName);
		if(findCustomer == null) {
			System.err.println("Please enter valid customer name");
			return;
		}
		findCustomer.credit(amount);
		System.out.println("Customer account credited");
	}
	
	private void debitBalance() {
		System.out.println("Please enter Branch name ");
		String branchName = scanner.next();
		System.out.println("Please enter cusotmer name");
		String customerName = scanner.next();
		System.out.println("Please enter amount to credit");
		double amount = scanner.nextDouble();
		Branch findBranchByName = bank.findBranchByName(branchName);
		if(findBranchByName == null) {
			System.err.println("Please enter vlaid branch name");
			return;
		}
		Customer findCustomer = findBranchByName.findCustomer(customerName);
		if(findCustomer == null) {
			System.err.println("Please enter valid customer name");
			return;
		}
		findCustomer.debit(amount);
		System.out.println("Customer account debitted");
	}

	private  void createBranch() {
		System.out.println("Please enter branch name: ");
		String name = scanner.next();
		bank.addBranch(name);
		
	}
	
	private void listAllBranches() {
		List<Branch> findAllBranches = bank.findAllBranches();
		if(findAllBranches == null || findAllBranches.isEmpty()) {
			System.out.println("Branches are empty for Radha Madhav Bank");
		}else {
			int index = 0;
			for(; index < findAllBranches.size() ; index++) {
				System.out.println((index+1)+ ". "+findAllBranches.get(index).getName());
			}
		}
	}
	private void listAllCustomers() {
		System.out.println("Please enter branch name: ");
		String name = scanner.next();
		Branch findBranchByName = bank.findBranchByName(name);
		if(findBranchByName == null) {
			System.err.println("Please enter valid branch name");
		}else {
			findBranchByName.printAllCusotmers();
		}
	}
	
	private void listAllTransactions() {

		System.out.println("Please enter Branch name ");
		String branchName = scanner.next();
		System.out.println("Please enter cusotmer name");
		String customerName = scanner.next();
		Branch findBranchByName = bank.findBranchByName(branchName);
		if(findBranchByName == null) {
			System.err.println("Please enter vlaid branch name");
			return;
		}
		Customer findCustomer = findBranchByName.findCustomer(customerName);
		if(findCustomer == null) {
			System.err.println("Please enter valid customer name");
			return;
		}
		List<Double> transactions = findCustomer.getTransactions();
		if(transactions == null || transactions.isEmpty()) {
			System.out.println("no transaction for customer");
		}else {
			for(int i =0 ; i < transactions.size() ; i++)
			{
				System.out.println((i+1) + ". Transaction: "+transactions.get(i));
			}
		}
	
	}

	private static void printInstructions() {
		System.out.println("Welcome to radha madhav bank");
		System.out.println("Enter 1 for creating a branch");
		System.out.println("Enter 2 to list down branches");
		System.out.println("Enter 3 for adding a customer to branch");
		System.out.println("Enter 4 credit balance to customer");
		System.out.println("Enter 5 debit balance to customer");
		System.out.println("Enter 6 to view all transaction of customer");
		System.out.println("Enter 7 to view all customers");
		System.out.println("Enter 8 to quit");
	}
}
