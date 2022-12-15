package codetest;

import java.util.Date;

public final class ImmutableClass {

	private final int id;

	private final Date doj;

	public ImmutableClass(int id, Date doj) {
		this.id = id;
		this.doj = new Date(doj.getTime());
	}

	public int getId() {
		return id;
	}

	public Date getDoj() {
		return new Date(doj.getTime());
	}

	public static void main(String[] args) {
		System.out.println("hello");
	}

}
