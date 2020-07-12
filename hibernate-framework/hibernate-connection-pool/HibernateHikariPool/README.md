### HibernateHikariPool :
      
- it is very fast and lightweight java connection pool library.
- hibernate provide download libraries for Hikari connection pool : [download](https://mvnrepository.com/artifact/hikari-cp/hikari-cp/2.6.0)

Hibernate provide implimentation for Hikari pool as below..
``` 
	org.hibernate.hikaricp.internal.HikariCPConnectionProvider
```

```
	<property name="hibernate.hikari.minimumIdle">5</property> 
		
	<property name="hibernate.hikari.maximumPoolSize">20</property> 
		
	<!-- maximum waiting time in ms-->
	<property name="hibernate.hikari.connectionTimeout">10000</property>
	
```

