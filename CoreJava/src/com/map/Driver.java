package com.map;

public class Driver {
private String driverId;
private String firstName;
private String lastName;
private int age;


public Driver(String driverId, String firstName, String lastName, int age) {
	
	this.driverId = driverId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
}
public String getDriverId() {
	return driverId;
}
public void setDriverId(String driverId) {
	this.driverId = driverId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Driver [driverId=" + driverId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
			+ "]";
}



}
