package com.theatre.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.base.BasicClassForCollection;

public class ArrayListCopy {
	public static void main(String[] args) {
		List<BasicClassForCollection> collection = new ArrayList<BasicClassForCollection>();
		for (int i = 0; i < 10; i++) {
			collection.add(new BasicClassForCollection("jai shree ram:" + i));
		}
		
		//List<BasicClassForCollection> collection2 = new ArrayList<BasicClassForCollection>(collection);
		
		//collection2.add(new BasicClassForCollection("jai radha madhav"));
		//collection2.get(0).setName("jai shree ram");
		
		//collection.stream().forEach(System.out::println);
		//System.out.println("=======================");
		//collection2.stream().forEach(System.out::println);
		
		
		System.out.println("using streams basic 1");
		//below will create shallow copy only
		//List<BasicClassForCollection> collection2 = collection.stream().collect(Collectors.toList());
		
		//for deep copy
		List<BasicClassForCollection> collection2 = collection.stream().map(obj -> new BasicClassForCollection(obj.getName())).collect(Collectors.toList());
		collection2.add(new BasicClassForCollection("jai radha madhav"));
				collection2.get(0).setName("jai shree ram");
				
				collection.stream().forEach(System.out::println);
				System.out.println("=======================");
				collection2.stream().forEach(System.out::println);
	}
}
