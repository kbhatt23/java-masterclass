package sets;

import java.util.Comparator;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

import lists.Book;
import queues.Passenger;

public class SortedSetDemo {

	public static void main(String[] args) {
		//auto sort based on comparable interface
		//if not comparable must provide comparator
		
		//sortIntegers();
		sortBooks();
	}

	private static void sortIntegers() {
		SortedSet<Integer> sortedSet = new TreeSet<>();
		sortedSet.add(23);
		sortedSet.add(33);
		//nulls not allowed, give runtimeexception
		//sortedSet.add(null);
		
		//duplicates not allowed
		sortedSet.add(33);
		sortedSet.add(10);
		sortedSet.add(1);
		sortedSet.add(-1);
		
		//should print in increasing order
		System.out.println(sortedSet);
	}
	private static void sortBooks() {
		//SortedSet do not care about hashcode and equals
		//for sorting it uses comparable compareto method 
		//if entity is nto implementing comparable throsw runtimeexception
		Book book1 = new Book("java", 100d);
		Book book2 = new Book("java advanced", 200d);
		Book book3 = new Book("concurrnecy", 101d);
		Book book4 = new Book("algorithm", 99d);
		
		SortedSet<Book> books = new TreeSet<Book>();
		//SortedSet<Book> books = new TreeSet<Book>(Comparator.comparing(Book :: getPrice));
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		
		for(Book book : books) {
			System.out.println(book);
		}
	}
}
