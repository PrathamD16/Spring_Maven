package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class SessionTest {

	public static void main(String[] args) {

		Student s1=new Student();
		s1.setSt_id(113);
		s1.setSt_name("Sushmita");
		s1.setCourse("Java");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  Student student = (Student) session.get(Student.class, 1);
		  
		  session.getTransaction().commit();
		  session.close();
		  
		  Session session2 = sessionFactory.openSession();
		  session2.beginTransaction();

		  Student student2 = (Student) session2.get(Student.class, 1);

		  session2.getTransaction().commit();
		  session2.close();
		
				
		
				
	}

}
