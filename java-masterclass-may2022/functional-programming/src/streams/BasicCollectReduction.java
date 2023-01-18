package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import commons.Book;
import commons.BooksDB;
import commons.Book.Category;

public class BasicCollectReduction {

	public static void main(String[] args) {
		//find all unique set of categories
		List<Book> books = BooksDB.findAll();
		
		//should be present in db
		Set<Category> uniqueCategory= 
		books.stream()
		     .map(Book :: getCategory)
		     .collect(Collectors.toSet());
		
		System.out.println(uniqueCategory);
		List<Category> categories=
		books.stream()
	     .map(Book :: getCategory)
	     .collect(Collectors.toList());
		
		System.out.println(categories);
		System.out.println(books.size() == categories.size());
		
		List<Category> collectedList =
		books.stream()
		    .map(Book :: getCategory)
		    .collect(ArrayList :: new, List :: add, List :: addAll);
		System.out.println(collectedList);
		
	}
}
