package streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;

import commons.Book;
import commons.BooksDB;

public class CustomCollectorDemo {

	public static void main(String[] args) {
		
				Collector<Book, HashSet<Book>, List<Book>> collector = Collector.of(() -> new HashSet<Book>(),
						(storage,item) -> storage.add(item),
						(s1,s2) -> {s1.addAll(s2); return s1;},
						ArrayList :: new,
						Characteristics.CONCURRENT);
				
				List<Book> result  = BooksDB.findAll()
				  .stream()
				  .collect(collector);
				
				System.out.println(result);
	}
}
