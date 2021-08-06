# HIBERNATE CACHING
## These projects contain caching mechanism of hibernate.
   ### what you are learning from the following projects is below.
   - HibernateFristLevelCache :
      
     - it is a session-level cache enabled by default. there is no way to disable it.
     - data of any session is not visible for other sessions. when the session is closed then cache or persisted data is lost.
     - caching is useful for increasing the performance of the application.
     
   - HibernateSecondLevelCache :

      - we have to do the configuration to enable second-level cache.
      - applying caching for multiple sessions.
      - there are many libraries that provide an implementation of hibernate caching.like.,EHCache, JBOSS, etc.
   - dependency : hibernate-ehcache :  [download](https://mvnrepository.com/artifact/org.hibernate/hibernate-ehcache)

   - for more details of hibernate caching : [hibernate doc](https://docs.jboss.org/hibernate/orm/5.1/userguide/html_single/Hibernate_User_Guide.html#caching-provider-ehcache)  
