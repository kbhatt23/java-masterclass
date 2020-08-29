package inheritance.challenge;

public class Circle {
	private double radius;

	public Circle(double radius) {
		if (radius < 0)
			radius = 0;
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public double getArea() {
		return Math.PI * (Math.pow(this.radius, 2));
	}
}

class Cylinder extends Circle {
	private double height;

	public Cylinder(double radius, double height) {
		super(radius);
		if (height < 0)
			height = 0;
		this.height = height;
	}

	public double getHeight() {
		return this.height;
	}

	public double getVolume() {
		//instead of calling super , in this case in frute we might override area method so use this .areaMEthod
		return this.getArea()*this.height;
	}

}
