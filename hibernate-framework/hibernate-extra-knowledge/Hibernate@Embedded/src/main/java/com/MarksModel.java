package com;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class MarksModel {

	@Column(name = "maths_mark", precision = 2, nullable = false)
	private float math;

	@Column(name = "sci_mark", precision = 2, nullable = false)
	private float science;
	@Column(name = "eng_mark", precision = 2, nullable = false)
	private float englsh;

}
