### HibernateCollection@imutable :
- @immutable annotation used to prevent updating entity as well as collection attributes.its also apply class level or attribute level.
- immutable and @Entity(mutable = false) both are same.
```
    @OneToMany(cascade = CascadeType.ALL)
	@Immutable // her we can't update this student book list.
	private List<BooksModel> book;
```


