### OneToOneMapping :
- here this is a simple relationship where a single source object has a single target object.
- use @OneToOne annotation for this relationship.
```
public class StudentModel
{
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "book_id")
  private BooksModel book;
}
```
  