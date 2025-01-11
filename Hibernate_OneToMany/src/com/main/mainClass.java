package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Department;
import com.entity.Employee;

public class mainClass {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Department.class);
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Department d = new Department();
		d.setD_id(11);
		d.setD_name("java Developer");
		
		ss.save(d);
		
		Employee e1 = new Employee();
		e1.setE_id(111);
		e1.setName("mohit");
		e1.setDept(d);
		
		ss.save(e1);
		
		
		Employee e2 = new Employee();
		e2.setE_id(112);
		e2.setName("suraj");
		e2.setDept(d);
		
		ss.save(e2);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		
		d.setEmp(list);
		
		tr.commit();
		ss.close();
		
	}
}
