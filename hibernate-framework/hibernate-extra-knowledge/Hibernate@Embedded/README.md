### Hibernate@Embadded :
- to set user define entity without create other table, so we can specified that object is embedded with same class using @Embadded annotation.we can specified that object is embedded with this class .
- we can use embedded same type of object multiple times.
- hibernate create same object with same column name .so it will gives error.( repeated column .)
to solve this error.jPA provide `@AttributeOverride`

```
@Embedded
private MarksModel prevoiusMarks;
@Embedded
@AttributeOverrides(value = { @AttributeOverride(column = @Column(name = "c_maths_mark"), name = "math"),
		@AttributeOverride(column = @Column(name = "c_sci_mark"), name = "science"),
		@AttributeOverride(column = @Column(name = "c_eng_mark"), name = "englsh") })
private MarksModel currentMarks;
```

    

