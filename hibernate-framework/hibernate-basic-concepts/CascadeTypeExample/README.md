###  CascadeTypeExample :  
- to establish dependency between entities we have to use cascade type with mapping annotation.
- there are many types of cascading like.persist,remove,merge,ALL etc,,,
     
 ```
    @OneToOne(cascade = { CascadeType.ALL})
    @JoinColumn(name = "book_id")
	private Books book;
```
 
