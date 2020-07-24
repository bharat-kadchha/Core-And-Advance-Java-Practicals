package com;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

import lombok.Data;

@Entity
@Table(name = "date_table")
@Data
public class StudentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	// @Temporal(value = TemporalType.TIME) NOT recommended to use here ..its only
	// for java.util.Date classes
	private LocalDate localDate;

	private ZonedDateTime zoneDateTime;
	@NaturalId
	private String enroll;

}
