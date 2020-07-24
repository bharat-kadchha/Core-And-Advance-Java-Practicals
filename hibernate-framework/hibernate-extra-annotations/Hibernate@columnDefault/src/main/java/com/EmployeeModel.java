package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "employee")
@DynamicInsert
@Data
public class EmployeeModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@ColumnDefault(value = "'abc'")
	@Column(name = "bank")
	private String bank;

	private double credit;

	@ColumnDefault(value = "'12.52'") // working with specific databases.
	@Column(name = "rate")
	private float rate;

	private double interest;

}
