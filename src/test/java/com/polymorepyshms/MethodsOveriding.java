package com.polymorepyshms;

public class MethodsOveriding {

	public void employeeName(String name) {
		name = "Trisha Muhona ";
		System.out.println("Employee Name is : " + name);
	}

    public void employeeName(int bonus) {
    	System.out.println("Performance bonus : "+ bonus);
    }
}
