package com.bikkadIT.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {
	@Id
	private int CountryId;
	private String CountryName;
public int getCountryId() {
	return CountryId;
}
public void setCountryId(int countryId) {
	CountryId = countryId;
}
public String getCountryName() {
	return CountryName;
}
public void setCountryName(String countryName) {
	CountryName = countryName;
}
@Override
public String toString() {
	return "Country [CountryId=" + CountryId + ", CountryName=" + CountryName + "]";
}



}
