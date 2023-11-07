package com.sofy.SMS.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jpa.service.StudentService;

public class StudentServiceTest {

	@Test
	public void testValidateStudent() {
		StudentService studentService = new StudentService();

		// Test case 1: Valid student
		assertTrue(studentService.validateStudent("tzsd@email.com", "pass"));

		// Test case 2(wrong password)
		assertFalse(studentService.validateStudent("testing@email.com", "wrong"));

		// Test case 3 (non-existing email)
		assertFalse(studentService.validateStudent("wrong@email.com", "123"));
	}
}
