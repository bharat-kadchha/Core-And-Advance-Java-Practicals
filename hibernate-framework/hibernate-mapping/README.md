# HIBERNATE MAPPING
## these projects contain different types of mapping example.
   ### what you are learning from the following projects as below.
   - ManyToManyMapping :
      - it is made between two entities where one can have releation with multiple other entity instance.
      - this type og reletion can be unidirectional or bidirectional.
      - use @ManyToMany annotation for this reletionship.
   - ManyToOneMapping : 
      - if a source object referances to target object there is no guarantee that the target obejct alsp hase reletionship with source. 
      - it will used when we have to made reletionship like many student one class.
      - use @ManyToOne annotation for this reletionship.
   - OneToManyMappingThirdTable :
      - in this type of relation one Obejct can asoosicated with multiple.
      - one extra table created by hibernate which contain the mapping keys for both table.
      - suppose,student and book both tables are in oneToMany reletionship then hibernate create one more table like student_book.
      - use @OneToMany annotation for this relationship.
   - OneToManyMappingWithOutThirdTable :
      - here we have to specify bidirectional reletionship then hibernate will not create new table.
      - use @OneToMany and @ManyToOne(MappedBy="") annotation for this relationship.
   - OneToOneMapping :
      - here this is simple reletionship where single source object have a single target object.
      - use @OneToOne annotation for this relationship.
