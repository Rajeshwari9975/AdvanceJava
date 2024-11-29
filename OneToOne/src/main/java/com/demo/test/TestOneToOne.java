package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Course;
import com.demo.beans.Student;

public class TestOneToOne {
public static void main(String[] args) {
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session sess = sf.openSession();
	Transaction tf = sess.beginTransaction();
	Course c = new Course(1, "python", 90);
	Student s = new Student(10, "riya", "xxx", c);
	sess.save(c);
	sess.save(s);
	
	tf.commit();
	sess.close();
	
	
}
}
