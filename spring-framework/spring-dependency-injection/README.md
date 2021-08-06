# SPRING DEPENDENCY INJECTION

## this directory contains practical of spring DI. 
 
### what is `Dependency`?
- Dependency means classes are directly or indirectly dependent on other classes or instances of the class are created within other classes. and this approach is made our code `tightly-coupled. to overcome this issue spring introduces a technique called **dependency injection (DI)**.

- problem with Dependency.	
  1. tightly coupled
  2. difficult to test 
	
### what is `Dependency Injection?
- to remove dependency from classes and code so that can be easy to *testing* and easy to *manage*. it means application becomes `loosely coupled`.
- advantage of Dependency injection.
   1. loosely coupled
   2. easy to test
    
- how to inject the dependency into code? there is two way to inject the dependency.
    1. by the constructor
	1. by setter method. 

### what's happened internally.
- first, we need to configure bean into an XML file, IOC container creates an object and calling the default constructor for the same object. 
	```java
		<bean id="bike" class="com.example.Bike" />
		//internally - Bike newBike = new Bike();
	```		
- if we want to inject dependency using **constructor** then configure bean into XML file as per below. It internally creates object-like.
	```java
		<constructor-arg value="Blue"/>
		//internally - Car newCar = new Car("Blue");
	```
- if we want to inject dependency using **setter method** then configure bean into XML file like,
	```java
		<property name="color" value="Red"/> 
	```				

	
 ### what you are learning from the following projects.	  

- SpringDIUsingConstructor :
  - in this project, you can learn how to inject dependency using the constructor.
  - also you can use the `<constructor-arg />`  tag for the passing parameter of the bean. you can find this in the XML file. 

- SpringDIUsingSetterMethod :
  - in this project, you can learn how to inject dependency using the setter method.
  - also you can use the `<property />` tag to set the bean element's value XML file. you can find this in the XML file.

- SpringLiteralValueInjection :
  - in this project, you can learn how to inject literal values using the constructor and using the setter method.

- SpringPrimitiveListTypeInjection :
  - in this project, you can learn how to inject primitive values with Collection(List)using the constructor and using the setter method.
  - here, you can use the `<list />` and `<value />` tags for injecting collection values.  

- SpringObjectValueInjection :
  - in this project, you can learn how to inject other Bean Reference using constructor and using the setter method.
  - here, you can use the `<ref bean=""/>` tag for the reference to the bean.
   
- SpringListTypeInjection :
  -  in this project, you can learn how to inject Bean Collection(List) using the constructor and using the setter method.
  -  here, you can use `<list />` with `<ref bean="" />` tag for the reference to the bean.

- SpringMapTypeInjection :
  - in this project you can learn how to inject Bean Collection(Map) using consrtuctor and using setter method.
  - here, you can use of `<map>` and `<entry key="" value="" />` tag for the passing key value pair. 


		