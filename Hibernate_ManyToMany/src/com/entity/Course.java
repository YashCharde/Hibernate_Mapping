package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {
	@Id
	private int cour_id;
	private String name;

	@ManyToMany
	@JoinTable(
	        name = "Student_Course",  // Name of the join table
	        joinColumns = @JoinColumn(name = "stud_id"),  // Foreign key column for the Student entity
	        inverseJoinColumns = @JoinColumn(name = "cour_id")  // Foreign key column for the Course entity
	    )
	private List<Student> Student;

	public int getCour_id() {
		return cour_id;
	}

	public void setCour_id(int cour_id) {
		this.cour_id = cour_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudent() {
		return Student;
	}

	public void setStudent(List<Student> student) {
		Student = student;
	}

	public Course(int cour_id, String name, List<com.entity.Student> student) {
		super();
		this.cour_id = cour_id;
		this.name = name;
		Student = student;
	}

	public Course() {

	}

	@Override
	public String toString() {
		return "Course [cour_id=" + cour_id + ", name=" + name + ", Student=" + Student + "]";
	}
	
	

	
}
