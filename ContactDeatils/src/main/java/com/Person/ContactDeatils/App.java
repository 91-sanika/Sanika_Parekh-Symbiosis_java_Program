package com.Person.ContactDeatils;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App 
{
    public static void main( String[] args )
    {
    	Person2 p = new Person2();
    	p.setPersonId(76);
    	p.setPersonName("Parekh");
    	
	ConatctDeatils1 c = new ConatctDeatils1();
	c.setConatctId(56);
    c.setContactNum(786454);
	
	ConatctDeatils1 c1 = new ConatctDeatils1();
	c1.setConatctId(57);
    c1.setContactNum(101112);

	ConatctDeatils1 c2 = new ConatctDeatils1();
	c2.setConatctId(58);
    c2.setContactNum(45677);

    List<ConatctDeatils1> co= new ArrayList<ConatctDeatils1>();
	co.add(c);
	co.add(c1);
	co.add(c2);
   	
  	c.setPerson(p);
	c1.setPerson(p);
   	c2.setPerson(p);   	
    p.setCo(co);   	
     	
    	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory() ;
        Session session = factory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
    	
        Query q = session.createQuery("FROM ConatctDeatils1", ConatctDeatils1.class);
        List<ConatctDeatils1> list= q.list();

        for (ConatctDeatils1 con : list) {
            System.out.println(con.getContactNum());
        }
    	
        
     session.save(c);
	 session.save(c1);
     session.save(c2);
     session.save(p);
     System.out.println("Done");
     transaction.commit();
   	
    session.close();
    factory.close();
        
    }
}
