package com.lov2code.hibernate.Demo.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudentDemo {
	
	
	public static void main(String args[]) {
	SessionFactory factory = new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Student.class)
			.buildSessionFactory();
	
	//create a session for saving a student object
	Session session=factory.getCurrentSession();
	
	                //begin a transaction      
	                session.beginTransaction();
	                
	                //create a student object
	                Student student=session.get(Student.class, 3);
	                
	                student.setFirstName("Harish Varanasi"); //updating data base 
	                
	                session.getTransaction().commit();
	                
	                session=factory.getCurrentSession();
	                
	                session.beginTransaction();
	                
	                session.createQuery("update student set email=foo@gmail.com").executeUpdate();//another way of updating data base
	                
	                session.getTransaction().commit();
	                
                    session=factory.getCurrentSession();
	                
	                session.beginTransaction();
	                
	                student=session.get(Student.class, 3);
	                
	                session.delete(student);//one way to delete entire row 
	                
	                session.createQuery("delete firstname from student where id=3").executeUpdate();//another way of deleting from data base data base
	                
	                
	                session.close();

}
}