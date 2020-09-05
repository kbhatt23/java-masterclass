package com.theatre.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.base.BasicClassForCollection;

public class ArrayListUsage {

	public static void main(String[] args) {
		List<BasicClassForCollection> collection = new ArrayList<BasicClassForCollection>();
		BasicClassForCollection key = new BasicClassForCollection("jai shree ram:3");
		for (int i = 0; i < 10; i++) {
			collection.add(new BasicClassForCollection("jai shree ram:" + i));
			}
		
		int binarySearch = Collections.binarySearch(collection, key);
		System.out.println(collection.get(binarySearch));
	}
}
