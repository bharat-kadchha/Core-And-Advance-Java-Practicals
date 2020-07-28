###  OneToManyMappingWithOutThirdTable :
- here we have to specify bidirectional reletionship then hibernate will not create new table.
- use @OneToMany and @ManyToOne(MappedBy="") annotation for this relationship.
```
public class StudentModel
{
  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "book_id", referencedColumnName = "id")
  private List<BooksModel> book;
}
```
  