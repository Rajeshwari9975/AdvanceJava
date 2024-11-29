package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Department;
import com.demo.dao.DeptDao;
import com.demo.dao.DeptDaoImpl;

public class DeptServiceImpl implements DeptService{
   DeptDao ddao;

public DeptServiceImpl() {
	super();
	this.ddao = new DeptDaoImpl();
}

@Override
public void addnewDepartment() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr deptid");
	int deptid=sc.nextInt();
	System.out.println("enetr dname");
	String dnm=sc.next();
	System.out.println("enetr location");
	String dloc=sc.next();
	Department d=new Department(deptid,dnm,dloc,null);
	ddao.saveDepartment(d);
}

@Override
public void modifyDept(Department d) {
	ddao.modifyDept(d);
}

@Override
public void deleteDept(int did) {
	ddao.deleteByDeptId(did);
}

@Override
public Department findById(int did) {
	return ddao.findById(did);
}

@Override
public List<Department> findAll() {
	return ddao.findAll();
}

@Override
public List<Department> sortByName() {
	return ddao.sortByName();
}
   
}
