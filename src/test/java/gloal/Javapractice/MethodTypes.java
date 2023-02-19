package gloal.Javapractice;

public class MethodTypes {

	// void method or non-return method
	public void name() {
	}

	// AQA
	// return method or Non-Void Method + no parameterize method
	public String names() {
		return " QA Automtaion";
	}

	// parameterize method + void method
	public static void employeesInfo(String name, int salary) {
		System.out.println("Employee Name : " + name + "Employee Salary " + salary);
	}

	// parameterize method + return method
	public int sal() {
		int num = 100;
		System.out.println(num);
		return num;
	}

	public static void main(String[] args) {
		MethodTypes obj = new MethodTypes();
		obj.employeesInfo("Tom ", 8000);
		obj.employeesInfo("Karim ", 9000);
		obj.employeesInfo("Rahim ", 8000);
		obj.sal();

	}
}
