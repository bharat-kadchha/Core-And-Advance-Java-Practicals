package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Entity
@Table(name = "books_name", uniqueConstraints = @UniqueConstraint(columnNames = { "bName", "student_id" }))
@Data
public class BooksModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String bName;
	private int prize;

	@ManyToOne
	private StudentModel student;

}
