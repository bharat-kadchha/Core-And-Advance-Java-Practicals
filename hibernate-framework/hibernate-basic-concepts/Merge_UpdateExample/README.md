###  Merge_UpdateExample :
1. session.update() :
- it is method of session for the update or save present entity.but it is work only current session.
    
    ```
        session.update(student);
    ```
2. session.merge() :
- Telling to hibernate to get the object from other session which is closed but i have to modified in current session.
    ```
        session.merge(student);
    ```
   
 
