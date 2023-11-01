
package com.test.hib.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	
	@Column(name="USER_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	

	private int id;
	private String name;
	private String state;
	
	
	
	
	public Department() {
		super();
	}

	public Department(String name, String state) {
		super();
		this.name = name;
		this.state = state;
	}

	public Department(int id, String name, String state) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "DepartmentServices [id=" + id + ", name=" + name + ", state=" + state + "]";
	}
	
	

}
