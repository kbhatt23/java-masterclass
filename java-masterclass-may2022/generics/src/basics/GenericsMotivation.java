package basics;

import java.sql.Date;

public class GenericsMotivation {

	public static void main(String[] args) {
		// problem();

		problemSolved();

	}

	private static void problemSolved() {

		// dev stores java.sql.date

		Date data = new Date(12343434);
		GenericStoreJDK5<Date> genericStoreJDK5 = new GenericStoreJDK5<>(data);

		//compiler forces check
		//GenericStoreJDK5<Date> genericStoreJDK5Another = new GenericStoreJDK5<>(new java.util.Date(1232323232));
		// dev 1 fetch : no need to downcast in code, happens at compile time
		Date sqlDate =  genericStoreJDK5.getData();
		System.out.println(sqlDate);
		System.out.println(data == sqlDate);

		// dev 2 inserts other data: not possible
		//genericStoreJDK5.setData(new java.util.Date());

		// dev 1 fetch
		sqlDate =  genericStoreJDK5.getData(); // classcast exception
		// there is no type safety at compile time
		// intentions is to write generic reusable code + compile time safety =>
		// generics
		System.out.println(sqlDate);

	}

	private static void problem() {
		// dev stores java.sql.date

		Date data = new Date(12343434);
		GenericStoreJDK4 genericStoreJDK4 = new GenericStoreJDK4(data);

		// dev 1 fetch
		Date sqlDate = (Date) genericStoreJDK4.getData();
		System.out.println(sqlDate);
		System.out.println(data == sqlDate);

		// dev 2 inserts other data
		genericStoreJDK4.setData(new java.util.Date());

		// dev 1 fetch
		sqlDate = (Date) genericStoreJDK4.getData(); // classcast exception
		// there is no type safety at compile time
		// intentions is to write generic reusable code + compile time safety =>
		// generics
		System.out.println(sqlDate);
	}
}
