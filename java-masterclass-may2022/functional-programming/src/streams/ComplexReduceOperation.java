package streams;

import java.util.List;

import commons.Book;
import commons.BooksDB;

public class ComplexReduceOperation {

	public static void main(String[] args) {

		List<Book> allBooks = BooksDB.findAll();

		// this can be done better using collectors
		// using joining , but here i am using reduce for demo

		StringBuilder concatNames = allBooks.stream().reduce(new StringBuilder(),
				(identity, element) -> identity.append(element.getName()).append(","),
				(builder1,builder2) -> builder1.append(",").append(builder2));

		System.out.println(concatNames);
	}
}
