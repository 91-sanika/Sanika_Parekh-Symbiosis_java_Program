package com.Person.AdharDeatils;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person1 {

	@Id
	private int PersonId;
	
	private String PersonName;
	
	private String PersonCity;
	
	public Person1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person1(int personId, String personName, String personCity, AdharDeatils1 adhar) {
		super();
		PersonId = personId;
		PersonName = personName;
		PersonCity = personCity;
	//	this.adhar = adhar;
	}

	public int getPersonId() {
		return PersonId;
	}

	public void setPersonId(int personId) {
		PersonId = personId;
	}

	public String getPersonName() {
		return PersonName;
	}

	public void setPersonName(String personName) {
		PersonName = personName;
	}

	public String getPersonCity() {
		return PersonCity;
	}

	public void setPersonCity(String personCity) {
		PersonCity = personCity;
	}

	
	@OneToOne(mappedBy ="person1")
	private AdharDeatils1 adhar;

	public AdharDeatils1 getAdhar() {
		return adhar;
	}

	public void setAdhar(AdharDeatils1 adhar) {
		this.adhar = adhar;
	}

	@Override
	public String toString() {
		return "Person1 [PersonId=" + PersonId + ", PersonName=" + PersonName + ", PersonCity=" + PersonCity
				+ ", adhar=" + adhar + "]";
	}

	
}
