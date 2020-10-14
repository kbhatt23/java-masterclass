package basics;

public class AbstractClassLambda {
	public static void main(String[] args) {
		AbstractSingleMethod abObj = new AbstractSingleMethod() {

			@Override
			public void method() {
				System.out.println("jai shree ram from abstract method");
			}
		};
		abObj.method();
		//lambdas do not apply for abstract class with single abstract method, 
		//abObj = () -> System.out.println("jai shree ram from abstract method");

	}
}
