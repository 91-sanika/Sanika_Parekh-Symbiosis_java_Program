package com.Person.AdharDeatils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Person1 p = new Person1();
    	p.setPersonId(61);
    	p.setPersonName("Sharda");
    	p.setPersonCity("Belgaum");
    	
    	AdharDeatils1 a = new AdharDeatils1();
    	a.setAdharId(81);
    	a.setAdharNum(9876);
    	
    	p.setAdhar(a);
    	a.setPerson1(p);
    	
    	
    	
     //  SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//      Session session =  factory.getCurrentSession();
//      Transaction transaction = session.beginTransaction();
//      session.save(p);
//      session.save(a);
//      System.out.println("Done");
//      transaction.commit();
//      session.close();
       
       SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
      	Session session = factory.openSession();
      	
      	//first - level cache 
      	
      	//fetch the database 
      	Person1 person = session.get(Person1.class,61);
      	System.out.println(person.getPersonName());
      	
      //direct cache fetch
      	System.out.println(person.getPersonName());
      	session.close();
      	
      	//using another session it fetch the database
      	Session session2 = factory.openSession();
      	Person1 person1 = session2.get(Person1.class, 61);
      	System.out.println(person1.getPersonName());
      	session.close();
      	factory.close();
    }
}
