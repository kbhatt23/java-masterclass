package overloading;

public class AreaCalculator {
	public static void main(String[] args) {
		System.out.println("ara of rectangle "+area(3, 5));
		System.out.println("ara of circle "+area(3));
	}
	
	public static double area(double radius) {
		if(radius < 0) {
			return -1;
		}
		return Math.PI*Math.pow(radius, 2);
	}
	
	public static double area(double length, double width) {
		if(length < 0 || width < 0 ) {
			return -1;
		}
		return length*width;
	}
}
