package wildcards;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BoundedVsUnboundedWildCards2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("one","three","nine","four");
		System.out.println(names);
		sort(names);
		System.out.println(names);
		
		//if item is not comparable will give compilation error
		List<Item> items = Arrays.asList(new Item("one", 10d), new Item("two", 2d) ,new Item("three", 1d), new Item("four", 10d));
		System.out.println(items);
		sort(items); //wont compile until implements comarable
		System.out.println(items);
		
	}
	
	
	//sort feature
	//can pass List<String>, List<Book> but all this must implement comparable
	//can not call mutation methods but can call read method
	//meaning can not call methods that take class level Type argument
	private static void sort(List<? extends Comparable> items) {
		Collections.sort(items);
	}
}

class Item implements Comparable<Item>{
	private String name;
	private double price;
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Item o) {
		return Double.valueOf(price).compareTo(o.price);
	}
	
	
}