package common;

public class BasicFather {

	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called by sita ram");
	}
}
