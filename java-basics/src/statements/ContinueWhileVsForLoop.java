package statements;

public class ContinueWhileVsForLoop {
public static void main(String[] args) {
	//while loop continue vs for loop continue
	int count = 1;
	for(; count != 5 ; count++) {
		if(EvenNumberChallenge.isEven(count)) {
			continue;
		}
		System.out.println("number obtained "+count);
		count++;
	}
	
	
	System.out.println("================");
	 count = 1;
	while(count != 5) {
		if(EvenNumberChallenge.isEven(count)) {
			//need to do manually so taht it beocme sfor loop equivalent
			//count++;
			continue;
		}
		System.out.println("number obtained "+count);
		count++;
	}
}
}
