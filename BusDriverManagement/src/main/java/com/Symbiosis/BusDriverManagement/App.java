package com.Symbiosis.BusDriverManagement;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Bus b = new Bus();
        b.setBus_id(2);
        b.setBus_name("Satara-Pandharpur");
        
        Bus b1 = new Bus();
        b1.setBus_id(3);
        b1.setBus_name("Pandharpur- Belgaum");
        
        BusDriver bd = new BusDriver();
        bd.setBusDriver_id(103);
        bd.setBusDriver_name("ABC");
        
        BusDriver bd1 = new BusDriver();
        bd1.setBusDriver_id(104);
        bd1.setBusDriver_name("XYZ");
        
        List<Bus> bu = new ArrayList<Bus>();
        bu.add(b);
        bu.add(b1);
        
        List<BusDriver> busd = new ArrayList<BusDriver>();
        busd.add(bd1);
        busd.add(bd);
        
       b.setBusDriver(busd);
       b1.setBusDriver(busd);
       
       bd.setBus(bu);
      bd1.setBus(bu);
       
   SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
   Session session = factory.getCurrentSession();
   Transaction transaction = session.beginTransaction();
  session.save(b);
   session.save(b1);
   session.save(bd);
   session.save(bd1);
   System.out.println("Done");
   transaction.commit();
   session.close();
   factory.close();
   	//Session session = factory.openSession();
   	
   	//Fetch the name or data
   	//Bus b = session.get(Bus.class, 1);
   //System.out.println(b.getBus_name());
   	
   	//HQL part
   //	Query q = session.createQuery("From BusDriver");
   	//List <BusDriver> list = q.list();
   	   		
  //for(BusDriver c :list) {
//  	System.out.println(c.getBusDriver_name());
	//  }
   	
   	
   	//Data insertion from user
   	/*Scanner sc = new Scanner(System.in);
   	System.out.println("Enter id");
   	int var = sc.nextInt();
   	Query q = session.createQuery("From Bus where id= :ch");
   	q.setParameter("ch", var);
   	List<Bus> b = q.list();
   	for(Bus bs : b) {
   		System.out.println(bs.getBus_name());*/
   		
   	
   		//Delete the data
  /*    SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
       Session session = factory.openSession();
       	Transaction transaction = session.beginTransaction();
       	int ch =52;
       	Query q = session.createQuery("delete from Bus where Bus_id= :ids");
       	q.setParameter("ids", ch);
       	q.executeUpdate();
       	transaction.commit();
       	System.out.println("Deleted");
       	session.close();
       	factory.close();*/
     
   	//update the data
      /*SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
       Query q = session.createQuery("update Bus set Bus_name= :b where Bus_id= :d");
       q.setParameter("b", "Satara-Sangali");
       q.setParameter("d", "52");
       q.executeUpdate();
       transaction.commit();
   	System.out.println("updated");
   	session.close();
   	factory.close();*/
    }
}
