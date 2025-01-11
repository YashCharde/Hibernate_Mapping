package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	private int stud_id;
	private String name;

	@ManyToMany(mappedBy = "Student")
	private List<Course> Course;

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourse() {
		return Course;
	}

	public void setCourse(List<Course> course) {
		Course = course;
	}

	public Student(int stud_id, String name, List<com.entity.Course> course) {
		super();
		this.stud_id = stud_id;
		this.name = name;
		Course = course;
	}

	public Student() {

	}

	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", name=" + name + ", Course=" + Course + "]";
	}

}
