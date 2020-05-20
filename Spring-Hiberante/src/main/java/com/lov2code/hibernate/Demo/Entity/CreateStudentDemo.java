package com.lov2code.hibernate.Demo.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

	public static void main(String[] args) {
	//create a sessinfactory which contains  cofiguration files
		
				
		Configuration cf=	new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.addAnnotatedClass(Student.class);
		SessionFactory factory = 	cf.buildSessionFactory();
		
		//create a session for saving a student object
		Session session=factory.getCurrentSession();
		
		                //begin a transaction      
		                session.beginTransaction();
		                
		                //create a student object
		                Student student=new Student("Naidu","Beavra","gbevara@miraclesoft.com");
		                
		                //save the object
		                session.save(student);
		                
		                //commit the transaction 
		                session.getTransaction().commit();
	}

}
