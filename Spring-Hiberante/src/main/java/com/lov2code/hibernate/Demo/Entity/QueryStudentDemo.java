package com.lov2code.hibernate.Demo.Entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryStudentDemo {

	public static void main(String[] args) {
		// create session factory
				SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();
				
				// create session
				Session session = factory.getCurrentSession();
				session.beginTransaction();
				List<Student> theStudent=session.createQuery("from Student").list();
				for(Student student:theStudent)
				{
					System.out.println(student);
				}
				
				session.close();

	}

}
