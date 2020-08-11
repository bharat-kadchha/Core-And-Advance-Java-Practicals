package com;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


//3 type of discriminator (String -- fullname,,char--frist char ,,int--int no.)



@Entity   
@Table(name="student_p")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //3 type of strategy
@DiscriminatorColumn(name="record_type",discriminatorType = DiscriminatorType.STRING)  
@DiscriminatorValue(value="student")
public class StudentModel {

	@Id    
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "s_name")
	private String name;
	@Column(name="s_city")
	private String city;
	
	private int std;
	
	private int enroll;    

	
	public int getStd() {
		return std;
	}

	
	public void setStd(int std) {
		this.std = std;
	}
	public int getEnroll() {
		return enroll;
	}
	public void setEnroll(int enroll) {
		this.enroll = enroll;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", std=" + std + ", enroll=" + enroll + "]";
	}
	
}
