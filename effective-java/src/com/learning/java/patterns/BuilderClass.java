package com.learning.java.patterns;

//builder wrapper, with immutability
public class BuilderClass {

	@Override
	public String toString() {
		return "BuilderClass [name=" + name + ", address=" + address + ", email=" + email + ", age=" + age + "]";
	}

	private final String name;

	// optional, and hence not sure about constructor
	private final String address;

	// optional, and hence not sure about constructor
	private final String email;

	private final int age;

//KEEP ALL MANDATORY AS WELL AS NON MANDATORY HERE
	private BuilderClass(String name, String address, String email, int age) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}
	
	public static Builder builder(){
		return new Builder();
	}

	public static class Builder {
		private String name;

		// optional, and hence not sure about constructor
		private String address;

		// optional, and hence not sure about constructor
		private String email;

		private int age;

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder address(String address) {
			this.address = address;
			return this;
		}

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}
		
		public BuilderClass build() {
			//validation of states
			if(address == null) {
				throw new RuntimeException("Address can not be null");
			}
			return new BuilderClass(this.name, this.address, this.email, this.age);
		}

	}
}
