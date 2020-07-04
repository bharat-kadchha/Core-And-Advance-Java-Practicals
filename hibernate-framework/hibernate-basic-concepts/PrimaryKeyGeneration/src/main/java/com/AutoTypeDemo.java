package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

//default type is auto here.new table generated called hibernate_Sequence in to DB ,
//if we want to change table name then use @SequenceGenerator 

@Entity
@Table(name = "genration_type")
@Data

public class AutoTypeDemo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "id_genrator")
	@SequenceGenerator(name = "id_genrator", initialValue = 51, allocationSize = 1, sequenceName = "std_id")
	private int id;

	@Column(name = "s_name")
	private String name;
	@Column(name = "s_city")
	private String city;

}
