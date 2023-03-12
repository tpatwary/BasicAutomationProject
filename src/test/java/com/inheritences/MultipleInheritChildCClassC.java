package com.inheritences;

public class MultipleInheritChildCClassC implements MultipleInheritClassA, MultipleInheritClassB{

	public void getInfo() {
		System.out.println("Interface B");  
		
	}

	public void getDepertment() {
		System.out.println("Interface B");  		
	}

	public void getEmployees() {
		System.out.println("Interface A");  		
	}

	public void getSalary() {
		System.out.println("Interface A");  
		
	}
	public static void main(String[] args) {
		MultipleInheritChildCClassC obj = new MultipleInheritChildCClassC();
		obj.getDepertment();
		obj.getEmployees();
		obj.getInfo();
		obj.getSalary();
	}
	
	

}
