package com.core.java;

import java.util.Scanner;

public class max {
public static void main(String[] args) {
	int a,b;
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter a:");
	a=sc.nextInt();
	System.out.print("Enter b:");
	b=sc.nextInt();
	  
	if(a>b) {
		System.out.println("A is  maximum value");
		}
	else {
		System.out.println("A is minimum value");
	}
	sc.close();
}
}
