package com.demo.service;

import java.util.List;

import com.demo.beans.Department;

public interface DeptService {

	void addnewDepartment();

	void modifyDept(Department d);

	void deleteDept(int did);

	Department findById(int did);

	List<Department> findAll();

	List<Department> sortByName();

}
