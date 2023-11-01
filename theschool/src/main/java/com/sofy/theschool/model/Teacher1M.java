package com.sofy.theschool.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Teacher1M implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int teacherId;
	private String salary;
	private String teacherName;
	
	public Teacher1M() {
		
	}
	public Teacher1M(int teacherId, String salary, String teacherName) {
		super();
		this.teacherId = teacherId;
		this.salary = salary;
		this.teacherName = teacherName;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	} 
	
	
	

}
