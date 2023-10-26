package com.sofy.hib.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * POJO (Plain Old Java Object)
class with some class variables, getter and 
setter methods, and its constructors.
 */

//@Entity annotation specifies that the class is an entity
@Entity

//@Table maps the entity with the table. 
//If no @Table is defined, the default value is used: the class name of the entity
@Table(name="USER")
public class User {
	
	//● @Column maps the entity's/class field to the table's column. If @Column is omitted,
	//the default value is used: the field name of the entity.
	@Column(name="USER_ID")
	
	//● @Id declares the identifier property of the entity.

	@Id
	//autoincrement primary key 
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	private String fullname;
	private String email;
	private String password;
	private int age;
	private double salary;
	private String city;

	public User(String fullname, String email, String password, int age, double salary, String city) {
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.age = age;
		this.salary = salary;
		this.city = city;
	}

	public User() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;

	}



	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
