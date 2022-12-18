package reflections;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class SelfReflection {
	public SelfReflection() {
		System.out.println("SelfReflection constructor called");
	}
	public void test() {
		System.out.println("jai shree sita rama lakshman hanuman");
	}
	public static void main(String[] args) {
		Class l = int.class;
		for(Method m : l.getDeclaredMethods()) {
			System.out.println(m);
		}
		Class<Integer> a=  Integer.class;
		Class<Integer> b = Integer.TYPE;
		System.out.println(a == b);
		
		for(Field m : l.getFields()) {
			System.out.println(m);
		}
		try {
		Class<SelfReflection> class1 = SelfReflection.class;
		SelfReflection newInstance = class1.newInstance();
		Method declaredMethod = SelfReflection.class.getDeclaredMethod("test");
		declaredMethod.invoke(newInstance);
		System.out.println( SelfReflection.class ==  SelfReflection.class );
		System.out.println( SelfReflection.class.getClassLoader());
			
		}
		catch (Exception e) {
			System.err.println("error occurred "+e);
		}
	}
	
}
