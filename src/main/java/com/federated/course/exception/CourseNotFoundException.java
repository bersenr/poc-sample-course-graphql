package com.federated.course.exception;

public class CourseNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public CourseNotFoundException(String message) {
		super(message);
	}
}
