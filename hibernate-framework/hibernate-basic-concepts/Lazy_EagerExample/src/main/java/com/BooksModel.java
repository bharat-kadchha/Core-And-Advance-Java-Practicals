package com;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data

public class BooksModel {

	private String bName;
	private int prize;

}
