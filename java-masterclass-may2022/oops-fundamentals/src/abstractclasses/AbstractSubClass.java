package abstractclasses;

//non abstract subclass has to override the abstract methods of parent
//only if those are implemented earlier need not to implement again
public abstract class AbstractSubClass extends AbstractSuperClass{

	//here subclasses will be generic for print method
	//hence override it
	@Override
	void print() {
		sayJaiShreeRam();
		System.out.println("AbstractSubclass says namo lekshmi narayan");
	}
	
	//add more feature
	abstract void features();
}
