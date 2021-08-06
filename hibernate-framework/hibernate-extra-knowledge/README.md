# HIBERNATE EXTRA KNOWLEDGE 
## this directory contain different concepts example.
   ### what you are learning from the following projects.
   - BinaryDataStore :
      - to store the binary data into the database with the help of @lob annotation.
      - BLOB (binary large object data) CLOB (character large object data) these both are datatype of Database.
   - HibernateBatchProcessing :
      - every time create a connection and store a single object into the database. but we can store thousands of objects with the help of a batch in a single connection or query.
   - HibernateCollection@Imutable :
      - @immutable annotation is used to prevent updating entity as well as collection attributes. It also applies to class level or attribute level.
   - HibernateCollectionSave :
      - to set Collection as an element of an entity like. List, Set, etc. 
      - @ElementCollection annotation tells to hibernate this is a collection element.
   - Hibernate@Embadded :
      - to set user define entity without creating another table, so we can specify that object is embedded with same class using @Embadded annotation.
   - HibernateJPADemo :
      - create entityManager for the managing entities and no need to maintain other configuration. that is a specification for the Hibernate. 
   - StoreProcedureAndFunction :
      - store procedure and function is a concept of DBMS .so you can find how to call procedure and function.
      - JDBC CallableStatement helps us to call procedure and function. 



