# HIBERNATE MAPPING
## this directory contains different types of mapping example.
   ### what you are learning from the following projects.
   - ManyToManyMapping :
      - it is made between two entities where one can have a relation with multiple other entity instances.
      - this type of relationship can be unidirectional or bidirectional.
      - use @ManyToMany annotation for this relationship.
   - ManyToOneMapping : 
      - if a source object references to target object there is no guarantee that the target obejct also has a relationship with the source. 
      - it will be used when we have to make relationships like many students in one class.
      - use @ManyToOne annotation for this relationship.
   - OneToManyMappingThirdTable :
      - in this type of relationship one Obejct can associate with multiple.
      - one extra table created by hibernate which contain the mapping keys for both table.
      - suppose, student and book both tables are in a one-to-many relationship then hibernate create one more table like student_book.
      - use @OneToMany annotation for this relationship.
   - OneToManyMappingWithOutThirdTable :
      - here we have to specify a bidirectional relationship then hibernate will not create a new table.
      - use @OneToMany and @ManyToOne(MappedBy="") annotation for this relationship.
   - OneToOneMapping :
      - here this is a simple relationship where single source object has a single target object.
      - use @OneToOne annotation for this relationship.
