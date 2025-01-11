package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Employee {
	@Id
	private int e_id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "Emp_Dept_id")
	private Department dept;

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Employee(int e_id, String name, Department dept) {
		super();
		this.e_id = e_id;
		this.name = name;
		this.dept = dept;
	}

	public Employee() {

	}

	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", name=" + name + ", dept=" + dept + "]";
	} 
   
	
	

}
