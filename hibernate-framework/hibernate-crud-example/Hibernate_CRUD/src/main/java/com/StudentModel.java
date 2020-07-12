package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student_table")
@Data
@NoArgsConstructor
public class StudentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = true, insertable = true, unique = true, nullable = false)
	private int id;

	private String name;

	private String city;

}
