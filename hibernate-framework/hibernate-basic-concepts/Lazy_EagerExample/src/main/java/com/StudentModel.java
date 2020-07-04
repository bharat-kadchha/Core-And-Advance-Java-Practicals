package com;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;

@Entity
@Table(name = "student_name")
@DynamicUpdate
@Data
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

	// get all information related to object.
	// does not change default behavior LAZY to EAGAR --it is hard coding
	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(name = "book_name", joinColumns = @JoinColumn(name = "id"))
	private Set<BooksModel> collection = new HashSet<BooksModel>();

}
