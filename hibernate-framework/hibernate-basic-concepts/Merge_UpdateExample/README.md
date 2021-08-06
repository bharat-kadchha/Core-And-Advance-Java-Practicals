###  Merge_UpdateExample :
1. session.update() :
- it is method of session for the update or save present entity.but it is work only current session.
    
    ```
        session.update(student);
    ```
2. session.merge() :
- Telling to hibernate to get the object from another session that is closed but I have to modify it in the current session.
    ```
        session.merge(student);
    ```
   
 
