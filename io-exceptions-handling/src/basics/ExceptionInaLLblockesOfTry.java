package basics;

import java.io.IOException;

public class ExceptionInaLLblockesOfTry {
	public static void main(String[] args) {

		try {
			method1();
		} catch (Exception e) {
			System.out.println("catch block of main method");
		}
	}

	private static void method1() throws Exception{
		try {
			System.out.println("first line of method1");
			boolean la = true;
			if (la)
				throw new Exception();
			System.out.println("last line of method1");
		} catch (Exception e) {
			System.out.println("catch block of method1 called");
			throw e;
		} finally {
			System.out.println("finally block of method1 claled");
			//can return from finally but can not throw from finally
			throw new IOException();
		}
	}
}
