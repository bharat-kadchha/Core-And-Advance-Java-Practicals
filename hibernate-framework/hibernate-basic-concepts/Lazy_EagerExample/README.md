### Lazy_EagerExample :

 - two types of data loading strategies in HIBERNATE.these is a reference to child class when a parent is loaded.
    1. LAZY LOADING :
        - this is the default Loading strategy. use when you are not getting a child entity with a parent.
    2. EGARE LOADING :
        - this is worse coding .it will return all details about parents and child as well if the child is not required.
    ```
     @OneToMany(fetch = FetchType.EAGER)	//or 	FetchType.LAZY								    
     @JoinTable(name="book_name",joinColumns = @JoinColumn(name="id"))
	 private Set<Books> collection= new HashSet<Books>();
    ```