package com.HibernateTesting.HibernateTesting;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student s=new Student();
    	//s.setSid(102);
    	//s.setSname("satya");
    	//s.setColour("yellow");
    	
    	Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class);
    	
    	SessionFactory sf=cfg.buildSessionFactory();
    	
    	Session session=sf.openSession();
    	Transaction tx=session.beginTransaction();
    	//s=(Student)session.get(Student.class, 102);
    	//session.save(s);
    	tx.commit();
    	System.out.println(s);
    }
}
