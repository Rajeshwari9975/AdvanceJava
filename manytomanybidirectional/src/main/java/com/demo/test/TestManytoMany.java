package com.demo.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Course;
import com.demo.beans.Student;

public class TestManytoMany {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tr = sess.beginTransaction();
		Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();
		Student s4= new Student();
		Course c1 = new Course();
		Course c2 = new Course();
		Course c3 = new Course();
		Course c4 = new Course();
		s1.setSid(10);
		s1.setSname("xxx");
		s1.setLname("yyyy");
		c1.setCid(34);
		c1.setCname("c++");
		c1.setDuration(89);
		
		s2.setSid(11);
		s2.setSname("xxx");
		s2.setLname("yyyy");
		c2.setCid(35);
		c2.setCname("Python");
		c2.setDuration(89);
		
		s3.setSid(12);
		s3.setSname("xxx");
		s3.setLname("yyyy");
		c3.setCid(36);
		c3.setCname("react");
		c3.setDuration(89);
		
		s4.setSid(13);
		s4.setSname("xxx");
		s4.setLname("yyyy");
		c4.setCid(37);
		c4.setCname("sql");
		c4.setDuration(89);
		List<Course> clist1= new ArrayList<Course>();
		List<Course> clist2= new ArrayList<Course>();
		List<Course> clist3= new ArrayList<Course>();
		List<Course> clist4= new ArrayList<Course>();
		
		List<Student> slist1 = new ArrayList<Student>();
		List<Student> slist2 = new ArrayList<Student>();
		List<Student> slist3 = new ArrayList<Student>();
		List<Student> slist4 = new ArrayList<Student>();
		
		clist1.add(c1);
		clist1.add(c2);
		clist2.add(c3);
		clist2.add(c4);
		clist3.add(c3);
		clist3.add(c1);
		
		
		
		slist1.add(s1);
		slist1.add(s2);
		slist1.add(s4);
		slist2.add(s1);
		slist2.add(s2);
		slist3.add(s3);
		slist3.add(s4);
		slist4.add(s3);
		
		s1.setC(clist1);
		s2.setC(clist1);
		s3.setC(clist2);
		s4.setC(clist3);
		
		c1.setS(slist1);
		c2.setS(slist2);
		c3.setS(slist3);
		c4.setS(slist4);
		
		sess.save(s1);
		sess.save(s2);
		sess.save(s3);
		sess.save(s4);
		
		sess.save(c1);
		sess.save(c2);
		sess.save(c3);
		sess.save(c4);
		tr.commit();
		
	}

}
