### ManyToManyMapping :
  - it is made between two entities where one can have releation with multiple other entity instance.
  - this type og reletion can be unidirectional or bidirectional.
  - use @ManyToMany annotation for this reletionship.
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
 