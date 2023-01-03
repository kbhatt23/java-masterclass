package basics;

import java.util.HashSet;
import java.util.Set;

public class Book {

	private String name;
	
	private String author;
	
	private double price;
	
	private BookGenre bookGenre;
	
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", bookGenre=" + bookGenre + "]";
	}


	//we support max 100 price of a book
	private static final double MAX_PRICE = 100d;

	public Book(String name, String author, double price,BookGenre bookGenre) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.bookGenre=bookGenre;
	}
	
	
	//we can have nested enum
	//it will be static nested class: cannot access instance level fields/methods of inner class
	//inner enum gets compiled into static inner class
	public enum BookGenre{
		THRILLER, COMEDY, ADVENTURE;
		
		//enum can have static method/field too
		//however it can access only static context
		private static final Set<String> bannedGenre;
		static {
			bannedGenre = new HashSet<>();
			bannedGenre.add("HORROR");
		}
		public static Set<String> bannedGenre(){
			//this. is not accessible
			//return this.bannedGenre;
			return bannedGenre;
		}
		//instance constant specific method
		public void printMAxPRice() {
			//since nested enum is nothing but static inner class
			//it can access private static fields of outer class
			//non static fields are not accesible
			System.out.println("MAX_PRICE: "+MAX_PRICE);
			
			//wont work as price is instance field, 
			//inner enum is static nested class and hence can access only static field of outer class even private
			//System.out.println(price);
		}
		
	}
	
	public static void main(String[] args) {
		Book book1= new Book("hell yeah", "mr fake", 12.12d, Book.BookGenre.COMEDY);
		System.out.println(book1);
		//calling static method
		//single copy per enum and shared across all static constant instances
		Set<String> bannedGenre = Book.BookGenre.bannedGenre();
		System.out.println(bannedGenre);
	}
}
