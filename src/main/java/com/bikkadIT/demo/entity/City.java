package com.bikkadIT.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CITY_MASTER")
public class City {
	@Id
	private int CityId;
	private String CityName;
	@Override
	public String toString() {
		return "City [CityId=" + CityId + ", CityName=" + CityName + "]";
	}
	public int getCityId() {
		return CityId;
	}
	public void setCityId(int cityId) {
		CityId = cityId;
	}
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	

}
