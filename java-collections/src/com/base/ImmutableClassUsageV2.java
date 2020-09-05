package com.base;

import java.util.HashMap;
import java.util.Map;

public class ImmutableClassUsageV2 {
public static void main(String[] args) {
	BasicClassForCollection classObject1 = new BasicClassForCollection("base object");
	BasicClassForCollection classObject2 = new BasicClassForCollection("base object 11");
	BasicClassForCollection classObject3 = new BasicClassForCollection("base object 12");
	Map<BasicClassForCollection, BasicClassForCollection> mapRef = new HashMap<BasicClassForCollection, BasicClassForCollection>();
	mapRef.put(classObject2, classObject2);
	mapRef.put(classObject3, classObject3);
	ImmutableClassV2 obj = new ImmutableClassV2(1, "radha madhav", 1991, classObject1, mapRef);
	System.out.println("original obj "+obj);
	obj.getClassObject().setName("lapela king");
	
	System.out.println("level 1 mutated obj "+obj);
	BasicClassForCollection lafda = new BasicClassForCollection("ladfa");
	obj.getReference().put(lafda, lafda);
	obj.getReference().get(classObject2).setName("change the name");
	
	System.out.println("level 2 mutated obj "+obj);
}
}
