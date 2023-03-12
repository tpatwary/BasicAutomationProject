package com.colelctionsFramework;

import java.util.Arrays;

public class NonPremetativeDatatype {

	public static void main(String[] args) {

		// What is an array?
		// Ans: Array is an non primitive data type as well as its object.
		// It handles multiple values within single units
		// We can declare arrays two way
		// Single dimension & multi dimension
		// array length is fix (disadvantage)
		// Array is faster & Non Synchronize( At a time we can run multiple times)
		// What happens if array value incremented?
		// Ans: Index outside value exceptions

		// How to
		int[] num1 = new int[4];

		num1[0] = 30;
		num1[1] = 35;
		num1[2] = 60;
		num1[3] = 90;
		num1[4] = 70; // <<<---- Index outside value exceptions
		for (int i = 0; i < num1.length; i++) {
			System.out.println(num1[i]);
		}
		// How to handle dynamic elements?
		// Ans: In order to handle to dynamic elements we need help from list interface.
		// ( List interface can handle dynamic elements)

		// primitive Data type cant handle more than one value
//		int a = 10;
//		a = 20;
//		a = 30;
//		a = 40;
//	System.out.println(a);
//		int b= 20;
//		int c= 60;

		// how to declare an array?
		// Non primitive data type & as well as object ex: Array []call dimension
		// [] = single dimension array
		// How many types of array = 2 types of array [single dimension array & multi
		// dimension array ]
		int numbers[] = { 10, 3, 67, 88, 44, 34, 55, 23, 67, 1 };
		// System.out.println(Arrays.toString(numbers));
		
		// Basic loop or for loop
		for (int i = 0; i < numbers.length; i++) {
			// System.out.println(numbers[i]);
		}

		// Advance loop

		for (int num : numbers) {
//			System.out.println(num);
		}
// How to increment the value 
		// Ans: By i++ ex: 1,2,3,4,5,6.................
		// How to decrement the value
		// Ans: i-- ex: 100,99,98....................
		for (int i = 0; i < 10; i++) {
//			System.out.println("increment the value "+i);
		}

		for (int i = 10; i >= 0; i--) {
			// System.out.println("Decrement the value " + i);
		}

		// How to reverse string "Infosys" Interview questions

		// How to declare multi dimension array

		String name[][] = { { "Mohana", "Shomik", "Shajib", "Norain" }, { "Fhamida", "Montasir" },
				{ "Lopa", "Farjana", "Khatun", "Jauwad", "Towhidul" } };

//		System.out.println(numbers[4]);
//		System.out.println(name[1][1]);

//		System.out.println(Arrays.toString(numbers));
//		System.out.println(Arrays.toString(name[0]));
//		System.out.println("------------------");
		/*
		 * what is the loop? Ans: Loop is the one of the java option for increment,
		 * decrement, counting, continue,and breaking those kind of operation by help of
		 * looping concept.
		 ** 
		 * How many types of loop in the java? Ans: There is many types of loops 1.Basic
		 * loop (webElement) 2.Advance loop or enhance loop (webElement) 3.While loop:
		 * Continues running (excel sheet), (dataBase handling) 4.Do-while loop
		 * //------------------------------------------------------
		 */
		// Example: Basic loop

		// There is three condition in basic loop
		// 1. int i = 0; initialization
		// 2. i<num ; condition
		// 3. i++; (Increment) looping continues

	}
}
