package com.student.dao;

import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.student.beans.Course;
import com.student.beans.Student;

public class StudentDaoImpl implements StudentDao{

	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session session = sf.openSession();
	Transaction tr = session.beginTransaction();
	
	@Override
	public void save(Student s) {
		
		session.save(s);
		tr.commit();
		session.close();
		sf.close();
	}

	@Override
	public void save(Course c) {
		//Transaction tr1 = session.beginTransaction();
		Course c1 = session.get(Course.class, c.getCid());
		if(c1 == null) {
			session.save(c);
		}
		
	}

	@Override
	public Set<Student> getStudents() {
		
		return null;
	}

}
