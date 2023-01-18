package commons;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import commons.Book.Category;

public class BooksDB {

	private static final String SITA_RAMA = "sita rama";
	private static final String BOOK = "book-";

	private BooksDB() {
	}

	private static final Random RANDOM = new Random();

	public static List<Book> findAll() {
		List<Book> books = new ArrayList<>();
		
		Category[] categories = Book.Category.values();
		int categoryCount = categories.length;
		int numOfBooks = 7;
		for (int id = 1; id <= numOfBooks; id++) {
			books.add(new Book(id, BOOK + id, SITA_RAMA, categories[RANDOM.nextInt(categoryCount)]));
		}

		return books;

	}
}
