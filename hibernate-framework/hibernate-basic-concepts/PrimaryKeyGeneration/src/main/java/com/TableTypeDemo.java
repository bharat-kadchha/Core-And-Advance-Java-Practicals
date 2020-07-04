package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import lombok.Data;

//rarely used..its simulate follow store and update current value in DB tables.so its slow over application..
//use specific table as below..

@Entity
@Table(name = "table")
@Data
public class TableTypeDemo {

	@TableGenerator(name = "my_table_gen", table = "tbl_sec", schema = "studentdata") // schema--DB name
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "my_table_gen")
	private int id;

	@Column(name = "s_name")
	private String name;
	@Column(name = "s_city")
	private String city;

}
