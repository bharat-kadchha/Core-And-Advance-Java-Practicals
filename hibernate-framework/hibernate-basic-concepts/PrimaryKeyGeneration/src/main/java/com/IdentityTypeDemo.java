package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

//it is very easy to use...and database increase value after each insert operation perform.
//it is very efficient for DB..because ..every column highly optimized no additional statement.
//limitation---not support JDBC batch operation.

@Entity
@Table(name = "idetity")
@Data
public class IdentityTypeDemo {

	@Id
	@SequenceGenerator(name = "id_genrator1", initialValue = 51, allocationSize = 1, sequenceName = "std_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "id_genrator1")

	private int id;

	@Column(name = "s_name")
	private String name;
	@Column(name = "s_city")
	private String city;

}
