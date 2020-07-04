package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Table(name = "student_table")
@Data
public class StudentModel {

	@Id
	private int id;

	@Transient
	@Column(name = "s_name")
	private String name;

	@Column(name = "s_city")
	private String city;

}
