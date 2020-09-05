package com.base;

public class ExtendsImmutableClass /* extends ImmutableClass */{
	
	//even though getters are not there
	//we cna manually hold onject there
	private  BasicClassForCollection classObject;
	public ExtendsImmutableClass(int id, String name, Integer birthDate, BasicClassForCollection classObject) {
	//	super(id, name, birthDate, classObject);
		this.classObject = classObject; 
	}
	
	//@Override
	public BasicClassForCollection getClassObject() {
		return this.classObject;
	}

}
