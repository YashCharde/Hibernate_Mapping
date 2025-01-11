package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Laptop;
import com.entity.Student;


public class main {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Laptop.class);
		

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Laptop l = new Laptop();
		l.setL_id(1100);
		l.setL_name("asus");
		
		ss.persist(l);
		
		Student s = new Student();
		s.setS_id(1);
		s.setS_name("abhi");
		s.setLaptop(l);
		
		ss.save(s);
		
		tr.commit();
		ss.close();
	}
}