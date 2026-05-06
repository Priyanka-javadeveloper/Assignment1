package com.finalusages.java;
//Static final variable 
public class FinalExample {
	
static  final int data;

static
{
	data=10;
}
public static void main(String[] args) {
FinalExample fe = new FinalExample();
System.out.println(FinalExample.data);
}
}
//A sattic blank final variable is a static final variable that initialized that time of declaration
//It can be initialized only in static block.
