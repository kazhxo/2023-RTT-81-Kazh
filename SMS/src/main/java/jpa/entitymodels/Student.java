package jpa.entitymodels;

import javax.persistence.JoinColumn;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@Column(name = "email", length = 50)

	private String sEmail;

	@Column(name = "name", length = 50, nullable = false)
	private String sName;

	@Column(name = "password", length = 50, nullable = false)
	private String sPass;

	 @ManyToMany(cascade = CascadeType.ALL)
	    @JoinTable(
	            name = "Student_Course",
	            joinColumns = {@JoinColumn(name = "sEmail")}, // specify the actual column name in the database
	            inverseJoinColumns = {@JoinColumn(name = "cId")} // specify the actual column name in the database
	    )
	    private Set<Course> sCourses = new HashSet<>();

	public Student() {
		this.sEmail = "";
		this.sName = "";
		this.sPass = "";
		this.sCourses = null;
	}

	public Student(String sEmail, String sName, String sPass, Set sCourses) {
		super();
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPass = sPass;
		this.sCourses = sCourses;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsPass() {
		return sPass;
	}

	public void setsPass(String sPass) {
		this.sPass = sPass;
	}

	public Set getsCourses() {
		return sCourses;
	}

	public void setsCourses(Set sCourses) {
		this.sCourses = sCourses;
	}

	

	public void addCourse(Course course) {
		this.sCourses.add(course);
	}

}
