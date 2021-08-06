### CreateSessionFactoryWithoutConfigFile :
      
- to create SessionFactory without config file. here we have to configure all the hibernate properties into Properties object.
```
Configuration configuration = new Configuration();
Properties dbsetting = new Properties();
configuration.setProperties(dbsetting);
StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
``` 