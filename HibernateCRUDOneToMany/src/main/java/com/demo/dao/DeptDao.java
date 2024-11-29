package com.demo.dao;

import java.util.List;

import com.demo.beans.Department;

public interface DeptDao {

	void saveDepartment(Department d);

	void modifyDept(Department d);

	void deleteByDeptId(int did);

	Department findById(int did);

	List<Department> findAll();

	List<Department> sortByName();

}
