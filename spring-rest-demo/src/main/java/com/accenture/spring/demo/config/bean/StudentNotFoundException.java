package com.accenture.spring.demo.config.bean;

public class StudentNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StudentNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public StudentNotFoundException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public StudentNotFoundException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	
}
