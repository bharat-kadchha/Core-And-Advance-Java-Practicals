package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

//it is requires additional select statement for select next id value.but no impact most of application.
//if you don't provide any table then hibernate request to default table.
//we can change the name of table.as below...
//limitation--dialect.MySQLDialect not support sequence

@Entity
@Table(name = "sequence")
@Data
public class SequenceTypeDemo {

	@Id
	@SequenceGenerator(name = "id_genrator1", initialValue = 51, allocationSize = 1, sequenceName = "std_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_genrator1")
	private int id;

	@Column(name = "s_name")
	private String name;
	@Column(name = "s_city")
	private String city;

}
