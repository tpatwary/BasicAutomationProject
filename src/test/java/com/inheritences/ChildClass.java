package com.inheritences;

public class ChildClass extends ParentsClass{
  // A--->B ----C Multi Level
	public void getBankAccount() {
		System.out.println("Has a Cash");
	}

	public void getMarried() {
		System.out.println("New wife");
	}

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.getBankAccount(); // Child class C
		obj.getMarried();     // Child class C	
		
		obj.getQAJob();  //Parent class B
		obj.getNewCar(); //Parent class B
		
		obj.getVehicle();  // GrandParentsPropertiies  Class A
		obj.getBusiness(); // GrandParentsPropertiies  Class A
		obj.getHouse();    // GrandParentsPropertiies  Class A

		
	}
}
