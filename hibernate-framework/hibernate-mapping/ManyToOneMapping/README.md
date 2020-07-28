### ManyToOneMapping : 
- if a source object referances to target object there is no guarantee that the target obejct als0 has reletionship with source object. 
- it will used when we have to made reletionship like many student has one class.
- use @ManyToOne annotation for this reletionship.
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