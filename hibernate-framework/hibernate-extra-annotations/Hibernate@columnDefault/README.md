### Hibernate@columnDefault :
- if we want to set default value to the column then use this annotation. :
- it may working with specific databases.
    ```
        @ColumnDefault(value = "'12.52'")
    	@Column(name = "rate")
	    private float rate;
    ```

