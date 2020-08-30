package wrapperclasses.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 *
 */
public class Bank {
	private String name;
	private List<Branch> branches;

	public Bank(String name) {
		if (name == null || name.length() == 0) {
			throw new RuntimeException("Name of Bank is invalid");
		}
		this.name = name;
		branches = new ArrayList<Branch>();
	}

	public void addBranch(String branchName) {
		if (branches.stream().anyMatch(branch -> branch.getName().equals(branchName))) {
			System.err.println("Branch already exists");
		} else {
			branches.add(new Branch(branchName));
		}
	}
	
	/**
	 * This method returns all the branhces in a bank
	 * @return
	 */
	public List<Branch> findAllBranches(){
		return branches;
	}
	public Branch findBranchByName(String branchName) {
		return branches.stream().filter(branch -> branch.getName().equals(branchName)).findFirst().orElse(null);
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", branches=" + branches + "]";
	}

}
