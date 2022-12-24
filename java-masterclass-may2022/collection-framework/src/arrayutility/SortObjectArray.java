package arrayutility;

import java.util.Arrays;
import java.util.Comparator;

public class SortObjectArray {

	public static void main(String[] args) {
		sortNumber();
		
		sortObjects();
		
	}

	private static void sortObjects() {
		NonSortableObject[] items= {
				
				new NonSortableObject("kanishk", 0),
				
				new NonSortableObject("madhav", 2)
				,
				new NonSortableObject("rama", 2)
				,
				new NonSortableObject("hanuman", 2)
		};
		
		
		System.out.println(Arrays.toString(items));
		
		//sorting mandatoes comparable or pass comparator
		//if comparator is passed that is prefered
		//Arrays.sort(items);
		
		Arrays.sort(items,
				Comparator.comparing(NonSortableObject :: getStringField)
				);
		
		
		System.out.println(Arrays.toString(items));
	}

	private static void sortNumber() {
		int[] number = {4,6,2,7,2,26,23,2,2,2,1,1};
		
		System.out.println(Arrays.toString(number));
		
		System.out.println(Arrays.toString(number));
	}
}

