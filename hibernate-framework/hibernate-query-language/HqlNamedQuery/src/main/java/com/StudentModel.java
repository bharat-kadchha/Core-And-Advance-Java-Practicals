package com;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "student_name")
@Data
@NamedQueries(value = { @NamedQuery(name = "getStudentById", query = "from Student s where s.id=?1"),
		@NamedQuery(name = "getStudentByName", query = "from Student s where s.name=?1") })
public class StudentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "s_name")
	private String name;
	@Column(name = "s_city")
	private String city;

	private int std;

	private int enroll;

	@OneToOne(cascade = CascadeType.ALL)
	private BooksModel book;

}
