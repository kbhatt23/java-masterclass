package basics;

import java.util.ArrayList;
import java.util.List;

public class BadArrayInheritance {
public static void main(String[] args) {
	Parent[] array = new Parent[2];
	array[0] = new Parent();
	array[1] = new Child();
	for(int i=0 ; i < array.length ; i++) {
		System.out.println("array item at index "+ i+" equals "+array[i]);
	}
	
	//compiler unabel to help
	//arraylist to the rescue
	array = new Child[2];
	//array[0] = new Parent();
	array[1] = new Child();
	for(int i=0 ; i < array.length ; i++) {
		System.out.println("array item at index "+ i+" equals "+array[i]);
	}
	
	//Arrylist to the resuce
	//genericsdo not allow subchild of type
	List<Parent> arrayList = new ArrayList<>();
	arrayList.add(new Parent());
	arrayList.add(new Child());
	for(int i=0 ; i < arrayList.size() ; i++) {
		System.out.println("arraylist item at index "+ i+" equals "+arrayList.get(i));
	}
}
}
