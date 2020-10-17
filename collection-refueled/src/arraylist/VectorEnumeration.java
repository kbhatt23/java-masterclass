package arraylist;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class VectorEnumeration {
	public static void main(String[] args) {

		System.out.println("Kindly enter 8 integers");
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> intVectors = new Vector<Integer>();
		for(int i=0 ; i<8 ; i++) {
			intVectors.add(scanner.nextInt());
		}
		scanner.close();

		Enumeration<Integer> elements = intVectors.elements();
		while(elements.hasMoreElements()) {
			System.out.println("element found "+elements.nextElement());
		}
	}

}
