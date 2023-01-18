package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import commons.Book;
import commons.BooksDB;
import commons.Book.Category;

public class GroupByCategory {

	public static void main(String[] args) {
		List<Book> books= BooksDB.findAll();
		
//		Map<Category, List<Book>> categoryBookMap=
//		books.stream()
//		    .collect(Collectors.groupingBy(Book :: getCategory));
//	
//		
//		categoryBookMap.forEach((k,v) -> System.out.println("category:"+k+", books:"+v));
		
//		Map<Category, List<Long>> categoryBookMap=
//				books.stream()
//				    .collect(Collectors.groupingBy(Book :: getCategory,
//				    		Collectors.mapping(Book :: getId, Collectors.toList())
//				    		));
//			
//				
//				
		
		//groupby using custom tomap collector
		
		Map<Category, List<Book>> categoryBookMap=
		books.stream()
		   .collect(Collectors.toMap(Book :: getCategory, book -> {List<Book> storage =  new ArrayList<>();
		   storage.add(book);
		   return storage;
		   }, 
				   	(items,item) -> {items.addAll(item); return item;}
				   ));
		
		categoryBookMap.forEach((k,v) -> System.out.println("category:"+k+", books:"+v));
	}
}
