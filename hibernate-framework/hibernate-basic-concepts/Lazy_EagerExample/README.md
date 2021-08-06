### Lazy_EagerExample :

 - two types of data loading strategies in HIBERNATE.these is reference to child class when parent is loded.
    1. LAZY LOADING :
        - this is default Loading strategy.use when you are not getting child entity with parent.
    2. EGARE LADOING :
        - this is worse coding .it will return all details about parent and chiled as well if chied is not requried.
    ```
     @OneToMany(fetch = FetchType.EAGER)	//or 	FetchType.LAZY								    
     @JoinTable(name="book_name",joinColumns = @JoinColumn(name="id"))
	 private Set<Books> collection= new HashSet<Books>();
    ```
 
