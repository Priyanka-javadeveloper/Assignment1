package com.exceptionexercise.java;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsDemo {
	
public static  void demo() throws ArithmeticException,IndexOutOfBoundsException,InputMismatchException
	{
	int x;

Scanner sc = new Scanner(System.in);

System.out.print("Enter x:");
x=sc.nextInt();
if(x>0) {
	System.out.println("Square of"+x+"Is"+(x*x));
	
}else {
	throw new ArithmeticException();
}
}
public static void main(String[] args) {
	try {
	demo();
	
}catch(Exception e){
	System.out.println("enter only positive numbers");
	
	
}	finally {
	System.out.println("finally block called");
}
}
}