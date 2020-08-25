package challenges1;

public class SpeedConverter {

	public static void main(String[] args) {
		printConversion(23);
	}

	public static long toMilesPerHour(double kilometersPerHour) {
		if(kilometersPerHour < 0.0d) {
			return -1;
		}
		return Math.round(0.621371*kilometersPerHour);
		
	}

	public static void printConversion(double kilometersPerHour) {
		if(kilometersPerHour < 0.0d) {
			System.out.println("Invalid Value");
		}else {
			
			System.out.println(kilometersPerHour + " km/h = " + 
					toMilesPerHour(kilometersPerHour)+" mi/h"
					);
			
		}
	}

}
