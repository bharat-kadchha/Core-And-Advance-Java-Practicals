package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "myaccount")
@Data
public class AccountModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "credit")
	private double credit;

	@Column(name = "rate")
	private double rate;

	@Formula(value = "credit * rate")
	private double interest;

}
