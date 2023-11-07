package jpa.dao;

import java.util.List;
import java.util.Set;

import jpa.entitymodels.Student;

public interface StudentDAO {

	

	List<Student> getAllStudents();

	Student getStudentByEmail(String sEmail);

	boolean validateStudent(String sEmail, String sPassword);

	boolean registerStudentToCourse(String sEmail, int cId);

	Set<Student> getStudentCourses(String sEmail);



}
