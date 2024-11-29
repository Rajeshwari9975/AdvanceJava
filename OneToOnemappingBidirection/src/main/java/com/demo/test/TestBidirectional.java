package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Course;
import com.demo.beans.Student;

public class TestBidirectional {
public static void main(String[] args) {
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session sess = sf.openSession();
	Transaction tr = sess.beginTransaction();
	Course c = new Course();
	Student s = new Student();
	c.setCid(190);
	c.setCname("Python");
	c.setDuration(90);
	s.setSid(130);
	s.setSname("siya");
	s.setLname("vvvv");
	c.setS(s);
	s.setC(c);
	sess.save(c);
	sess.save(s);
	tr.commit();
}
}
