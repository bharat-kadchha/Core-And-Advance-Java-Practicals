package com;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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

	// 1 -- persist--parent save then child save automatically by the help of reference.
	// 2 -- remove--when we perform delete for parent then child also deleted,
	// 3 -- All--it is follow all cascade rule.

	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "book_id")
	private BooksModel book;

}
