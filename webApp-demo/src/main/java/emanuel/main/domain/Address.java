package emanuel.main.domain;

public class Address {
	private int zipCode;
	private String street;
	private String city;
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [zipCode=" + zipCode + ", street=" + street + ", city=" + city + "]";
	}

	
}
