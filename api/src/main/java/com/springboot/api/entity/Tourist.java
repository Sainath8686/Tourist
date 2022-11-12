package com.springboot.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Tourist")


public class Tourist {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id")
	private int id;
	 @Column(name = "fname")
	private String fname;
	 @Column(name = "lname")
	 private String lname;
	 @Column(name ="gender")
	private String gender;
	 @Column(name ="age")
	private int age;
	 @Column(name = "fromplace")
	private String fromplace;
	 @Column(name = "numberofdaysvisits")
	private int numberofdaysvisits;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFromplace() {
		return fromplace;
	}
	public void setFromplace(String fromplace) {
		this.fromplace = fromplace;
	}
	public int getNumberofdaysvisits() {
		return numberofdaysvisits;
	}
	public void setNumberofdaysvisits(int numberofdaysvisits) {
		this.numberofdaysvisits = numberofdaysvisits;
	}
	@Override
	public String toString() {
		return "Tourist [id=" + id + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", age=" + age
				+ ", fromplace=" + fromplace + ", numberofdaysvisits=" + numberofdaysvisits + "]";
	}
	public Tourist(int id, String fname, String lname, String gender, int age, String fromplace,
			int numberofdaysvisits) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.age = age;
		this.fromplace = fromplace;
		this.numberofdaysvisits = numberofdaysvisits;
	}
	 
	 
	 public Tourist() {
		 
	 }


}
