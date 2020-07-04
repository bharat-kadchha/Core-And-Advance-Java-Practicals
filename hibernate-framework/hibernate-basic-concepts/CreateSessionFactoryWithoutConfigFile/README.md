### CreateSessionFactoryWithoutConfigFile :
      
- to create SessionFactory without config file.here we have to configure all the hibernate properties in to Properties object.
```
Configuration configuration = new Configuration();
Properties dbsetting = new Properties();
configuration.setProperties(dbsetting);
StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
```  
   
 
