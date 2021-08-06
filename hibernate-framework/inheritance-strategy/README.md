# HIBERNATE QUERY LANGUAGE
## this directory contains different inheritance strategy hibernate examples.
   ### what you are learning from the following projects.
   - 3 types of strategy normalized ratio as below.
   ``` 
   JOIN > TABLE_PER_CLASS > SINGLE 
   ```
   - JOINED type is complete normalized table.
   - types of Strategy :
      1. DefaultInheritanceStrategy :
         - this is default type of InheriranceStrategy.
      2. JoinInheritanceStrategy :
         - @Inheritance(strategy = InheritanceType.JOINED) 
      3. SingleTableInheritanceStrategy :
         - data will be store in single table with new column name-DTYPE(dis-criminator type).
         - inherit super entity. it is called normalization in DBMS.
      4. TablePerClassInheritanceStrategy :
         - @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) 
 