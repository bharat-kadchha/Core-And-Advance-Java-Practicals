### PrimaryKeyGeneration :
      
- in hibernate tools four type of key gentration strategies.

1. AUTO :
    - select generation strategy based on the used dialect.
        ```
            @GeneratedValue(strategy = GenerationType.AUTO)
        ```
2. INDETITY :
    - hibernate relies on an auto-incremeted database column to generate primary key.
        ```
            @GeneratedValue(strategy = GenerationType.IDENTITY)
        ```
3. SEQUENCE :
    - increment key based on sequence we define.
        ```
            @GeneratedValue(strategy = GenerationType.SEQUENCE)
        ```
4. TABLE :
    - database one or more table can be used to hold indentifier counter.
         ```
            @GeneratedValue(strategy = GenerationType.TABLE)
         ```
   
 
