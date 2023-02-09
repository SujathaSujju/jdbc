package com.xworkz.hospital.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hospital")
public class HospitalDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String location;
	private String noOfDoctors;
	private String noOfwards;
	private String specialistIn;
	private String noOfNurses;
	
	
	
	@Override
	public String toString() {
		return "HospitalDto [id=" + id + ", name=" + name + ", location=" + location + ", noOfDoctors=" + noOfDoctors
				+ ", noOfwards=" + noOfwards + ", specialistIn=" + specialistIn + ", noOfNurses=" + noOfNurses + "]";
	}
	public HospitalDto() {
		super();
	}
	public HospitalDto(String name, String location, String noOfDoctors, String noOfwards, String specialistIn,
			String noOfNurses) {
		super();
		this.name = name;
		this.location = location;
		this.noOfDoctors = noOfDoctors;
		this.noOfwards = noOfwards;
		this.specialistIn = specialistIn;
		this.noOfNurses = noOfNurses;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getNoOfDoctors() {
		return noOfDoctors;
	}
	public void setNoOfDoctors(String noOfDoctors) {
		this.noOfDoctors = noOfDoctors;
	}
	public String getNoOfwards() {
		return noOfwards;
	}
	public void setNoOfwards(String noOfwards) {
		this.noOfwards = noOfwards;
	}
	public String getSpecialistIn() {
		return specialistIn;
	}
	public void setSpecialistIn(String specialistIn) {
		this.specialistIn = specialistIn;
	}
	public String getNoOfNurses() {
		return noOfNurses;
	}
	public void setNoOfNurses(String noOfNurses) {
		this.noOfNurses = noOfNurses;
	}
	
	
	
	
	
}
