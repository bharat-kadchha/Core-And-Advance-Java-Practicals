### Hibernate@formula :
  - if we want to calculate column value then use this annotation.
  - used to calculate entity attributes, it will not store into DB as a column.
  - it is a read-only Attribute we can't modify its value.
  ```
	  @Column(name = "credit")
	  private double credit;

  	@Column(name = "rate")
  	private double rate;

  	@Formula(value = "credit * rate")
  	private double interest;
  ```
  