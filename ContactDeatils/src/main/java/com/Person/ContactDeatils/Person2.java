package com.Person.ContactDeatils;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Person2 {

	@Id
	private int PersonId;
	
	private String PersonName;

	@OneToMany(mappedBy = "person")
	private List <ConatctDeatils1>co = new ArrayList<ConatctDeatils1>();
	
	public List<ConatctDeatils1> getCo() {
		return co;
	}

	public void setCo(List<ConatctDeatils1> co) {
		this.co = co;
	}

	public Person2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person2(int personId, String personName) {
		super();
		PersonId = personId;
		PersonName = personName;
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

	@Override
	public String toString() {
		return "Person1 [PersonId=" + PersonId + ", PersonName=" + PersonName + "]";
	}
}
