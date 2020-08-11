package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtils {

	private static StandardServiceRegistry standardServiceRegistry;
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		try {
			standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build(); // interface

			MetadataSources sources = new MetadataSources(standardServiceRegistry);

			Metadata metadata = sources.getMetadataBuilder().build();
			sessionFactory = metadata.buildSessionFactory(); // interface
		} catch (Exception e) {
			if (standardServiceRegistry != null) {
				StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
			}
		}

		return sessionFactory;
	}

	public static void closeSessionfactory() {
		sessionFactory.close();
	}

}
