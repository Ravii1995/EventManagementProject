package com.collabera.eventmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Person")
public class Person {
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	@Override
	public String toString() {
		return "Person [persoinId=" + persoinId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ "]";
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	 
	@Column(name = "Person_Id")
	 private Integer persoinId;
	
	@Column(name = "First_Name")
	 private String firstName;
	
	@Column(name = "Last_Name")
	 private String lastName;
	
	public Integer getPersoinId() {
		return persoinId;
	}
	public void setPersoinId(Integer persoinId) {
		this.persoinId = persoinId;
	}
	@Column(name = "Age")
	 private Integer age;
	 
	 
	 
	 

}
