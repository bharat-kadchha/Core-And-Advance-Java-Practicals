# HIBERNATE BASIC
## this directory contains the core concept of hibernate. 
   ### what you are learning from the following projects.
   - CascadeTypeExample :
      
     - to establish dependency between entities we have to used cascadeType with mapping annotation.
     - there are many type of cascading like.persist,remove,merge,ALL etc,,,
     
   - CreateSessionFactoryWithConfigFile :

      - to create SessionFactory with the help of Config file `hibenate.cfg.xml`.

   - CreateSessionFactoryWithoutConfigFile :
      
     - to create SessionFactory without config file. here we have to configure all the hibernate properties into Properties object.
     
   - DirtyCheckingConcept :
      - avoid time-consuming DATABASE action, updating table without effecting to another field it means the query is performed only updating the field. remaining unchanged.
      
   - hibernate_with_xmlFile :
      
     - handle an entity using XML files with the help of `<hibernate-mapping>` tag.
     
   - Lazy_EagerExample :

     - two types of data loading strategies in HIBERNATE.these is a reference to child class when a parent is loaded.

      1. LAZY LOADING :
         - this is the default Loading strategy. use when you are not getting a child entity with a parent.
      2. EGARE LOADING :
         - this is worse coding .it will return all details about parent and child as well if the child is not 

   - Merge_UpdateExample :
      1. session.update(Class entity) :
         - it is a method of session for the update or saves the present entity. but it works only for the current session.
        
      2. session.merge(Class entity) :
         - Telling to hibernate to get the object from another session that is closed but I have to modify it in the current session.
       

   - PrimaryKeyGeneration :
      
      - in hibernate tools four type of key gentration strategies.

         1. AUTO :
            - select a generation strategy based on the used dialect.
         2. IDENTITY :
            - hibernate relies on an auto-incremented database column to generate the primary key.
         3. SEQUENCE :
            - increment key based on the sequence we define.
         4. TABLE :
            - database one or more tables can be used to hold identifier counter.
   - Save_Persist_SaveOrUpdateExample :

     - hibernate provide a couple of ways to save ab entity object into the database.
      1. save() :
         - this method saves records created by INSERT query .and returns a serializable identifier.
      2. persist() :
         - this method saves records created by INSERT query .and didn't return serializable identifiers.
      3. saveOrUpdate() :
         - this method saves records created by INSERT or UPDATE query.

