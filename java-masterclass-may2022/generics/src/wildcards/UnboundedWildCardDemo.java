package wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnboundedWildCardDemo {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("radha madhav");
		names.add("sita rama");
		
		utilize(names);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		utilize(numbers);
		
		List<Object> objects = Arrays.asList(new Object(), new Object());
		utilize(objects);
	}
	
	//? means wildcard
	// ?  means can not write but read
	// ? means ? extends Object
	// hence we can pass List<Object> or List<ChildOject>
	//we can say ? means raw type but with type safety
	private static void utilize(List<?> readOnly) {
		
		//can not write
		//readOnly.add(new Object());
		
		for(Object o : readOnly) {
			System.out.println("utilize: item found "+o);
		}
	}
}
