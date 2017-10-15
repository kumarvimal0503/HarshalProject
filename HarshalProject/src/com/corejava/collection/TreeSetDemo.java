package com.corejava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[]args) {
		
		
		Set<Integer> numberSet = new TreeSet<>();
		
		numberSet.add(23);
		numberSet.add(22);
		numberSet.add(21);
		numberSet.add(22);
		numberSet.add(24);
		
		for (Integer number : numberSet) {
			System.out.println(number);
		}
		
		Set<Employee> employeeSet = new TreeSet<>();
		
		employeeSet.add(new Employee("1001", "Aditya"));
		employeeSet.add(new Employee("1002", "Hemraj"));
		employeeSet.add(new Employee("1003", "Aashu"));
		employeeSet.add(new Employee("1004", "Binod"));
		
		for (Employee employee : employeeSet) {
			System.out.println(employee);
		}
		
		System.out.println("========================================");
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee("1001", "Abhinav"));
		employees.add(new Employee("1002", "Nilesh"));
		employees.add(new Employee("1003", "Mandar"));
		employees.add(new Employee("1004", "Himanshu"));
		
		Collections.sort(employees);
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		
		List<Employee1> employeeList = new ArrayList<>();
		
		employeeList.add(new Employee1("1001", "Mahesh"));
		employeeList.add(new Employee1("1002", "Amit"));
		employeeList.add(new Employee1("1003", "Lokesh"));
		employeeList.add(new Employee1("1004", "Pappu"));
		
		Collections.sort(employeeList, (emp1,emp2) -> {
			if(emp1.empName.compareTo(emp2.empName) < 0){
				return -1;
			} else if(emp1.empName.compareTo(emp2.empName) > 0){
				return 1;
			} else {
				return 0;
			}
		});
		
		for (Employee1 employee : employeeList) {
			System.out.println(employee);
		}
		
	}
}

class Employee implements Comparable<Employee>{
	String empId;
	String empName;
	public Employee(String empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	public int compareTo(Employee emp){
		if(this.empName.compareTo(emp.empName) < 0){
			return -1;
		} else if(this.empName.compareTo(emp.empName) > 0){
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
}

class Employee1 {
	String empId;
	String empName;
	public Employee1(String empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
}

class TempCmparator implements Comparator<Employee1>{
	public int compare(Employee1 emp1, Employee1 emp2){
		if(emp1.empName.compareTo(emp2.empName) < 0){
			return -1;
		} else if(emp1.empName.compareTo(emp2.empName) > 0){
			return 1;
		} else {
			return 0;
		}
	}
}
