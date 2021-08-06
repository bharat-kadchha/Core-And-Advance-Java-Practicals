### PrimaryKeyGeneration :
      
- in hibernate tools four types of key generation strategies.

1. AUTO :
    - select a generation strategy based on the used dialect.
        ```
            @GeneratedValue(strategy = GenerationType.AUTO)
        ```
2. IDENTITY :
    - hibernate relies on an auto-incremented database column to generate the primary key.
        ```
            @GeneratedValue(strategy = GenerationType.IDENTITY)
        ```
3. SEQUENCE :
    - increment key based on the sequence we define.
        ```
            @GeneratedValue(strategy = GenerationType.SEQUENCE)
        ```
4. TABLE :
    - database one or more tables can be used to hold identifier counter.
         ```
            @GeneratedValue(strategy = GenerationType.TABLE)
         ```
   
 
