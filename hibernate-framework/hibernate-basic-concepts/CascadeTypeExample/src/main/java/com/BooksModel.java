package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "books_name")
@Getter
@Setter
public class BooksModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String bName;

	private int prize;

}
