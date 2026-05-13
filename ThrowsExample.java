package com.exceptionexercise.java;

public class ThrowsExample {
static void checkAge(int age) throws ArithmeticException{
	
	if(age<18) {
		throw new ArithmeticException ("not eligible");
	}
	else {
		System.out.println("eligible");
	}
}
public static void main(String[] args) {
	try {
     checkAge(98); 
	}catch(Exception e) {
		System.out.println("exception caught");
}
}
}
