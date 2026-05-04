package com.core.java;

import java.util.Scanner;

public class Even {
public static void main(String[] args) {
	int a;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a:");
	a= sc.nextInt();
	if(a%2==0) {
		System.out.println("Number is Even");
		}
	else {
		System.out.println("Number is Odd");
	}
	sc.close();
}
}
