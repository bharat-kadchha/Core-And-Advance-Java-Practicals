### HibernateCollection@imutable :
- @immutable annotation is used to prevent updating entity as well as collection attributes. It also applies to class level or attribute level.
- immutable and @Entity(mutable = false) both are the same.
```
@OneToMany(cascade = CascadeType.ALL)
@Immutable // her we can't update this student book list.
private List<BooksModel> book;
```


