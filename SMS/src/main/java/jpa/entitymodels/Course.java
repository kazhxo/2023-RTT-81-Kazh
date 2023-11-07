package jpa.entitymodels;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course")

public class Course {

	@Id
	@Column(name = "cId")

	private int cId;

	@Column(name = "cName", length = 50, nullable = false)
	private String cName;
	@Column(name = "cInstructorName", length = 50, nullable = false)
	private String cInstructorName;

	

	public Course() {
		this.cId = 1;
		this.cName = "";
		this.cInstructorName = "";
	}

	public Course(int cId, String cName, String cInstructorName) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cInstructorName = cInstructorName;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcInstructorName() {
		return cInstructorName;
	}

	public void setcInstructorName(String cInstructorName) {
		this.cInstructorName = cInstructorName;
	}

}
