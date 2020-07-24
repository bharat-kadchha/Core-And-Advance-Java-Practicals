package com;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//it is value of an object  ...we have to set user define entity without create other table,
// so we can specified that object is embedded with this class .

/*we have to embedded same type of object multiple times.
hibernate create same object with same column name .so it will gives error.( repeated column .)
to solve this error.jPA provide @AttributeOverride
*/

@Entity
@Table(name = "result")
@Data
public class StudentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "s_name")
	private String name;
	@Column(name = "s_city")
	private String city;

	private int std;

	private int enroll;

	@Embedded
	private MarksModel prevoiusMarks;
	@Embedded
	@AttributeOverrides(value = { @AttributeOverride(column = @Column(name = "c_maths_mark"), name = "math"),
			@AttributeOverride(column = @Column(name = "c_sci_mark"), name = "science"),
			@AttributeOverride(column = @Column(name = "c_eng_mark"), name = "englsh") })
	private MarksModel currentMarks;

}
