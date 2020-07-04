package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity // it is for say to hibernate to store this table to DB
@Table(name = "student_table")
@Data
public class StudentModel {

	@Id // (every table has primary key) //otherwise ERROR- No identifier specified for entity
	private int id;

	@Column(name = "s_name")
	private String name;
	@Column(name = "s_city")
	private String city;

}
