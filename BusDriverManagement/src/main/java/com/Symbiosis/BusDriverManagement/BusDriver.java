package com.Symbiosis.BusDriverManagement;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class BusDriver {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int BusDriver_id;
	private  String BusDriver_name;
	
	@ManyToMany
	private List<Bus> bus = new ArrayList<Bus>();

	public BusDriver() {
		super();
	}

	public BusDriver(int busDriver_id, String busDriver_name) {
		super();
		BusDriver_id = busDriver_id;
		BusDriver_name = busDriver_name;
	}

	public int getBusDriver_id() {
		return BusDriver_id;
	}

	public void setBusDriver_id(int busDriver_id) {
		BusDriver_id = busDriver_id;
	}

	public String getBusDriver_name() {
		return BusDriver_name;
	}

	public void setBusDriver_name(String busDriver_name) {
		BusDriver_name = busDriver_name;
	}

	public List<Bus> getBus() {
		return bus;
	}

	public void setBus(List<Bus> bus) {
		this.bus = bus;
	}

	@Override
	public String toString() {
		return "BusDriver [BusDriver_id=" + BusDriver_id + ", BusDriver_name=" + BusDriver_name + "]";
	}
}
