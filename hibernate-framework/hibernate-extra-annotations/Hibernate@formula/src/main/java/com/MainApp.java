package com;

import org.hibernate.Session;
import org.hibernate.Transaction;

import utils.HibernateUtils;

/*@formula --used to calculate entity attributes,it will not store in to DB as a column.
its expects HQL native parameter and return calculated result.its read only attribute. 
*/
public class MainApp {
	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			Transaction transaction = session.beginTransaction();
			AccountModel ac = new AccountModel();
			ac.setCredit(12345.43);
			ac.setRate(0.8);
			session.save(ac);

			AccountModel ac1 = new AccountModel();
			ac1.setCredit(12345.43);
			ac1.setRate(0.8);
			session.save(ac1);

			transaction.commit();
		}
	}

}
