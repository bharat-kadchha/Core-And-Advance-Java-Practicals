package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.CarModel;

public class App {
	public static void main(String[] args) {

		CarModel carModel = new CarModel();

		carModel.setCompany("lamberghini");
		carModel.setPrize(2345678);
		System.out.println("Hello World!");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("spu1");// specific persistence unit
		EntityManager manager = factory.createEntityManager();

		// Car c=manager.find(Car.class,23);
		manager.getTransaction().begin();
		manager.persist(carModel);
		manager.getTransaction().commit();
		 System.out.println(carModel.toString());

	}
}
