package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Id
   private int s_id;
   private String s_name;
   
   @OneToOne
   private Laptop Laptop;
   
   

public Student() {
	
}

public Student(int s_id, String s_name, com.entity.Laptop laptop) {
	super();
	this.s_id = s_id;
	this.s_name = s_name;
	Laptop = laptop;
}

public int getS_id() {
	return s_id;
}

public void setS_id(int s_id) {
	this.s_id = s_id;
}

public String getS_name() {
	return s_name;
}

public void setS_name(String s_name) {
	this.s_name = s_name;
}

public Laptop getLaptop() {
	return Laptop;
}

public void setLaptop(Laptop laptop) {
	Laptop = laptop;
}

@Override
public String toString() {
	return "Student [s_id=" + s_id + ", s_name=" + s_name + ", Laptop=" + Laptop + "]";
}


   
   
}
