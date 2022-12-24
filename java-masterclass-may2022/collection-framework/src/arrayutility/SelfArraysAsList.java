package arrayutility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Arrays.asList creates list backed by fixed size array
// in list we can not add any new item as inner array is not growable
//hence in main array we can not add new item as we can not grow it
//nor we can grow the items using list.add method as inner array is not growable

// if we modify item at specific index of main array it will reflect in list and vice versa
public class SelfArraysAsList {

	public static void main(String[] args) {
		String[] names = { "shree ganesh", "sita ram", "uma mahesh", "lakshmi narayan" };

		List<String> namesList = Arrays.asList(names);

		String collect = Arrays.stream(names).collect(Collectors.joining(", ", "[", "]"));
		System.out.println(namesList);
		System.out.println(collect);

		// can not add new items in array or array list
		// unsupportedoperationexception
		// namesList.add("fake name");
		// even remove not allowed
		// namesList.remove("shree ganesh");

		// but can modify indices at both array and list and it reflects at both place

		namesList.set(1, "Sita Rama");

		collect = Arrays.stream(names).collect(Collectors.joining(", ", "[", "]"));
		System.out.println(namesList);
		System.out.println(collect);

		names[0] = "Shree Ganesh";

		collect = Arrays.stream(names).collect(Collectors.joining(", ", "[", "]"));
		System.out.println(namesList);
		System.out.println(collect);
	}
}
