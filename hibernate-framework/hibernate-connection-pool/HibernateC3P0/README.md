### HibernateC3P0 :
      
- C3P0 is an open source JDBC connection pool distributed along with Hibernate in the lib/ directory. 
- download libraries for C3P0 connection pool : [download](https://mvnrepository.com/artifact/org.hibernate/hibernate-c3p0/5.4.3.Final)

Hibernate provides an implementation for the Hikari pool as below.
``` 
	org.hibernate.service.jdbc.connections.internal.C3P0ConnectionProvider.
```

```
	<!-- hibernate default 1 min connection-->
	<property name="hibernate.c3p0.min_size">5</property> 
		
	<!-- hibernate default 100 max connection-->
	<property name="hibernate.c3p0.max_size">10</property> 
		
	<!-- timeout in second -->
	<property name="hibernate.c3p0.timout">200</property>
		
```

