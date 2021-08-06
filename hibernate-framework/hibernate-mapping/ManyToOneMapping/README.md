### ManyToOneMapping : 
- if a source object references to target object there is no guarantee that the target object als0 has a relationship with the source object. 
- it will be used when we have to make a relationship like many students has one class.
- use @ManyToOne annotation for this relationship.
```
public class StudentModel
{
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
  //@JoinColumn(name="book_id" ,referencedColumnName = "id")
  private List<BooksModel> book;
}

public class BookModel
{	
  @ManyToOne
  private StudentModel student;
}
```