package com.demo.test;

import org.hibernate.cfg.Configuration;

import com.demo.beans.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestStudentMapping {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Student s = new Student("asd1", "vb1n", null, "1sss@dfdd");
		
		session.save(s);
		tr.commit();
		session.close();
		sf.close();

	}

}
