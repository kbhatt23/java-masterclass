package anonymousclasses;

import java.io.Serializable;
import java.util.ArrayList;

public class SelfMethodLocalClasses {

	public static void main(String[] args) {
		//same as anonymous class
		// A class scoped uner a method,declared under a method
		// it has a name and hence can have constructors
		//can implement more than one interface with 0-1 classes and 0-n interface
		
		
		//scope is only within this method
		//it can have cosntructor
		// it can implement more than one interface with 0-1 classes and 0-n interface
		class Helper extends ArrayList<Integer> implements Comparable<Integer>, Serializable {
			Integer number;
			
			Helper(int number){
				this.number=number;
			}
			
			@Override
			public int compareTo(Integer o) {
				return this.number.compareTo(o);
			}
			
			//anonymous class can not let extramethod be reused
			public void utility() {
				System.out.println("jai shree sita rama lakshman hanuman");
			}
			
			
		}
		
		Helper helper = new Helper(23);
		System.out.println(helper.compareTo(33));
		helper.utility();
		System.out.println(helper instanceof Helper);
	}
}
