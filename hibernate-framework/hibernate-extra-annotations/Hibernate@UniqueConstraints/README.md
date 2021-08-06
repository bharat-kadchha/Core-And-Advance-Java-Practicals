### Hibernate@UniqueConstraints :
  -it's used to set Constraints on columns then use this annotation.
  - columnNames={} define column names on which we have to apply the constraint. if at anywhere constraint violate then hibernate throw Exception.
  ```
  @Entity
  @Table(name = "books_name", uniqueConstraints = @UniqueConstraint(columnNames = { "bName", "student_id" }))
  @Data
  public class StudentModel 
  {
    private int id;
    private String name;
  }
  ```
  