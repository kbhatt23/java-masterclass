package bean;

public class Address {

	private String address1;
	private String address2;
	private String city;
	private String country;
	public Address(String address1, String address2, String city, String country) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.country = country;
	}
	public Address() {
		super();
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", country=" + country
				+ "]";
	}
	
	
}
