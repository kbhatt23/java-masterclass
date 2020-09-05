package com.base;

//REMOVING SETTERS FOR IMMUTABILITY
public final class ImmutableClass {
	@Override
	public String toString() {
		return "ImmutableClass [id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", classObject="
				+ classObject + "]";
	}

	// immutable means data once initialzed can not be changed at all
	private final int id;
	private final String name;
	private final Integer birthDate;
	private final BasicClassForCollection classObject;

	public ImmutableClass(int id, String name, Integer birthDate, BasicClassForCollection classObject) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		//do deep copy
		this.classObject = new BasicClassForCollection(classObject);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getBirthDate() {
		return birthDate;
	}

	public BasicClassForCollection getClassObject() {
		
		return new BasicClassForCollection(this.classObject);
	}

}
