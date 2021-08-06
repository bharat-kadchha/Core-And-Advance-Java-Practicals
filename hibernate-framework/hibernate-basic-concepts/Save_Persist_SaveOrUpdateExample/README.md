###  Save_Persist_SaveOrUpdateExample :

- hibernate provide a couple of ways to save ab entity object into the database.
    1. save() :
         - this method saves records created by INSERT query .and return serializable identifiers.
            ```
                session.save(student);
            ```
    2. persist() :
         - this method saves records created by INSERT query .and didn't return serializable identifiers.
            ```
                session.persist(student);
            ```
    3. saveOrUpdate() :
         - this method saves records created by INSERT or UPDATE query.
            ```
                session.saveOrUpdate(student);
            ```
   
 
