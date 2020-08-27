package inheritance.challenge;

public class Vehicle {

	private int wheels;
	private String brand;
	private Double price;
	public Vehicle(int wheels, String brand, Double price) {
		this.wheels = wheels;
		this.brand = brand;
		this.price = price;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	public void honk() {
		System.out.println("Vehicle honking");
	}
	
	public void moving() {
		System.out.println("Vehicle moving");
	}
	
	public void turningLeft() {
		System.out.println("Vehicle turning left");
	}
	
}
