package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Course;
import com.entity.Student;

public class mainClass {
   public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Student.class);
	cfg.addAnnotatedClass(Course.class);
	
	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();

	
	Course courses1 = new Course();
	courses1.setCour_id(1);
	courses1.setName("Java Programming");
	
	Course courses2 = new Course();
	courses2.setCour_id(2);
	courses2.setName("Python Programming");
	
	Student stud1 = new Student();
	stud1.setStud_id(101);
	stud1.setName("Sarvesh");
	
	Student stud2 = new Student();
	stud2.setStud_id(102);
	stud2.setName("Mahesh");
	
	// Adding courses to students
	List<Course> s1 = new ArrayList<>();
	s1.add(courses1);
	s1.add(courses2);
	
	List<Course> s2 = new ArrayList<>();
	s2.add(courses1);
	
	stud1.setCourse(s1);
	stud2.setCourse(s2);
	
	// Adding students to courses
	List<Student> c1 = new ArrayList<>();
	c1.add(stud1);
	c1.add(stud2);
	
	List<Student> c2 = new ArrayList<>();
	c2.add(stud1);
	
	
	courses1.setStudent(c1);
	courses2.setStudent(c2);
	
	ss.save(courses1);
	ss.save(courses2);
	ss.save(stud1);
	ss.save(stud2);
	
	tr.commit();
	ss.close();
	

}
}
