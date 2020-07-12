package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "student_bag")
@Data
@ToString
public class BagModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private int prize;

}
