package com.corejava.io;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	public Student(String rollNo, String name) {
		super();
		this.name = name;
	}
}
