# BEHAVIORAL DESIGN PATTERN

## this directory contains a different type of behavioral design pattern with its examples. 

   ### what you are learning from the following projects.

- Behavioral design :
    - Behavioral design patterns are concerned with the `interaction` and `responsibility` of objects.
    - These patterns `increase flexibility` in carrying out the communication between the objects and still it should be `loosely coupled`.
    - In this directory, you can find below types of design patterns.

   1.  *Chain of Responsibility Pattern*
       - This Pattern is used to achieve loose coupling in software design where requests are passed through a chain of objects to processing them.
       - The object of the chain will decide who will be processed next and send a request to that object.
       - Every object in the chain will have its `own implementation` to process the request and have a reference of the next object to forward the request.
       - Ex. `catch block` 
  
   2.  *Mediator Pattern*
       - This Pattern is used to provide a centralized communication medium between different objects. It's very useful full in `Enterprise Application`.
       - Main use of it, is to make communication `loosely coupled` between objects.
       - Ex. `java.util.Timer`, `java.lang.reflect.`  _invoke()_
   3.  *Template Pattern*
       - This Pattern is used to defines the steps to execute an `algorithm` and it can provide `default implementation` might be common for all subclass.
       - In this pattern, certain steps whose `order is fixed` and for some of the methods differ from the base class.
       - Ex. non-abstract method of `java.io.InputSteam`, `java.io.OutputStream`, `java.io.Reader`, `java.io.Writer`
