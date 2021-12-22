package oneToOne.example1;


public class Address {
	private int AddressId;
	private String AddressLine, city, State, country;
	private int Pincode;
	private Employee employee;
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public int getAddressId() {
		return AddressId;
	}
	public void setAddressId(int addressId) {
		AddressId = addressId;
	}
	public String getAddressLine() {
		return AddressLine;
	}
	public void setAddressLine(String addressLine) {
		AddressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	
}
