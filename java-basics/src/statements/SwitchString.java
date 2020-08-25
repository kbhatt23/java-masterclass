package statements;

public class SwitchString {
public static void main(String[] args) {
	String str ="raghav";
	
	switch (str) {
	case "krishna":
		System.out.println("jai shree krishna");
		break;
	case "radha":
		System.out.println("jai shree radhe");
		break;
	case "madhav":
		System.out.println("jai radha madhav");
		break;
	case "raghav":
		System.out.println("jai sita raghav");
		break;

	default:
		System.out.println("no condition met but still saying jai lakshmi narayan");
		break;
	}
}
}
