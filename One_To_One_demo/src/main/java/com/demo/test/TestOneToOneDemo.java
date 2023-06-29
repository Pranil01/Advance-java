package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;
import com.demo.beans.Student;
public class TestOneToOneDemo {
	
	
	public static void main (String[]args) {
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Address a1=new Address(124,"baner","Pune");
		Student S1=new Student(213,"Aditya",a1);
		
		Session sess = sf.openSession();
		Transaction tr= sess.beginTransaction();
//		sess.save(S1);
//		sess.save(a1);
//		
		
		 tr.commit();
		 
			
			   Transaction tr1=sess.beginTransaction(); //
			  System.out.println("before"); 
			  Student s=sess.load(Student.class, 214); //
			  System.out.println("after"); 
			  System.out.println(s.getName()); //
			  System.out.println(s.getAddr()); // // 
			  tr1.commit();
			 		 sess.close();
		 sf.close();
		 
		
	}

}
