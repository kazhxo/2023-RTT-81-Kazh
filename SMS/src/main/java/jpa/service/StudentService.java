package jpa.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentService implements StudentDAO {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			return configuration.buildSessionFactory();
		} catch (Throwable ex) {
			// Log the exception, throw an error, or handle it in your application
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	EntityManagerFactory entityManagerFactory = getSessionFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();



	@Override
	public boolean validateStudent(String sEmail, String sPassword) {

		Student student = getStudentByEmail(sEmail);
		return student != null && student.getsPass().equals(sPassword);

	}

	@Override
	public boolean registerStudentToCourse(String sEmail, int cId) {
	    try {
	        entityManager.getTransaction().begin();

	        // Retrieve the student and course objects from the database
	        Student student = entityManager.find(Student.class, sEmail);
	        Course course = entityManager.find(Course.class, cId);

	        // Check if both student and course exist in the database
	        if (student != null && course != null) {
	            // Check if the student is not already registered for the course
	            if (!student.getsCourses().contains(course)) {
	                // Add the course to the student's courses and update the database
	                student.addCourse(course);
	                entityManager.merge(student);
	            } else {
	                // Student is already registered for the course
	                System.out.println("You are already registered in that course!");
	                return false;
	            }
	        } else {
	            // Student or course not found in the database
	            System.out.println("Student or course not found.");
	            return false;
	        }

	        entityManager.getTransaction().commit();
	        return true;
	    } catch (Exception e) {
	        entityManager.getTransaction().rollback();
	        e.printStackTrace();
	        return false;
	    } finally {
	        entityManager.close();
	    }
	}
	@Override
	public Set<Student> getStudentCourses(String sEmail) {
		Student student = getStudentByEmail(sEmail);
		if (student != null) {
			return student.getsCourses();
		}
		return null;

	}

	@Override
	public Student getStudentByEmail(String sEmail) {
		return entityManager.find(Student.class, sEmail);
	}

	@Override
	public List<Student> getAllStudents() {
		Query query = (Query) entityManager.createQuery("SELECT s FROM Student");
		return query.getResultList();
	}

}