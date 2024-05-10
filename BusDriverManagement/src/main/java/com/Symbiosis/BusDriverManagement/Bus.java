package com.Symbiosis.BusDriverManagement;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Bus_id;
	private String Bus_name;
	
	@ManyToMany(mappedBy = "bus" , fetch= FetchType.EAGER)
	private List<BusDriver> busDriver = new ArrayList<BusDriver>();

	public Bus() {
		super();
	}

	public Bus(int bus_id, String bus_name) {
		super();
		Bus_id = bus_id;
		Bus_name = bus_name;
	}

	public int getBus_id() {
		return Bus_id;
	}

	public void setBus_id(int bus_id) {
		Bus_id = bus_id;
	}

	public String getBus_name() {
		return Bus_name;
	}

	public void setBus_name(String bus_name) {
		Bus_name = bus_name;
	}

	public List<BusDriver> getBusDriver() {
		return busDriver;
	}

	public void setBusDriver(List<BusDriver> busDriver) {
		this.busDriver = busDriver;
	}

	@Override
	public String toString() {
		return "Bus [Bus_id=" + Bus_id + ", Bus_name=" + Bus_name + "]";
	}
}
