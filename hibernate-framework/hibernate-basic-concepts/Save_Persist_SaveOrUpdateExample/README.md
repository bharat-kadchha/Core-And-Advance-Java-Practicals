###  Save_Persist_SaveOrUpdateExample :

- hibernate provide couple of ways to save ab entity object into database.
    1. save() :
         - this method saves records which created by INSERT query .and return serializable identifier.
            ```
                session.save(student);
            ```
    2. persist() :
         - this method saves records which created by INSERT query .and didn't return serializable identifier.
            ```
                session.persist(student);
            ```
    3. saveOrUpdate() :
         - this method saves records which created by INSERT or UPADATE query.
            ```
                session.saveOrUpdate(student);
            ```
   
 
