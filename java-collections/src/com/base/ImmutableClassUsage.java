package com.base;

import java.util.Arrays;

public class ImmutableClassUsage {
public static void main(String[] args) {
	BasicClassForCollection classObject = new BasicClassForCollection("base object");
	ImmutableClass obj1 = new ImmutableClass(1, "base", 1991, classObject);
	System.out.println(obj1);
	//can be mutated -> HENCE removed setters
	//obj1.setBirthDate(1992);
	//same object reference
	classObject.setName("jai keshav");
	
	//lets see another issue
	BasicClassForCollection classObject2 = obj1.getClassObject();
	classObject2.setName("jai ramaduta hanuman");
	System.out.println(obj1);
	
	System.out.println("==============inheritance issue============");
	//BasicClassForCollection classObject3 = new BasicClassForCollection("base object");
	//ImmutableClass obj2 = new ExtendsImmutableClass(1, "base", 1991, classObject3);
	//System.out.println(obj2);
	
	//classObject3.setName("fake inheritacne");
	//System.out.println(obj2.getClassObject());
	String k = "jai shree ram";
	//String[] splits   = k.split(" ");
	String[] splits   = k.split(",");
	int i = 0;
	for(String a: splits) {
		System.out.println(i++ +" "+ a);
	}
	String join = String.join(",", splits);
	System.out.println(join);
}
}
