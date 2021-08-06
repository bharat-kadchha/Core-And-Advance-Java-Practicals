### ManyToManyMapping :
  - it is made between two entities where one can have a relation with multiple other entity instances.
  - this type of relationship can be unidirectional or bidirectional.
  - use @ManyToMany annotation for this relationship.
  - hibernate create two extra table likes.`student_book` and `book_student`.
  ```
 public class StudentModel
 {
    @ManyToMany(cascade = CascadeType.ALL)
    private List<BooksModel> book;
 }

 public class BooksModel
 {
    @ManyToMany(mappedBy = "book")
    private List<StudentModel> stds;
 }
 ```
 