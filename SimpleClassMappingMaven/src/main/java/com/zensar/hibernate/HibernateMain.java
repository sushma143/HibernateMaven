package com.zensar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.hibernate.entities.Product;



/**
 * @author Sushma Kumari
 * @creation_date 01 Oct 2019 10:35 AM
 * @version 1.0
 * @modification_date 01 Oct 2019 10:38 AM
 * @copyright All rights are reserver by Zensar.
 * @description It is a main class.
 *	
 */
public class HibernateMain 

{
    public static void main( String[] args )
    {
        Configuration c=new Configuration().configure();
        SessionFactory f=c.buildSessionFactory();
        Session s=f.openSession();
        Transaction t=s.beginTransaction();
        
        Product p=new Product();
        
        p.setProductId(1004);
        p.setName("Mobile");
        p.setBrand("Samsung");
        p.setPrice(20000);
        
        s.save(p);
        System.out.println("Product is saved");
       
    
        t.commit();
        s.close();
        
    }
}
