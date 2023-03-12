package com.encapsulations;

public class EncapsulationOne {

	private String name = "Sajib";
	private String designation = "QA Automation Engineer";
	private int salary = 100000;

	public String getName() {
		System.out.println("Employee Name : " + name);
		return name;
	}

	private String getDesignation() {
		System.out.println("Employee designation : " + designation);
		return designation;
	}

	private int getSalary() {
		System.out.println("Employee Salary : " + salary);
		return salary;
	}

	public static void main(String[] args) {
		EncapsulationOne obj = new EncapsulationOne();
		obj.getName();
		obj.getDesignation();
		obj.getSalary();
	}

}
