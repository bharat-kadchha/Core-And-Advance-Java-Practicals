### StoreProcedureAndFunction :
- storeProcedure and function is a concept of DBMS .so you can find how to call procedure and function.
- JDBC CallableStatement helps us to calling prodecure and function. 

- StoreProcedure :
```
Query query = session.createSQLQuery("CALL getStudent(:sid)").addEntity(StudentModel.class).setParameter("sid",2);
```
- Function :
```
CallableStatement callStm = con.prepareCall("{? = CALL mysum(? , ?)}");
```