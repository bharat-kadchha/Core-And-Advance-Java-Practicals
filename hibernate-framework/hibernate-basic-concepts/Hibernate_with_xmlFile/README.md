###  hibernate_with_xmlFile :
      
- handle an entity using XML files with the help of `<hibernate-mapping>` tag.
```
    <hibernate-mapping>
     <class name="com.Student" table="STUDENT" schema="APP">
        <id name="id" type="int" column="ID">
           <generator class="assigned" ></generator>
        </id>
        <property name="name">
  	         <column name="name"/>
        </property>
            .......
     </class>
    </hibernate-mapping>
 ```
   
 
