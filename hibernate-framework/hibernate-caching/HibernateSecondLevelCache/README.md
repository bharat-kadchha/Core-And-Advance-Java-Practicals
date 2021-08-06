### HibernateSecondLevelCache :
       
-  we have to do the configuration to enable second-level cache.
-  second-level caching work for multiple sessions.
-  SessionFactory holds the second-level cache data. It is global for all the session objects and not enabled by default.
-  download EHCache : [EHcache dependency](https://mvnrepository.com/artifact/org.ehcache/ehcache/3.8.1)
```
    <dependency>
		<groupId>net.sf.ehcache</groupId>
		<artifactId>ehcache-core</artifactId>
		<version>2.6.9</version>
	</dependency>
	<!-- Hibernate EHCache API -->
	<dependency>
		<groupId>org.hibernate</groupId>
		<artifactId>hibernate-ehcache</artifactId>
		<version>5.4.0.Final</version>
	</dependency>
```