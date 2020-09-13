package utils;

public class ThreadUtils {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

	public static void sleep(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			System.err.println("interrupted exception occurred while sleeping "+e);
		}
	}
	
	public static void join(long ms, Thread t) {
		try {
			t.join(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void join( Thread t) {
		try {
			t.join();
		} catch (InterruptedException e) {
			System.err.println("interrupted exception occurred while joining "+e);
		}
	}
}
