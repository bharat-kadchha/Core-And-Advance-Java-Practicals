# SPRING FACTORY METHOD

## these projects contain spring factory-method example. 

   ### what you are learning from the following projects as below.

   - Spring Factory Method :
      - Spring provides to inject dependency using factory methods.
      - there are two attributes.
         1. Factory Method:
            - the method invoked for inject dependency is called *Factory-method*.
            - we can say that the method which returns an object.
            - define this method as *static*. because to tell the spring to create objects for the same bean.
            - its return an instance of an object. like. `Calander newCalander = Calander.getInstance();`
         2. Factory Bean:
            - it denotes reference of the bean through the factory method will be invoked.
            - we can say that the bean of a class contains a factory method.
            - it is used for creating an object based on a factory design pattern.
      
      - factory methods types:
         1. NonStatic Factory-Method that returns an instance of another class.
         2. Static Factory-Method that returns an instance of another class.
         3. Static Factory-Method that returns an instance of the same class.  
      
   - NonStaticFactoryMethodAnotherBean
     -  here, *getVehicalFactory* method of *VehicalFactory* class,which return instance of same class. but this method has <u>non-static behaviour</u> thats why we have to first create *separate bean* and then assign that bean in to *factory-bean* directive.
         ```java
         <bean id = "vehicalFactory" class="com.factory_method.getVehicalFactory"/>
         <bean id = "myVehical" class="com.factory_method.VehicalFactory" factory-method="getVehicalFactory" factory-bean="vehicalFactory"/>
         ```

   - StaticFactoryMethodAnotherBean
     - here, *getVehicalFactory* method has <u>static behaviour</u>, so no need to define other *factory-bean*. *factory-method* return instance of class.
         ```java
         <bean id = "vehical" class="com.factory_method.VehicalFactory" factory-method="getVehicalFactory"/> 
         ``` 
   - StaticFactoryMethodOwnBean
     - here, *getCar* method has  <u>static behaviour</u>, there is no need to define other bean here,it will retrun instance of same class. 
         ```java
         <bean id="car" class="com.factory_method.CarModel" factory-method="getCar" />
         ``` 
     
