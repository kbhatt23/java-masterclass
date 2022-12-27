package genericmethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

//in case using generic method type inference kicks in to determine data type for compiler
// if argument is passed then that will be data type
//i f not then client code's reference variable data type is inferred
public class TypeInferenceDemo {

	public static void main(String[] args) {
		String a ="jai shree sita ram lakshman hanuman";
		
		String b = logIdentity(a);
		System.out.println(a == b);
		
		int k = 99;
		int k2= logIdentity(k);
		System.out.println(k == k2);
		
		int[] array = new int[] {1,4,5};
		// Collection<Integer> collection = Arrays.asList(4,5,6); //wont allow
		
		Collection<Integer> collection = new ArrayList<>();
		collection.add(4);collection.add(5);collection.add(6);
		
				
		//mergeArrayToCollection(array, collection); // wont compile as int[] can not be boxed to Integer[]
		Integer[] array1 = new Integer[] {1,4,5};
		mergeArrayToCollection(array1, collection);
		
		System.out.println(collection);
	}
	
	//just log anything and return the same
	//type inference based on argument passed from client code
	private static <T> T logIdentity(T input) {
		System.out.println("logIdentity: input: "+input);
		return input;
	}
	
	private static <T> void mergeArrayToCollection(T[] array, Collection<T> collection) {
		for(T in : array) {
			collection.add(in);
		}
	}
}
