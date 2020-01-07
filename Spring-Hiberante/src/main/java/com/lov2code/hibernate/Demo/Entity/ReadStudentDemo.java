package com.lov2code.hibernate.Demo.Entity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class ReadStudentDemo {
	
	public static void main(String args[])
	{
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		//create a session for saving a student object
		Session session=factory.getCurrentSession();
		
		                //begin a transaction      
		                session.beginTransaction();
		                
		                //create a student object
		                Student student=session.get(Student.class, 3);//this is the way to read object from java class where 3 is the primary key
		                
		                System.out.println(student);
		                
		                //save the object
		                session.save(student);
		                
		                //commit the transaction 
		                session.getTransaction().commit();
		                session.close();
	}

}
