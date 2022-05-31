package abstractclasses;

// if a class is abstract that do not have one abstract method it could be 0 to n
//but if even one method is abstract class has to be abstract
//we can not instantiate abstract class directly
public abstract class AbstractSuperClass {

	// abstract method forces children to provide implementation
	// abstract method means implementation is not known and hence can be like ();
	// abstract method forces class to be abstract
	abstract void print();

	// normal method
	// for this we know implementation and can be kept at super class to be used by
	// all child class
	void sayJaiShreeRam() {
		System.out.println("jai shree ram");
	}
	
	//can not instantiate abstract class directly
	//AbstractSuperClass o = new AbstractSuperClass();

}
