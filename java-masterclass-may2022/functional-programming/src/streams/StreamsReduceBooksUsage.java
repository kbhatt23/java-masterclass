package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import commons.Book;
import commons.BooksDB;

public class StreamsReduceBooksUsage {

	public static void main(String[] args) {
		List<Book> books =  BooksDB.findAll();
		
		//find book with author with sorted name
		Optional<Book> lowestauthorBook=
		books.stream()
		    .reduce((book1,book2) -> book1.getName().compareTo(book2.getName()) <= 0 ? book1 : book2 );
		
		lowestauthorBook.ifPresent(book -> System.out.println("lowest author book "+book));
		
		Optional<Book> lowestauthorBookV2=
				books.stream()
				    .min(Comparator.comparing(Book::getName));
				
		lowestauthorBookV2.ifPresent(book -> System.out.println("lowest author book "+book));
		
	}
}
