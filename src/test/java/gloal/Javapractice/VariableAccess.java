package gloal.Javapractice;


public class VariableAccess {
//Static variable can use anywhere in project
//any package any class any method
//no restriction about the static and non-static method
	
	static int myNumber = 300;
	
//Instance variable it is acceable within the class 
//any method but not in another class
//make sure instance variable it doesn't work with the static method

	int number_2 = 200;
	
	public  void main(String[] args) {
//if we declare the variable inside the method that means
//it is not accessible in other method, class, pacakge
//it means this function done within the method.
//Only method
		int number3 = 100;
		System.out.println(myNumber);
	}
	
	
	public void main() {
		System.out.println(myNumber);
	}
	
	public static void mains() {
		System.out.println(myNumber);
	}
	

}






