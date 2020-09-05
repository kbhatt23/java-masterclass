package learning.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetFromCollections {
public static void main(String[] args) {
	//name list, can have duplicate
	List<String> namesList = Arrays.asList("messi","xavi", "messi","xavi", "iniesta");
	//can add any collections in constructor
	
	
	Set<String> names= new HashSet<String>(namesList);
	names.add("pedro");
	names.add("messi");
	namesList.forEach(System.out::println);
	System.out.println("=====================");
	names.forEach(System.out::println);
	System.out.println("====================");
	
	Set<String> newGeneratoionName = new HashSet<String>();
	newGeneratoionName.add("pedri");
	newGeneratoionName.add("puig");
	newGeneratoionName.add("fati");
	
	names.addAll(newGeneratoionName);
	names.forEach(System.out::println);
	
	Car nullcar = null;
	SuzukiCar nullcarSku = (SuzukiCar) nullcar;
	System.out.println(nullcarSku);
	//System.out.println(nullcarSku.getClass());
	
}
}
