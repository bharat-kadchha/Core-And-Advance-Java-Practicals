### HibernateFristLevelCache :
       
- it is a session-level cache enabled by default. there is no way to disable it.
- data of any session is not visible for other sessions. when the session is closed then cache or persisted data is lost.
- caching is useful for increasing the performance of the application.
```
    StudentModel student2 = session.get(StudentModel.class, sid);
	System.out.println(student2);
	session.getTransaction().commit();
	StudentModel student3 = session.get(StudentModel.class, sid);
	System.out.println(student3);
    session.close();
```