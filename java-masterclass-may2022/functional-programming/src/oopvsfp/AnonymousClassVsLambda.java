package oopvsfp;

//demo points
//a. an classes can represent class or iterface with multiple methods, lambda is only for functional interface
//not even abstract class with single method can be assigned for lambdas

public class AnonymousClassVsLambda {

	public static void main(String[] args) {
		new AnonymousClassVsLambda().difference1();
		new AnonymousClassVsLambda().difference2();
	}

	private void difference2() {
		// this for lambda means main class
		// this for anonymous class means anonymous class

		SingleMethodAbstractInterface anic = new SingleMethodAbstractInterface() {
			@Override
			public void implement() {
				
				System.out.println("start");
				this.implement(); // this here means specific independent class henc causes infinite recursion
			}
		};

		//anic.implement();
		System.out.println("-=-=-=-=-=-=-=-=");
		SingleMethodAbstractInterface lambda = () -> {
			System.out.println("lambda start");
			
			//this will mean instance and hence will be outer class isntance
			this.implement();
		};
		lambda.implement();
	}

	public void implement() {
		System.out.println("Main class testing");
	}

	private void difference1() {
		// lambda can not represent class
		// FeatureClass obj1 = () -> System.out.println("feature1 implementation using
		// lambda");
		FeatureClass obj1 = new FeatureClass() {
			public void feature1() {
				System.out.println("feature1 implementation using anic");
			}

			public void feature2() {
				System.out.println("feature2 implementation using anic");
			}

			public void implement() {
				System.out.println("implement using anic");
				this.feature1();
			}
		};

		obj1.feature1();
		obj1.feature2();
		obj1.implement();

		// wont work
		// SingleMethodAbstractClass k = () -> System.out.println("implementation using
		// lambda");

		// it works
		SingleMethodAbstractInterface k1 = () -> System.out.println("implementation using lambda");
		k1.implement();
	}

}

abstract class FeatureClass {

	public void feature1() {
		System.out.println("feature1 implementation");
	}

	public void feature2() {
		System.out.println("feature2 implementation");
	}

	public abstract void implement();
}

abstract class SingleMethodAbstractClass {
	public abstract void implement();
}

interface SingleMethodAbstractInterface {
	public abstract void implement();
}
