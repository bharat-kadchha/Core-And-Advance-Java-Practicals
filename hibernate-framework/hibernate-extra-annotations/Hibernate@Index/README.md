### Hibernate@Index :
  - use to create indexing for perticular entity to increse searching capability.
  - its required for searching value based on some column.internally DB used some algorithm for performance increase.
  ```    
  @Entity
  @Table(name = "student_name", indexes = @Index(name = "index1", columnList = "s_name")) // see the console queries
  @Data
public class StudentModel 
{ 
   private int id;
   private String name
}	
  ```