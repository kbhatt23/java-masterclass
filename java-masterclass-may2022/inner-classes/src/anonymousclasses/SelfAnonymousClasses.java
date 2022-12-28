package anonymousclasses;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//anonymous classe do nt have a name
//declared and isntantiated together
public class SelfAnonymousClasses {
	
	private static final Comparator<String> stringComparator =  new Comparator<String>() {
		
		public int compare(String one, String two) {
			return one.compareTo(two);
		}
		
		//we can not have constructor inside anonymous class
		//because class do not have a name
		//but we can have init blocks
		//also method level parameter can be used to assign variables
		
		{
			System.out.println("anonymous class init block called");
		}
		
		//we can add method
		//but this can not be called at all
		// as this is not present in comparator
		public void fakeMethod() {
			System.out.println("fake is best");
		}
		
		//we can also override methods
		@Override
		public String toString() {
			return "jai shree sita rama lakshman hanuman";
		}
	};

	public static void main(String[] args) {
		
		sortExample();
	}

	private static void sortExample() {
		//class definition
		//object instantiation in one step
		//it is independent of other class variable/method variables
		//for each time of method call it creates new object when single object can help us
		//move to static compile time constant
//		Comparator<String> stringComparator =  new Comparator<String>() {	
//			
//			public int compare(String one, String two) {
//				return one.compareTo(two);
//			}
//		};
		
		System.out.println(stringComparator.toString());
		
		int comapre = stringComparator.compare("one", "two");
		System.out.println(comapre);
		
		
		Set<String> stringset =  new TreeSet<>(stringComparator);
		stringset.add("hello");
		stringset.add("cat");
		stringset.add("apple");
		
		System.out.println(stringset);
	}
}
