package com;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "person_name")
@Data
public class PersonModel extends StudentModel {

	private int pNo;

	private String gender;

}
