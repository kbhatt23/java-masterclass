package statements;

public class SwitchStringIgnoreCase {
	public static void main(String[] args) {

		String str = "RAghAv";

		//switch (str.toLowerCase()) {
		switch (str.toLowerCase()) {
		//force here to keep aall characthers in lower case only
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
