package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="car_record")
@Data
public class CarModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cno;
	
	private String company;
	
	private int prize;


}
