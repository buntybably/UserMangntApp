package com.bikkadIT.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GENDER_MASTER")
public class Gender {
	@Id
	private int GenderId;
	private String GenderName;
	@Override
	public String toString() {
		return "Gender [GenderId=" + GenderId + ", GenderName=" + GenderName + "]";
	}
	public int getGenderId() {
		return GenderId;
	}
	public void setGenderId(int genderId) {
		GenderId = genderId;
	}
	public String getGenderName() {
		return GenderName;
	}
	public void setGenderName(String genderName) {
		GenderName = genderName;
	}

}
