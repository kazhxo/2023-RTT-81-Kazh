package jpa.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class CourseService implements CourseDAO{

	@Override
	public List<Course> getAllCourses(){

		try(SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession()){
			String hql= "FROM Course";
			Query<Course> query = session.createQuery(hql, Course.class);
			return query.list();
			
		 } catch (Exception e) {
	            e.printStackTrace(); 
	            return null;
	        }
			
		
		
		
		
	}

}
