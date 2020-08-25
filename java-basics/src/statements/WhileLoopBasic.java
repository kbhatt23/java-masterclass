package statements;

public class WhileLoopBasic {
public static void main(String[] args) {
	System.out.println("=======================");
	for(int i =0 ; i < 7 ; i++) {
		System.out.println("jai shree ram says number "+i);
	}
	System.out.println("============================");
	int num = 0;
	while(num < 7 ) {
		System.out.println("jai shree ram says number "+num);
		num++;
	}
	System.out.println("==============================");
	num=0;
	while(true) {
		if(num == 7) {
			break;
		}
		System.out.println("jai shree ram says number "+num);
		num++;
	}
}

}

