package jpa.SMS;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;

public class SMSRunner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StudentService studentService = new StudentService();
		CourseService courseService = new CourseService();
		
		System.out.println("Are you a student? (1), Quit (2) ");
		int userChoice = scan.nextInt();
		if (userChoice == 1) {
			System.out.println("Enter your student email ");
			String email = scan.next();
			System.out.println("Enter your password ");
			String password = scan.next();

			

            if (studentService.validateStudent(email, password)) {
                Student student = studentService.getStudentByEmail(email);
                Set<Student> registeredCourses = studentService.getStudentCourses(email);

                System.out.println("Welcome, " + student.getsName() );
                System.out.println("Your registered courses: " + registeredCourses);

                System.out.println("1. Register for a new course");
                System.out.println("2. Exit");
                int choice = scan.nextInt();
				
			
            if (choice == 1) {
                System.out.println("Enter the course Id you want to register for: ");
                int courseId = scan.nextInt();
                if (studentService.registerStudentToCourse(email, courseId)) {
                    System.out.println("Registration successful!");
                } else {
                    System.out.println("Course registration failed. Please try again.");
               
            } }else if (choice == 2) {
                System.out.println("Logout successful. Goodbye!");
            

		} else {
			System.out.println("Session terminated by user");
		}

	}

	}
	}
}
