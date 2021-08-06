### StoreProcedureAndFunction :
- store procedure and function is a concept of DBMS .so you can find how to call procedure and function.
- JDBC CallableStatement helps us to call procedure and function. 

- stored procedure :
```
Query query = session.createSQLQuery("CALL getStudent(:sid)").addEntity(StudentModel.class).setParameter("sid",2);
```
- Function :
```
CallableStatement callStm = con.prepareCall("{? = CALL mysum(? , ?)}");
```