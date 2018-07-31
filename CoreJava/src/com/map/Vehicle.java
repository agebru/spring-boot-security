package com.map;

public class Vehicle {
	private String plateNo;
	private String Model;
	
	

	public Vehicle(String plateNo, String model) {
		
		this.plateNo = plateNo;
		Model = model;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	@Override
	public String toString() {
		return "Vehicle [plateNo=" + plateNo + ", Model=" + Model + "]";
	}
	
	

}
