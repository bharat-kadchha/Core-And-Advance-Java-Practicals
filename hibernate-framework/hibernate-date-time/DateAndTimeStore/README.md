### DateAndTimeStore :
      
-   `java.sql.Date` extends `java.util.Date` and it will return only Date(yyyy-mm-dd).and `java.sql.Time` will return only Time(hh-MM-ss).
- where `java.util.Date` return Both Date and Time.

- Use Temporal annotation :
    - we want to store only Date then we have to add annotation is @Temporal(value =DATE,TIME,TEMPORAL)
    ```
    @Temporal(value = TemporalType.DATE)
	private Date onlyDate;
    ```


