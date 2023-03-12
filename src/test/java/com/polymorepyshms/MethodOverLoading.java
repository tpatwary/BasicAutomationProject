package com.polymorepyshms;

public class MethodOverLoading {
	
	
    public void employeeName(String name) {
    	System.out.println("Employee Name is : "+name);
    }
    
    public void employeeName(String des, int salary) {
    	System.out.println("Employee des : "+des +" & Employee salary is : "+ salary);
    }
     
    public void employeeName(int age, String addrress, String ssn, int phone) {
    	
    }
    
    public void employeeName(int bonus) {
    	
    }
    
    public static void main(String[] args) {
    	MethodOverLoading obj = new MethodOverLoading();
    	obj.employeeName("QA ", 8000);
    	obj.employeeName("Mohammed Alam ");

	}
    
    
}
