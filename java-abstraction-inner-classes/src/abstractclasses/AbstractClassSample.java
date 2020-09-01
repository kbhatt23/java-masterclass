package abstractclasses;

public abstract class AbstractClassSample {
	private String userName;
	public AbstractClassSample(String userName) {
		this.userName = userName;
	}

	public abstract void fakeMethod();
	
	public void nonAbstract() {
		System.out.println("jai shree ram from "+userName);
	}
	protected abstract void defaultMethodtype() ;
}
