### Hibernate@Index :
  - is used to create indexing for a particular entity to increase searching capability.
  - it's required for searching value based on some columns. internally DB used some algorithm for performance increase.
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