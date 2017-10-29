package com.jsp.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Vimal
 *
 */
public class Student {
	
	private String rollNo;
	private String name;
	private List<String> subjectList = new ArrayList<>();
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getInfo(){
		return name+" === "+rollNo;
	}
	
	public List<String> getSubjectList() {
		return subjectList;
	}
	
	public void setSubject(String subjectName) {
		subjectList.add(subjectName);
	}
	
	
}

