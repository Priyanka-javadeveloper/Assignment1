package com.staticusages.java;

public class StaticBlock {
	static int a =10;
	static int b;
	
static	{//static block prints 1st
		System.out.println("Block1");
		b=a*4;
	}
StaticBlock(){//constructor prints 3rd
	System.out.println("default constructor");
}
	
	static void Math(int x) {
		System.out.println("X:"+x);
		System.out.println("A:"+a);
		System.out.println("B:"+b);
	}
	{//non-static block  prints 2nd
		System.out.println("Block2");
		
		}
		
	public static void main(String[] args) {
		StaticBlock sb = new StaticBlock();
		Math(12);
	}
}
