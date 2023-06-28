package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.*;

public class TestMyUserObject {
		public static void main(String[] args) {
		
			
			MyUser u1=new MyUser(24,"Arjun","akq@jskdf");
			
			
				SessionFactory sf = new Configuration().configure().buildSessionFactory();
				
				Session sess = sf.openSession();
				
				Transaction tr = sess.beginTransaction();
				sess.save(u1);
				tr.commit();
				System.out.println(u1);
				sess.close();
				
				
				sf.close();
				
			
			
			
		
		
		
		
	}
}