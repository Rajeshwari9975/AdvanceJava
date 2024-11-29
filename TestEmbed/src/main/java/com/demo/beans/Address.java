package com.demo.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private int pinCode;
	private String city;
	private String country;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int pinCode, String city, String country) {
		super();
		this.pinCode = pinCode;
		this.city = city;
		this.country = country;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
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
		return "Address [pinCode=" + pinCode + ", city=" + city + ", country=" + country + "]";
	}

	
	
}
