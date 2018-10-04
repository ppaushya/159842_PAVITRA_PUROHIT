package org.cap.demo;

public class Address {

	private String stName;
	private String address;
	private String city;
	private String state;
	public Address() {
		super();
	}
	public Address(String stName, String address, String city, String state) {
		super();
		this.stName = stName;
		this.address = address;
		this.city = city;
		this.state = state;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [stName=" + stName + ", address=" + address + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
}
