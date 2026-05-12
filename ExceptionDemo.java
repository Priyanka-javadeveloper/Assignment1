package com.exceptionexercise.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
public static void main(String[] args) {
	System.out.println("Start code");

	int a,b,c;
Scanner sc = new Scanner(System.in);
try {
	System.out.println("Enter A:");
	a=sc.nextInt();
	System.out.println("Enter B:");
	b=sc.nextInt();
	c=a/b;
	System.out.println("Division:"+c);
	int arr[] = {45,67,89,32};
	System.out.println("Enter index number:");
	int index=sc.nextInt();
	System.out.println("Data At:"+index+"Is:"+arr[index]);
	
}catch(ArithmeticException e) {
	System.out.println("Exception caught:"+e);
}catch(InputMismatchException e) {
	System.out.println("Exception caught:"+e);
}catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Exception caught:"+e);
}
System.out.println("end code");
}
}