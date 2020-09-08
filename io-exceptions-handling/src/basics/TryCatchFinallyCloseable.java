package basics;

import java.util.Arrays;

public class TryCatchFinallyCloseable {

	public static void main(String[] args) {
		try (AutocloseableCustom ka = new AutocloseableCustom()) {
			System.out.println("line 1");
			System.out.println("line 2");
			System.out.println("line 3");
			boolean ta = true;
			if (ta) {
				throw new Exception();
			}
			System.out.println("line 4");
			//heirachchical classes/excpetions can not be kept in multi catch block
		} catch (CheckedException | AnotherCheckedException /* | ChilldAnotherCheckedException */ e ) {
			System.out.println("jai shree ram in child exception ");
			System.out.println("error type "+e);
		}
		catch (Exception e) {
			System.out.println("jai shree ram in main exception ");
			System.out.println("error type "+e);
			System.out.println("child excpetion cause "+e.getSuppressed());
		}

		finally {
			//no need to cose custom resource
			System.out.println("jai shree in finally block");
		}
	}

}

class AutocloseableCustom implements AutoCloseable {

	@Override
	public void close() throws Exception {
		boolean la = true;
		if(la)
			throw new CheckedException();
		System.out.println("Closing the custom resource");
	}

}
