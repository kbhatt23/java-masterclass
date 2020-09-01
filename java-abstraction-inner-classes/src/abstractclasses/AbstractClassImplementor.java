package abstractclasses;

public class AbstractClassImplementor extends AbstractClassSample{
	
	public AbstractClassImplementor(String userName) {
		super(userName);
	}

	@Override
	public void fakeMethod() {
		System.out.println("jai shree ram form child fakemethod");
	}

	public static void main(String[] args) {
		AbstractClassSample child  = new AbstractClassImplementor("kannu");
		child.fakeMethod();
		child.nonAbstract();
	}
	@Override
	protected void defaultMethodtype() {
		System.out.println("jai shree ram from default method type");
	}
	
}
