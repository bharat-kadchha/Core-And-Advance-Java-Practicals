###  CascadeTypeExample :  
- to establish dependency between entities we have to used cascadeType with mapping annotation.
- there are many type of cascading like.persist,remove,merge,ALL etc,,,
     
 ```
    @OneToOne(cascade = { CascadeType.ALL})
    @JoinColumn(name = "book_id")
	private Books book;
```
 
