package inheritance.challenge;

public class Car extends Vehicle{
	private String stearingType;
	public Car(int wheels, String brand, Double price) {
		super(wheels, brand, price);
	}
	
	public Car(int wheels, String brand, Double price, String stearingType) {
		super(wheels, brand, price);
		this.stearingType = stearingType;
	}

	public String getStearingType() {
		return stearingType;
	}

	public void setStearingType(String stearingType) {
		this.stearingType = stearingType;
	}
	
	@Override
	public void honk() {
		System.out.println("Car honking using stearing Tube");
	}
	@Override
	public void turningLeft() {
		System.out.println("Car turning left using stearing type "+stearingType);
	}

	public void customMethod() {
		System.out.println("running general functionlality");
	}
	
}
