### JPADemo :
- create entityManager for the managing entities and no need to maintain other configuration.that is a speccification for the Hibernate.focus on business login .
```
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("spu1");// specific persistence unit
    EntityManager manager = factory.createEntityManager();
	manager.getTransaction().begin();
	manager.persist(carModel);
	manager.getTransaction().commit();
```

