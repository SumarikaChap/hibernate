package org.learn.hibernate;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateApplication {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		System.out.println("Session was established");
		//session.close();
		factory.close();
		

	}

}
 