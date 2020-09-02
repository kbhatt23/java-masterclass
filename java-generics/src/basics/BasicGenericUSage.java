package basics;

public class BasicGenericUSage {
public static void main(String[] args) {
	//raw type can still be used -> Type T becomes object
	BasicGeneric objRaw = new BasicGeneric("jai shree ram");
	Object t = objRaw.getT();
	System.out.println(t + " "+t.getClass() );
	
	objRaw.setT(23);
	 t = objRaw.getT();
	System.out.println(t + " "+ t.getClass());
	
	BasicGeneric<String> obTyped = objRaw;
	//class cast exception
	//String tnew = obTyped.getT();
	//System.out.println(tnew);
	
	System.out.println("seond problem start==============");
	//second problem
	BasicGeneric<String> stringObj = new BasicGeneric<String>("jai radha madhav");
	System.out.println(stringObj.getT());
	objRaw = stringObj;
	objRaw.setT(37);
	
	stringObj = objRaw;
	//System.out.println(stringObj.getT());
	
	BasicGeneric<SuperClass> obj = new BasicGeneric<SuperClass>(new SuperClass());
	
	BasicGeneric<SuperClass> objchild = new BasicGeneric<SuperClass>(new ChildClass());
	
	BasicGeneric<SuperClass> objvariation = new BasicGenericImplementor<SuperClass>(new SuperClass());
	
	//extends features
	BasicGeneric<? extends SuperClass> objVarion2 = new BasicGeneric<ChildClass>(new ChildClass());
	//not allpowed just like list.add wot have been allowed
	//objVarion2.setT(new SuperClass());
	
	BasicGeneric<? super ChildClass> childVariation  =new BasicGeneric<SuperClass>(new SuperClass());
	//can only set/mody currnet child only
	childVariation.setT(new ChildClass());
	//only can set class
	//childVariation.setT(new SuperClass());
	
	BasicGeneric<? super ChildClass> childVariation1  =new BasicGeneric<ChildClass>(new ChildClass());
	
}
}
