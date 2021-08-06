### OneToOneMapping :
- here this is simple reletionship where single source object have a single target object.
- use @OneToOne annotation for this relationship.
```
public class StudentModel
{
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "book_id")
  private BooksModel book;
}
```
  