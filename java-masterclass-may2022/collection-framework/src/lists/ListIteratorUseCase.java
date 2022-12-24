package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorUseCase {

	public static void main(String[] args) {
	List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
		//numbers.add(6);
		numbers.add(0);
		numbers.add(7);
		numbers.add(9);
		
		//double all index until first 9 is reached but in reverse order
		//12 4 6 2

		List<Integer>  result= strategyOne(numbers);
		
		System.out.println(result);
		
		List<Integer> strategyTwo = strategyTwo(numbers);
		System.out.println(strategyTwo);
		
	}

	private static List<Integer> strategyOne(List<Integer> numbers) {
		
		//loop , double and break once 0 is recieved
		//then reverse
		List<Integer> doubleList = new ArrayList<>(numbers.size());
		
		for(int n : numbers) {
			if(n == 0)
				break;
			doubleList.add(n * 2);
		}
		int sizeHalf = doubleList.size()/2;
		for(int i = 0, j = doubleList.size()-1 ; i < sizeHalf ; i++,j-- ) {
			int temp = doubleList.get(i);
			doubleList.set(i, doubleList.get(j));
			doubleList.set(j, temp);
		}
		return doubleList;
	}
	
	private static List<Integer> strategyTwo(List<Integer> numbers) {
		
		//loop , double and break once 0 is recieved
		//then reverse
		List<Integer> doubleList = new ArrayList<>(numbers.size());
		
		ListIterator<Integer> listIterator = numbers.listIterator();
		
		while(listIterator.hasNext()) {
			int next = listIterator.next();
			if(next == 0) {
				listIterator.previous();
				while(listIterator.hasPrevious()) {
					doubleList.add(listIterator.previous() * 2);
				}
				break;
			}
			
		}
		
		return doubleList;
	}
}
