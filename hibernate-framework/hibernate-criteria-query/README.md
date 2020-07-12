# HIBERNATE CRITERIA-QUERY
## these projects contain hibernate criteria-query.
   ### what you are learning from the following projects as below.
   - CriteriaQuery :
      
     - hibernate provide other way to process data extecting from RDMS tables.
     - we have to create object programmatically where you can apply projection, restriction, filtering of other logic.
     - create instance of criteia query :
      ``` 
         Criteria criteria = session.createCriteria(StudentModel.class);
      ```
     - apply Restricition : 
     ```
         criteria.add(Restrictions.eq("column name",value));
         criteria.add(Restrictions.like("column name",value));
         criteria.add(Restrictions.between("column name",value,value));
     ```
     - Pagination :
     ```
         criteria.setFristResult(int start);
         criteria.setMaxResult(int max);
     ```
     - Sorting :
     ```
        criteria.addOrder(Order.desc("column"));
        criteria.addOrder(Order.asc("column")); 
     ```
     - Aggregation :
     ```
         criteria.setProjection(Projection.avg("column"));
         criteria.setProjection(Projection.max("column"));
         criteria.setProjection(Projection.sum("column"));
     ```

