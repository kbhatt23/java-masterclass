package oopvsfp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Set;

import commons.Book;
import commons.Book.Category;
import commons.BooksDB;

public class GroubBooksByCategory {

	public static void main(String[] args) {
		List<Book> books = BooksDB.findAll();
		
		System.out.println("books: "+books);
		
		Map<Book.Category, List<Book>> groupByCategory =  groupUsingOOP(books);
		
		for( Entry<Book.Category,List<Book>> group: groupByCategory.entrySet()) {
			System.out.println("category: "+group.getKey());
			System.out.println("books: "+group.getValue());
		}
	}

	private static Map<Category, List<Book>> groupUsingOOP(List<Book> books) {
		Map<Category, List<Book>> groupByCategory = new HashMap<>();
		for(Book book : books) {
			Category category = book.getCategory();
			
			List<Book> groupedList = groupByCategory.get(category);
			if(groupedList == null) {
				groupedList = new ArrayList<>();
				groupByCategory.put(category, groupedList);
			}
			
			groupedList.add(book);
		}
		
		return groupByCategory;
	}
	
	private static Map<Category, List<Book>> groupUsingFP(List<Book> books) {
		return books.stream()
		     .collect(Collectors.groupingBy(Book :: getCategory));
	}
}
