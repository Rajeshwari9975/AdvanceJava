package com.demo.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Department;

public class DeptDaoImpl implements DeptDao{
   static SessionFactory sf;
   static {
	   sf=HibernateUtil.getMyConnection();
   }
@Override
public void saveDepartment(Department d) {
	Session sess=sf.openSession();
	Transaction tr=sess.beginTransaction();
	sess.save(d);
	tr.commit();
	sess.close();
	
}
@Override
public void modifyDept(Department d) {
	Session session = sf.openSession();
	Transaction tr = session.beginTransaction();
	Department d1 = session.get(Department.class, d.getDeptid());
	if(d1 != null) {
		d1.setDloc(d.getDloc());
		d1.setDname(d.getDname());
	}
	session.save(d1);
	tr.commit();
}
@Override
public void deleteByDeptId(int did) {
	Session session = sf.openSession();
	Transaction tr = session.beginTransaction();
	Department d1 = session.get(Department.class, did);
	if(d1 != null) {
		session.delete(d1);
	}
	
	tr.commit();
}
@Override
public Department findById(int did) {
	Session session = sf.openSession();
	Transaction tr = session.beginTransaction();
	Department d1 = session.get(Department.class, did);
	tr.commit();
	return d1;
}
@Override
public List<Department> findAll() {
	Session session = sf.openSession();
	Transaction tr = session.beginTransaction();
	Query query = session.createQuery("from Department");
	List<Department> dlist =  query.getResultList();
	tr.commit();
	return dlist;

}
@Override
public List<Department> sortByName() {
	Session session = sf.openSession();
	Transaction tr = session.beginTransaction();
	Query query = session.createQuery("from Department d order by d.dname");
	List<Department> dlst =  query.getResultList();
	tr.commit();
	return dlst;
}
}
