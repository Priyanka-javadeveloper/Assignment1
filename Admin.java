package com.studentproject;

public class Admin extends User{

	public Admin(String name) {
		super(name);
		
	}
 void showMenu() {
	 System.out.println("Welcome admin"+name);
	 System.out.println("1.Add student");
	 System.out.println("2.view student list");
	 System.out.println("3.updateStudent marks");
	 System.out.println("4.Exit");
 }
 }
