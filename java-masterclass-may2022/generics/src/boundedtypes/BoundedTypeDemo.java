package boundedtypes;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BoundedTypeDemo<T extends List> {

	public static void main(String[] args) {
		BoundedTypeDemo<List> listBound = new BoundedTypeDemo<>();
		
		BoundedTypeDemo<ArrayList> alistBound = new BoundedTypeDemo<>();
		
		BoundedTypeDemo<LinkedList> lListBound = new BoundedTypeDemo<>();
		
		
		//should extend/implement both
		//wont work as list do not extend Serialzable
		//MultiBoundedTypeDemo<List> l = new MultiBoundedTypeDemo<>();
		
		//it works as arraylist implements both list and serializable
		MultiBoundedTypeDemo<ArrayList> l = new MultiBoundedTypeDemo<>();
		
		
		// ? means wildcard rules will apply
		// ? means wildcard with object type
		//hence this wont work
		List<?> storage = new ArrayList<>();
		
		//wont be able to add anything but can read
		//storage.add("ka");
		
		
	}
}

//this is example of 0 class
//we an have 0-1 classes and 0-n interface
//but if single class exist it has to be first
class MultiBoundedTypeDemo<T extends AbstractList &  List & Serializable>{
	
}
