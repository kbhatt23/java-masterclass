package basics;

public class SuperclassChildClassUSage {
public static void main(String[] args) {
	BasicGeneric<SuperClass> obj1 = new BasicGenericImplementor<SuperClass>(new SuperClass());
	
	BasicGeneric<SuperClass> obj11 = new BasicGenericImplementor<SuperClass>(new ChildClass());
	
	BasicGeneric<ChildClass> childobj1 = new BasicGeneric<ChildClass>(new ChildClass());
	manipulate(obj1);
	manipulate(obj11);
	
	//manipulate(childobj1);
	manipulateComplex(childobj1);
	
	manipulateComplex2(obj1);
	
	manipulateComplex2(childobj1);
}

public static void manipulate(BasicGeneric<SuperClass> obj) {
	obj.setT(new SuperClass());
}
//can pass superclas or its child
//but the methods/variables where type T was given will be read only/ not appoicable for usage
public static void manipulateComplex(BasicGeneric<? extends SuperClass> obj) {
	//modfication not allowed
	//obj.setT(new SuperClass());
	//read only is fine
	//but methods whihc updat the variabke used in typed reference can not be used
	SuperClass t = obj.getT();
	System.out.println(t);
}
//can pass anything of type child class or parent of child
//but modictration methods can be called by passing only child class
public static void manipulateComplex2(BasicGeneric<? super ChildClass> obj) {
	System.out.println("before manipulation manipulation "+obj);
	//obj.setT(new SuperClass());
	obj.setT(new ChildClass());
	System.out.println("after manipulation "+obj);
}

}
