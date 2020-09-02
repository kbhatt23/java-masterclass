package basics;

import java.util.ArrayList;
import java.util.List;

public class ArrayListComplexity {
public static void main(String[] args) {
	List<SuperClass> obj = new ArrayList<SuperClass>();
	obj.add(new SuperClass());
	obj.add(new ChildClass());
	
	obj.forEach(System.out::println);
	//not possible
	//List<SuperClass> obj11 = new ArrayList<ChildClass>();
	
	List<ChildClass> objchild = new ArrayList<ChildClass>();
	objchild.add(new ChildClass());
	//not possible
	//objchild.add(new SuperClass());
	objchild.forEach(System.out::println);
	System.out.println("manioulations starts");
	manipulate(obj);
	manipulate(objchild);
	
	manipulate1(objchild);
	manipulate1(obj);
}
//can take type of superclas or its child/

//but all the method whihc uses variable metnioned in class with type T will be read only
//get will feasible but not set
public static void manipulate(List<? extends SuperClass> obj) {
	//modification methods clocked
	//obj.add(new ChildClass());
	//obj.add(new SuperClass());
	System.out.println("manipulator "+obj.get(0));
}

public static void manipulate1(List<? super ChildClass> obj) {
	//it can take type childclass or its super
	//however modification method can tak only child class as input
	//obj.add(new SuperClass());
	System.out.println("manipulate1 starts");
	obj.add(new ChildClass());
	obj.forEach(System.out::println);
}
}
