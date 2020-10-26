# SPRING IOC CONTAINER

## these projects contain spring IOC container example. 

   ### what you are learing from following projects as below.

   - Spring IOC container :
      - no need to worry about the creation or assemble the objects by the developer, in spring, IOC container is responsible to create, configure, and assemble the objects.
      - these objects related metadata-configuration provided by `XML` file, `javaAnnotation` or `java code`. based on configuration IOC container instantiate objects and maintain their life cycle.
      - every single object known as `Spring Beans`.
      - in spring, two interfaces act as IOC container.
        1.  *ApplicationContextContainer*
        2.  *BeanFactory*

   - SpringApplicationContextContainer :
      - This container is defined by the `org.springframework.context.ApplicationContext` interface.
      - it has more enterprise-specific functionality included with BeanFactory also. so generally recommended to use it.
      ```java
		ApplicationContext classPathCtx = new ClassPathXmlApplicationContext("MyBean.xml");
      ```
      

   - SpringBeanFactoryContainer :
      - This container is defined by the `org.springframework.beans.factory.BeanFactory` interface.
      - it is the simplest container to provide basic support of **DI**.
      - Bean Factory is also used in lightweight application and applet-based projects because the data volume is significant.
      ```java
      BeanFactory factory = new XmlBeanFactory(new ClassPathResource("MyBean.xml"));
      ```
      
     
     
   