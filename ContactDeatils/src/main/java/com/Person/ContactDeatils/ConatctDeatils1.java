package com.Person.ContactDeatils;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ConatctDeatils1 {

	@Id
	private int ConatctId;
	
	private int ContactNum;
	
	@ManyToOne
	@JoinColumn(name="personId")
	private Person2 person;

	

	public Person2 getPerson() {
		return person;
	}

	public void setPerson(Person2 person) {
		this.person = person;
	}

	public ConatctDeatils1(int conatctId, int contactNum) {
		super();
		ConatctId = conatctId;
		ContactNum = contactNum;
	}

	public ConatctDeatils1() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public int getConatctId() {
		return ConatctId;
	}

	public void setConatctId(int conatctId) {
		ConatctId = conatctId;
	}

	public int getContactNum() {
		return ContactNum;
	}

	public void setContactNum(int contactNum) {
		ContactNum = contactNum;
	}
	
	@Override
	public String toString() {
		return "ConatctDeatils1 [ConatctId=" + ConatctId + ", ContactNum=" + ContactNum + "]";
	}


	
}
