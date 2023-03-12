package com.polymorepyshms;

public class ConstructorTest {

	public ConstructorTest() {

	}

	public ConstructorTest(int age, String name) {
		System.out.println(age+ name);
	}

	
	
	public static void main(String[] args) {
		ConstructorTest obj = new ConstructorTest(10," Alam");
	}
}
