package com;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.NaturalId;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "date_table")
@Data
@ToString
public class StudentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private Date utilDate;

	@Temporal(value = TemporalType.DATE)
	private Date onlyDate;

	@NaturalId
	private String enroll;

}
