package lists;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableUseCase {

	public static void main(String[] args) {
		List<Book> books = Arrays.asList(new Book("java basics", 99d), new Book("java concurrency", 101d));
		
		BooksDataBase booksDataBase = new BooksDataBase(books);
		
		for(Book book : booksDataBase) {
			System.out.println(book);
		}
		
		System.out.println("\n");
		
		
		Iterator<Book> iterator = booksDataBase.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//we can run the iterator only once
		//as once it reaches end its over, we need to get the itertor once again
		System.out.println("another started");
		iterator = booksDataBase.iterator(); // creates new iterator from beginning
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

class BooksDataBase implements Iterable<Book>{

	private List<Book> storage;
	
	
	
	public BooksDataBase(List<Book> storage) {
		this.storage = storage;
	}


	@Override
	public Iterator<Book> iterator() {
		return storage.iterator();
	}
	
}

