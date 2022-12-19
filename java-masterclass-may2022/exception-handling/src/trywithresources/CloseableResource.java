package trywithresources;

import java.io.Closeable;

public class CloseableResource implements Closeable{

	@Override
	public void close() {
		System.out.println("close method started");
		boolean failed = true;
		if(failed)
			throw new IllegalStateException();

		System.out.println("close method ended");
	}

}
