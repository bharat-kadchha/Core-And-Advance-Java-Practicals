### HibernateCollectionSave :
- to set Collection as an element of entity like.List,Set etc. 
- @ElementCollection annotation tells to hibernate this is a collection element.
```
	@ElementCollection
	@JoinTable(name = "book_name", joinColumns = @JoinColumn(name = "id"))
	private Set<BooksModel> collection = new HashSet<BooksModel>();
```

