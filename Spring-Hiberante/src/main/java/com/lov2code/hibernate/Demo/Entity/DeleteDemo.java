package com.lov2code.hibernate.Demo.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {
	public static void main(String args[])
	{
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.createQuery("delete from Student where id = 4").executeUpdate();
		
		session.getTransaction().commit();
		 session = factory.getCurrentSession();
		session.beginTransaction();
		Student theStudent=session.get(Student.class, 3);
		session.delete(theStudent); //another way for deleting the obvject
		session.getTransaction().commit();
		
	}

}
