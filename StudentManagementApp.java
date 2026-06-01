package com.studentproject;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementApp {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Student> list = new ArrayList<>();
	Admin admin = new Admin("EntireSkill");
	admin.showMenu();
	int choice ;
	do {
		System.out.print("Enter your choice:");
		choice = sc.nextInt();
		sc.nextLine();
		switch(choice) {
	case 1:
		System.out.print("Add Student:");
		System.out.print("Enter student name:");
		 String name=sc.nextLine();
		 
		 System.out.print("Enter Student id:");
		 int id=sc.nextInt();
		 
		 System.out.print("Enter student marks:");
		 int marks=sc.nextInt();
		 
		 list.add(new Student(name,id,marks));
		 System.out.println("Student added succesfully!!!");
		break;
		
	case 2:
		if(list.isEmpty()) {
			System.out.println("no student found");
		}else {
		 for(Student s:list) {
			System.out.println(s.display());
		}
		}
		break;
		
	case 3:
		
	Boolean found = false;
	    System.out.print("....Enter students ID to update........");
		int searchId=sc.nextInt();
		
		for(Student s:list) {
			if(searchId==s.getId()) {			
			System.out.println("Enter new Marks:");
			int newMarks=sc.nextInt();
			s.setMarks(newMarks);
			System.out.println("Marks updated");
			found =true;
			break;
		}
		}
		if(!found) {
			System.out.println("Student not found");
		}
		
		break;
		
	case 4:
		System.out.println("Exit sucesfully!!");
		break;
		default:
			System.out.print("Invalid entry:");
			System.exit(0);
			break;
		}
	}while(choice!=4);
}
}

