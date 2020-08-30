package wrapperclasses;

import java.util.ArrayList;
import java.util.List;

public class BasicUsage {
public static void main(String[] args) {
	//not possible
	//List<int> primitiveIntList = new ArrayList<int>();

	List<IntWrapper> primitiveIntList = new ArrayList<IntWrapper>();
	for(int i =10 ; i<= 20 ; i++) {
		primitiveIntList.add(new IntWrapper(i));
	}
	for(int i=0; i < primitiveIntList.size(); i++) {
		//System.out.println(primitiveIntList.get(i).getValue());
	}
		//why shud a dev bother , lets jdk do the job for us

	//boxing
	Integer a = Integer.valueOf(189);
	//unboxing
	int aint = a.intValue();
	System.out.println(aint);
	//incmrementing
	//wrapper classes ar eimmutbale
	//every cahnge creates new object
	aint += 20;
	a = Integer.valueOf(aint);
	System.out.println(a.intValue());
	
}
}

class IntWrapper{
	private int value;

	
	public IntWrapper(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
