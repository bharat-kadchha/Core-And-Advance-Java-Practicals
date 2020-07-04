# HIBERNATE BASIC
## these projects contain core concepts of hibernate. 
   ### what you are learing from following projects as below.
   - CascadeTypeExample :
      
     - to establish dependency between entities we have to used cascadeType with mapping annotation.
     - there are many type of cascading like.persist,remove,merge,ALL etc,,,
     
   - CreateSessionFactoryWithConfigFile :

      - to create SessionFactory with the help of Config file `hibenate.cfg.xml`.

   - CreateSessionFactoryWithoutConfigFile :
      
     - to create SessionFactory without config file.here we have to configure all the hibernate properties in to Properties object.
     
   - DirtyCheckingConcept :
      - avoid to time consuming DATABASE action, updating table without effecting to other field it means query is perform only updating field.remaining unchanged.
      
   - hibernate_with_xmlFile :
      
     - handle an entity using XML files with the help of `<hibernate-mapping>` tag.
     
   - Lazy_EagerExample :

     - two types of data loading strategies in HIBERNATE.these is reference to child class when parent is loded.

      1. LAZY LOADING :
         - this is default Loading strategy.use when you are not getting child entity with parent.
      2. EGARE LADOING :
         - this is worse coding .it will return all details about parent and chiled as well if chied is not 

   - Merge_UpdateExample :
      1. session.update(Class entity) :
         - it is method of session for the update or save present entity.but it is work only current session.
        
      2. session.merge(Class entity) :
         - Telling to hibernate to get the object from other session which is closed but i have to modified in current session.
       

   - PrimaryKeyGeneration :
      
      - in hibernate tools four type of key gentration strategies.

         1. AUTO :
            - select generation strategy based on the used dialect.
         2. INDETITY :
            - hibernate relies on an auto-incremeted database column to generate primary key.
         3. SEQUENCE :
            - increment key based on sequence we define.
         4. TABLE :
            - database one or more table can be used to hold indentifier counter.
   - Save_Persist_SaveOrUpdateExample :

     - hibernate provide couple of ways to save ab entity object into database.
      1. save() :
         - this method saves records which created by INSERT query .and return serializable identifier.
      2. persist() :
         - this method saves records which created by INSERT query .and didn't return serializable identifier.
      3. saveOrUpdate() :
         - this method saves records which created by INSERT or UPADATE query.

