package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;
import com.demo.beans.Student;

public class TestEmbedded {
	
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Address addr = new Address(411016, "Pune", "India");
		Student s = new Student("Nihal", addr);
		
		session.save(s);
		tr.commit();
		session.close();
		sf.close();
	}

}
