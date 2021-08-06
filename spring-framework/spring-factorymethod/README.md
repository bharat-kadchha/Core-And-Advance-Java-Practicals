# SPRING FACTORY METHOD

## this directory contains a spring factory-method example. 

   ### what you are learning from the following projects is below.

   - Spring Factory Method :
      - Spring provides to inject dependency using factory methods.
      - there are two attributes.
         1. Factory Method:
            - the method invoked for inject dependency is called *Factory-method*.
            - we can say that the method which returns an object.
            - define this method as *static*. because to tell the spring to create objects for the same bean.
            - its returns an instance of an object. like. `Calander Calander = Calander.getInstance();`
         2. Factory Bean:
            - it denotes reference of the bean through the factory method will be invoked.
            - we can say that the bean of a class contains a factory method.
            - it is used for creating an object based on a factory design pattern.
      
      - Factory Methods types:
         1. NonStatic Factory-Method that returns an instance of another class.
         2. Static Factory-Method that returns an instance of another class.
         3. Static Factory-Method that returns an instance of the same class.  
      
   - NonStaticFactoryMethodAnotherBean
     -  here, *getVehicalFactory* method of *VehicalFactory* class, which returns an instance of the same class. but this method has <u>non-static behavior </u> that's why we have to first create *separate bean* and then assign that bean into *factory-bean* directive.
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
     - here, the *getCar* method has  <u>static behavior </u>, there is no need to define another bean here, it will return instances of the same class. 
         ```java
         <bean id="car" class="com.factory_method.CarModel" factory-method="getCar" />
         ``` 
     
