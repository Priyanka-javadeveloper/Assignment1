package com.staticusages.java;

public class StaticMethods {
 static int a=10;
 static int b;
 
static void Math(int x) {
	System.out.println("X:" +x);
	System.out.println("A:"+a);
	System.out.println("B:"+b);
	
}
public static void main(String[] args) {
	Math(12);
}
}
