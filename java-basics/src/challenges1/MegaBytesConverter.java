package challenges1;

public class MegaBytesConverter {

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(1025);
	}

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if (kiloBytes < 0) {
			System.out.println("Invalid Value");
		} else {
			int conversionRate = 1024;
			int megaByte = kiloBytes / conversionRate;
			int remainingKilobyte = kiloBytes % conversionRate;
			System.out.println(kiloBytes + " KB = " + megaByte + " MB and " + remainingKilobyte + " KB");
		}
	}


}
