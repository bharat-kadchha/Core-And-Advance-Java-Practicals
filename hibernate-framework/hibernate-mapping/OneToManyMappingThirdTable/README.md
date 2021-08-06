### OneToManyMappingThirdTable :
- in this type of relation one Obejct can asoosicated with multiple.
- one extra table created by hibernate which contain the mapping keys for both table.
- suppose,student and book both tables are in oneToMany reletionship then hibernate create one more table like student_book.
- use @OneToMany annotation for this relationship.
```
public class StudetModel
{
  @OneToMany(cascade = CascadeType.ALL)
  private List<BooksModel> book;
}
```