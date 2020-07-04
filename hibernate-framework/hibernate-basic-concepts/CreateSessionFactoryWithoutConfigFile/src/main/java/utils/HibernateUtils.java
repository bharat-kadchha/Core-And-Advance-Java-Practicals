package utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.StudentModel;

public class HibernateUtils {

	private static StandardServiceRegistry standardServiceRegistry;
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		try {

			Configuration configuration = new Configuration();
			Properties dbsetting = new Properties();

			dbsetting.put(Environment.URL, "jdbc:mysql://localhost:3306/studentdata");
			dbsetting.put(Environment.USER, "root");
			dbsetting.put(Environment.PASS, "123456");
			dbsetting.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			dbsetting.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");

			dbsetting.put(Environment.HBM2DDL_AUTO, "create");
			dbsetting.put(Environment.SHOW_SQL, "true");

			configuration.setProperties(dbsetting);
			configuration.addAnnotatedClass(StudentModel.class);

			standardServiceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
					.build(); // interface

			sessionFactory = configuration.buildSessionFactory(standardServiceRegistry);
		} catch (Exception e) {
			if (standardServiceRegistry != null) {
				StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
			}
		}

		return sessionFactory;
	}
}
