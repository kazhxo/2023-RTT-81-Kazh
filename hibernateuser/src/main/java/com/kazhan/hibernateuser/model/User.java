package com.kazhan.hibernateuser.model;

import java.lang.invoke.ClassSpecializer.Factory;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.util.HibernateUtil;

//THIS IS A POJO/MODEL CLASS, NEEDS COSNTRUCTOR
//import from jakarta
//all annotations above a field refer to that field


@NamedQueries({
	@NamedQuery(name= "myUpdateuser", query= "UPDATE User SET fullName= :fullname WHERE id = :id")
})
@Entity
@Table(name="users")
public class User {
	
	//instance variables, for id use object class
	
	
	//START NOTE
	//column name for id will be "user_id"
	@Column(name="user_id")
	//@Id= primary key 
	@Id
	//IDENTITY automatically assigns primary key
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	//END NOTE
	
	
	private String fullname;
	private String email;
	private String password;
	private int age;
	private double salary; 
	private String city; 
	
	//empty constructor
	
	public User(){
		this.age=0;
		this.fullname="";
		this.email="";
		this.password="";
		this.salary=0.0;
		this.city="";
		
	}

	public User(String fullname, String email, String password, int age, double salary, String city) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.age = age;
		this.salary = salary;
		this.city = city;
	}
	
	public void updateUser() {
		Session session= HibernateUtil.getConnection();
		Transaction t= session.beginTransaction();
		
		TypedQuery<?> query= session.getNamedQuery("updateMyUser");
		
		query.setParameter("fullname", "Kazhan Sofy");
		query.setParameter("id", 2);
		
		int rowsAffected= query.executeUpdate();
		
		System.out.println(rowsAffected + " rows were affected");
		
		t.commit();
		System.out.println("Successfully updated user");
		
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

	@Override
	public String toString() {
		return "User [id=" + id + ", fullname=" + fullname + ", email=" + email + ", password=" + password + ", age="
				+ age + ", salary=" + salary + ", city=" + city + "]";
	}
	
	
	

}
