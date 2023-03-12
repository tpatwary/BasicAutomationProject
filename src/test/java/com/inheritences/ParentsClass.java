package com.inheritences;

public class ParentsClass extends GrandParentsPropertiies{ // Single Level
// ClassB= ParentsClass + extends classA =GrandParentsPropertiies
	protected void getQAJob() { 
		System.out.println("Shajib has corprote job");
	}

	protected void getNewCar() {
		System.out.println("Shajib has new car");
	}
		
	protected static void main(String[] args) {
	   /*ParentsPropertiies obj1 = new ParentsPropertiies();
		obj1.getVehicle();
		obj1.getBusiness();
		obj1.getHouse();
		*/
		
		// we have to create always child class object then i can get access both class properties
		// If i create parent class object then i have parent class property access 
		ParentsClass obj = new ParentsClass();		
		obj.getQAJob();	
		obj.getNewCar();
		
		obj.getHouse();
		obj.getVehicle();
		obj.getBusiness();
		
	}
}
