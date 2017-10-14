package com.corejava.collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetDemoMain {
	public static void main(String[]args){
		Set<String> s = new HashSet<>();

		s.add("Ravi");
		s.add("Vimal");
		s.add("Harshal");
		s.add("Ravi");

		Set<Student> s1 = new HashSet<Student>();

		Student a1 = new  Student(1);
		Student a2 = new  Student(2);
		Student a3 = new  Student(1);

		s1.add(a1);
		s1.add(a2);
		s1.add(a3);		
		
		System.out.println("S size: "+s.size());
		System.out.println("S1 size: "+s1.size());
	}
}





class Student {
	Integer studentId;
	
	Student(Integer sId){
		studentId = sId;
	}
	@Override
	public  boolean equals(Object obj){
		Student studentObj = null;
		if(obj instanceof Student)
			studentObj = (Student) obj;
		
		if(this.studentId.equals(studentObj.studentId))
			return true;
		else 
			return false;
	}
	
	@Override
	public  int  hashCode(){
		
		return  studentId.hashCode();
		
	}
}
