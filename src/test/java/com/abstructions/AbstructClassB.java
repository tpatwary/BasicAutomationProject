package com.abstructions;

public  class AbstructClassB extends AbstructClassA{

	@Override
	public void getSalarya() {
		System.out.println("AbstructClassA property");
		
	}

	@Override
	public void getSalary() {
		System.out.println("AbstructClassA property");
		
	}

	@Override
	public void getSalaryd() {
		System.out.println("AbstructClassA property");
		
	}

	public static void main(String[] args) {
		AbstructClassB obj = new AbstructClassB();
		obj.getSalary();  
		obj.getHouse();
	}
	    
}

