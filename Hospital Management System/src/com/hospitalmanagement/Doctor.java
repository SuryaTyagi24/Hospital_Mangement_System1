package com.hospitalmanagement;

public class Doctor {
	private static int idCounter = 1;
	private int id;
	private String name;
	private String speciality;
	
	public Doctor(String name, String specialty) {
		this.id = idCounter++;
		this.name = name;
		this.speciality = specialty;
	}
	
	public int getId(){
		return id;
	}
	
	@Override
	public String toString() {
		return "Doctor ID: " + id + ", Name:" + name + ", Speciality: "+ speciality;			
	}

}
