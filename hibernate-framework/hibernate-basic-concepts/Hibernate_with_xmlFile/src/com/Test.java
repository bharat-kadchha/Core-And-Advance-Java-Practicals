package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		
		Session s=null;
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		s=sf.openSession();
		s.beginTransaction();
		Student b1=new Student();
		b1.setId(1);
		b1.setName("abcdefg");
		b1.setCity("aaaa");
		
		s.save(b1);
		s.getTransaction().commit();
		System.out.println("save");
		s.close();
	}

}
