### Hibernate@columnDefault :
- if we want to set the default value to the column then use this annotation. :
- it may be working with specific databases.
    ```
    @ColumnDefault(value = "'12.52'")
    @Column(name = "rate")
	private float rate;
    ```

