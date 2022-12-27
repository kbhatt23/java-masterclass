package wildcards;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperVsExtendsWildCards {

	public static void main(String[] args) {
		List<GenericsParent> parentItems = new ArrayList<>();
		parentItems.add(new GenericsParent("ram"));
		parentItems.add(new ChildStudent("kannu", "1"));
		extendsUsage(parentItems);

		System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
		List<ChildWorker> workerItems = Arrays.asList(new ChildWorker("tambu", 100.00d),
				new ChildWorker("kanishk", 1d));
		extendsUsage(workerItems);

		System.out.println("=-=-=-=-=super usage-=-=-=-=-=-=");

		superUsage(parentItems); // works
		System.out.println(parentItems);

		// superUsage(workerItems); //do nto work

		List<Object> objectStore = new ArrayList<>();
		superUsage(objectStore);
		System.out.println(objectStore);
	}

	private static void extendsUsage(List<? extends GenericsParent> items) {
		for (GenericsParent item : items) {
			System.out.println("extendsUsage.found item: " + item);
		}

		// no method allowed that has class level generic type argument except null
		// below works fine
		// items.add(null);
	}

	private static void superUsage(List<? super GenericsParent> items) {
		// can only add GenericPArent, can not add its child nor parent
		// remember in super we can only add exact class object, can not pass child nor
		// parent

		// argument type will be of Genericparent type or its any super class like
		// object

		items.add(new GenericsParent("fake")); // allowed
		// below not allowed
		// items.add(new Object());

		// below also not allowed
		// items.add(new ChildStudent("fake child", -1));

		// not possible as now we are passing objet type also an that causes classcast
		// exception
		// for(GenericsParent notPossible : items) {
		for (Object possible : items) {
		}
	}

//	private static void fake1(List<Integer> a) {
//
//	}
//// same signature for compiler hence wrong overload error
////	private static void fake1(List<String> b) {
////
////	}
//	
//	private static void fake1(List b) {
//
//	}
}
