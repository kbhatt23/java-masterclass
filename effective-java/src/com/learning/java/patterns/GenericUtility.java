package com.learning.java.patterns;

import java.util.ArrayList;
import java.util.List;

public class GenericUtility {

	<T> List<T> addToList(T a, T b){
		List<T> item = new ArrayList<>();
		item.add(a);
		item.add(b);
		return item;
		}

	
	public static void main(String[] args) {
		GenericUtility obj = new GenericUtility();
		obj.addToList(1,"ram");
	}
}
