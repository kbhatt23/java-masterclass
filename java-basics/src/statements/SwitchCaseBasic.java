package statements;

public class SwitchCaseBasic {
	public static void main(String[] args) {
		int number = 11;

		switch (number) {
		case 1:
			System.out.println("jai shree ram 1 " + number);
			break;
		case 2:
			System.out.println("jai shree ram 2 " + number);
			//break;
		default:
			System.out.println("jai shree ram default " + number);
		//	break;
		case 3:
			System.out.println("jai shree ram 3 " + number);
			break;
		case 4:
			System.out.println("jai shree ram 4 " + number);
			break;
		case 10: case 11:
			System.out.println("lucky numbers");
			break;
		}
		
	}
}
