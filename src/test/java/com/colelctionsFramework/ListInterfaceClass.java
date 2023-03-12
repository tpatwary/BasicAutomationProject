package com.colelctionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class ListInterfaceClass {

	public static void main(String[] args) {
		// How to declare ArrayList
		// (Arraylist is a class which is implemented from List interface )
		// Arraylist handle only wrapper class
		ArrayList list = new ArrayList();
		list.add(100);
		list.add("Rafiqul");

		ArrayList<String> list1 = new ArrayList<String>();
		// list1.add(101);
		list1.add("AVdsgkjsg");

		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("Alam Bhai", "Muntasir", "Shajib"));
		System.out.println(list2);
		
		// How to declare linkedList
		
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		
		// How to declare Vector
		Vector<Integer> vector = new Vector<Integer>();
	}
	
	

}
