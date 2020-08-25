package statements;

public class DoWhileBasic {

	public static void main(String[] args) throws InterruptedException {
		int count= 0;
		//while counterpart
		while(count != 0 ) {
			System.out.println("jai shree ram with count "+count);
			count++;
		}
		
		count= 0;
		do {
			System.out.println("jai shree ram with count "+count);
			count++;
			Thread.sleep(500);
		} while (count != 5);
	}

}
