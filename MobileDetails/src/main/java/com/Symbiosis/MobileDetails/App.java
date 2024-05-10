package com.Symbiosis.MobileDetails;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Mobile mb = new Mobile();
    	mb.setId(101);
    	mb.setName("Apple");
    	
       SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
       Session session= factory.getCurrentSession();
       Transaction transaction = session.beginTransaction();
       session.save(mb);
       transaction.commit();
       System.out.println("Done");
       session.close();
       
    }
}
