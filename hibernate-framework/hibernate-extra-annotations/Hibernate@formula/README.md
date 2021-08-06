### Hibernate@formula :
  - if we want to calculate column value then use this annotations.
  - used to calculate entity attributes,it will not store in to DB as a column.
  - it is read only Attribute we cant modified its value.
  ```
	  @Column(name = "credit")
	  private double credit;

  	@Column(name = "rate")
  	private double rate;

  	@Formula(value = "credit * rate")
  	private double interest;
  ```
  