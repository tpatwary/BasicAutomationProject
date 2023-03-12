package com.polymorepyshms;

public class MethodOverdingTest extends MethodsOveriding {

	public void employeeName(String name) {
		name = "Fatima Begum ";
		System.out.println("Employee Name is : " + name);
	}

	public static void main(String[] args) {
		MethodOverdingTest obj = new MethodOverdingTest();
		obj.employeeName("");
		obj.employeeName(2000);
	}
}