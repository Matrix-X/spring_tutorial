package com.app.technoguru.springboot.controller;

public class Country {
	public String countryId;
	public String countryName;
	public String countryDescription;
	
	
	
	
	public Country(String countryId, String countryName, String countryDescription) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.countryDescription = countryDescription;
	}
	
	
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryDescription() {
		return countryDescription;
	}
	public void setCountryDescription(String countryDescription) {
		this.countryDescription = countryDescription;
	}
	
	
	
	
}
