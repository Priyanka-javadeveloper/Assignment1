package com.staticusages.java;

import java.util.Scanner;

public class StaticVariable {
 static int x;
void getA()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter X:");
	x= sc.nextInt();
}
void putA() {
	System.out.println(x);
}

public static void main(String[] args) {
	StaticVariable s1 = new StaticVariable() ;
    StaticVariable s2 = new  StaticVariable();
	StaticVariable s3 = new StaticVariable();
		
	s1.getA();
	s2.getA();
	s3.getA();
	
	s1.putA();s2.putA();
	s3.putA();//if we do static for a variable it gives last updated variable to all objects
	//r else it shares 3 different numbers
	}
}

