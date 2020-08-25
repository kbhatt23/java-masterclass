package statements;

public class ForLoopUsage {
	private static int count=0;
	public static void main(String[] args) throws InterruptedException {
		{
			System.out.println("jai shree ganesh");
		}
		// never ending loop
		for (initializeLoop();checkCondition();incrmenetLoop()) {
			System.out.println("jai shree ram with count "+count);
			if(count ==  2) {
				break;
				//continue; -> in case of continue the increment loop will not get called
			}
			Thread.sleep(500);
		}
		System.out.println("final count "+count);
	}

	private static void initializeLoop() {
		System.out.println("initializing loop");
	}

	private static boolean checkCondition() {
		System.out.println("checking condition for loop");
		return true;
	}

	private static void incrmenetLoop() {
		System.out.println("Incrmeenting method for loop");
		count++;
	}
}
