package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "fristCache")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE) // update cache data when performing any transaction.
@Data
@ToString
public class StudentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "s_name")
	private String name;
	@Column(name = "s_city")
	private String city;

	private int std;

	private int enroll;

}
