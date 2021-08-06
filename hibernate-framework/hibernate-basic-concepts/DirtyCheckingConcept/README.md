###  DirtyCheckingConcept :
      
 - avoid time-consuming DATABASE action, updating table without effecting to another field it means the query is performed only updating the field. remaining unchanged.
 ```
   @DynamicUpdate  
   public class StudentModel {
    }
 ```