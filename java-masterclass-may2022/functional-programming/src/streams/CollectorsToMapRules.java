package streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import commons.Book;
import commons.BooksDB;

//a. in case of collision runtime exception occurs, hence use appropriate method with what to do during collision
public class CollectorsToMapRules {

	public static void main(String[] args) {
		
		List<Book> books = BooksDB.findAll();
		
		//adding entry to create collision
		books.add(new Book(books.get(0).getId(), "duplicate book", "duplicate author", books.get(0).getCategory()));
		
	  Map<Long, Book> bookMap =	books.stream()
			  		.collect(Collectors.toMap(Book :: getId, Function.identity(),
			  					//(oldBook, newBook) -> newBook // default hashmap behavior
			  					//(oldBook, newBook) -> oldBook //old one, never override on collision
			  					  (oldBook, newBook) -> newBook.getName().contains("duplicate") ? oldBook : newBook //logical 
			  				));
	  
	  bookMap.forEach((k,v) -> System.out.println("bookid: "+k+", book: "+v));
	}
}
