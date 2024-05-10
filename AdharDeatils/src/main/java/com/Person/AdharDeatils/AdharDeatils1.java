package com.Person.AdharDeatils;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class AdharDeatils1 {

	@Id
	private int AdharId;
	
	private int AdharNum;
	
	@OneToOne
	@JoinColumn(name="PersonId")
	private Person1 person1;

	public Person1 getPerson1() {
		return person1;
	}

	public void setPerson1(Person1 person1) {
		this.person1 = person1;
	}

	public AdharDeatils1() {
		super();
	}

	public AdharDeatils1(int adharId, int adharNum) {
		super();
		AdharId = adharId;
		AdharNum = adharNum;
	}

	public int getAdharId() {
		return AdharId;
	}

	public void setAdharId(int adharId) {
		AdharId = adharId;
	}

	public int getAdharNum() {
		return AdharNum;
	}

	public void setAdharNum(int adharNum) {
		AdharNum = adharNum;
	}

	@Override
	public String toString() {
		return "AdharDeatils1 [AdharId=" + AdharId + ", AdharNum=" + AdharNum + "]";
	}
}
