package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Department;
import com.demo.beans.Employee;
import com.demo.service.DeptService;
import com.demo.service.DeptServiceImpl;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestCRUDOneToMany {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpl();
		DeptService dservice=new DeptServiceImpl();
		int choice=0;
		do {
		System.out.println("1. Add new Employee\n2. Add new Department\n");
		System.out.println("3. delete employee\n4. delete Department\n");
		System.out.println("5. modify employee\n6. modify Department\n");
		System.out.println("7. display  employee by id\n8. display Department by id\n");
		System.out.println("9. display all employee\n10. display all Department\n");
		System.out.println("11. display all employee in sorted order\n12.Sort Dept By name\n13. exit\nchoice :");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			eservice.addnewEmployee();
			
			break;
		case 2:
			dservice.addnewDepartment();
			break;
		case 3:
			System.out.println("enetr id");
			int eid=sc.nextInt();
			boolean status=eservice.deleteById(eid);
			if(status) {
				System.out.println("deleted successfully");
			}else {
				System.out.println("not found");
			}
			break;
		case 4:
			System.out.println("Enter Dept ID to be Deleted");
			int did = sc.nextInt();
			dservice.deleteDept(did);
			break;
		case 5:
			System.out.println("eneter id");
			eid=sc.nextInt();
			System.out.println("enetr name");
			String name=sc.next();
			System.out.println("enetr sal");
			double sal=sc.nextDouble();
			System.out.println("enetr deptid");
			int deptid=sc.nextInt();
			status=eservice.modifyById(eid,name,sal,deptid);
			if(status) {
				System.out.println("updated successfully");
			}else {
				System.out.println("not found");
			}
			break;
		case 6:
			System.out.println("Enter deptid");
		    deptid = sc.nextInt();
		    System.out.println("Enter deptname");
		    String dname = sc.next();
		    System.out.println("Enter location");
		    String dloc = sc.next();
		    Department d = new Department(deptid, dname, dloc, null);
		    dservice.modifyDept(d);
			break;
		case 7:
			System.out.println("eneter id");
			eid=sc.nextInt();
			Employee e=eservice.findById(eid);
			if(e!=null) {
				System.out.println(e);
			}else {
				System.out.println("not found");
			}
			
			break;
		case 8:
			System.out.println("Enter Dept ID");
			did = sc.nextInt();
			Department d1 = dservice.findById(did);
			System.out.println("Dept ID: "+d1.getDeptid());
			System.out.println("Dept Name: "+d1.getDname());
			System.out.println("Dept Location: "+d1.getDloc());
			System.out.println(d1.getElist());
			break;
		case 9:
			List<Employee> elist=eservice.findAll();
			elist.forEach(System.out::println);
			break;
		case 10:
			List<Department> dlist = dservice.findAll();
			dlist.forEach(System.out::println);
			break;
		case 11:
			elist=eservice.sortBySal();
			elist.forEach(System.out::println);
			break;
		case 12:
			List<Department> dlst = dservice.sortByName();
			dlst.forEach(System.out::println);
			break;
		case 13:
			System.out.println("Thank you for Visiting......");
			sc.close();
			eservice.closeSessionFactory();
			break;
		default:
			System.out.println("wrong choice");
			break;
			
		}
		}while(choice!=13);
	}

}
