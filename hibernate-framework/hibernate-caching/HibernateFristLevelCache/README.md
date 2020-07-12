### HibernateFristLevelCache :
       
- it is session-level cache enable by-default.there is no way to disable it.
- data of any session not visible for other sessions.when the session is closed then cache or persisted data lost.
- caching useful for increasing the performance of the application.
```
    StudentModel student2 = session.get(StudentModel.class, sid);
	System.out.println(student2);
	session.getTransaction().commit();
	StudentModel student3 = session.get(StudentModel.class, sid);
	System.out.println(student3);
    session.close();
```
 
