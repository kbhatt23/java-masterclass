package arrayutility;

import java.util.Arrays;

public class ArraysCopy {
	public static void main(String[] args) {
		int[] numbers = {1,2,55,7,8};
		
		//size will be 10
		//first 5 indices are copied and remaining 5 will be default meanign 0
		int[] copy = Arrays.copyOf(numbers, 10);
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(copy));
		
		String[] names= {"sita rama", "radhe shyam"};
		String[] namesCopy = Arrays.copyOf(names, 4);
		
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(namesCopy));
		
		arraysCopyObjects();
	}
	//default copy is shallow
	//so for mutable object we can do deep copy using different method
	private static void arraysCopyObjects() {
NonSortableObject nonSortableObject = new NonSortableObject("kanishk", 0);
NonSortableObject[] items= {
				
				nonSortableObject,
				
				new NonSortableObject("madhav", 2)
				,
				new NonSortableObject("rama", 2)
				,
				new NonSortableObject("hanuman", 2)
		};

	NonSortableObject[] copyOf = Arrays.copyOf(items, 5);
	
	nonSortableObject.setIntField(-1);
	
	System.out.println(Arrays.toString(copyOf));
	
	System.out.println(Arrays.toString(items));
	
	}
}
