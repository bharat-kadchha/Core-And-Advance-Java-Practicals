### Hibernate@UniqueConstraints :
  - used to set Constraints on columns then use this annotations.
  - columnNames={} define column names on which we have to apply constraint.if at any where constraint violate then hibernate throw Exception.
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
  