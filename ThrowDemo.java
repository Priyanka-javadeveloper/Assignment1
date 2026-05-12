package com.exceptionexercise.java;

import java.util.Scanner;

public class ThrowDemo {
	public static void demo() {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x:");
		x=sc.nextInt();
	try {
		if(x>0) {
			System.out.println("Square of"+" " +x+" "+ "Is"+" " + (x*x));
		}else { 
			throw new Exception();//throw is always in method body
		}
	}catch(Exception e) {
		System.out.println("please enter positive value only");
		demo();
	}
	}

public static void main(String[] args) {
	
	demo();
}
}