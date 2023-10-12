package com.nagaraj.springbootcurdapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Studnet {

	private String name;
	private String city;
	private String street;
	private String dob;
	private String gender;
	
	
	@Id // to generate the id's automatically 
	
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	
	 
	
	private Long id;


	/**
	 * @param name
	 * @param city
	 * @param street
	 * @param dob
	 * @param gender
	 * @param id
	 */
	public Studnet(String name, String city, String street, String dob, String gender, Long id) {
		super();
		this.name = name;
		this.city = city;
		this.street = street;
		this.dob = dob;
		this.gender = gender;
		this.id = id;
	}
	
	
	public void Student()
	{
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
