### Hibernate@Embadded :
- to set user define entity without creating another table, so we can specify that object is embedded with same class using @Embadded annotation. we can specify that object is embedded with this class.
- we can use the embedded same type of object multiple times.
- hibernate create the same object with the same column name .so it will give an error. ( repeated column .)
to solve this error.JPA provides `@AttributeOverride`

```
@Embedded
private MarksModel prevoiusMarks;
@Embedded
@AttributeOverrides(value = { @AttributeOverride(column = @Column(name = "c_maths_mark"), name = "math"),
		@AttributeOverride(column = @Column(name = "c_sci_mark"), name = "science"),
		@AttributeOverride(column = @Column(name = "c_eng_mark"), name = "englsh") })
private MarksModel currentMarks;
```

    

