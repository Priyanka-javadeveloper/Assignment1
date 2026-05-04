package com.constructorchaining.java;

public class Box {
	
int height;
int width;
int depth;


Box(){
	System.out.println("default constructor");
	height=1;
	width=5;
	depth=3;
}
Box (int h,int w,int d){
	System.out.println("parameterised constructor");
	height=h;
	width=w;
	depth=d;
}
public Box(Box obj) {
	System.out.println("this is copy constructor");
	height=obj.height;
	width=obj.width;
	depth=obj.depth;
}
	
void display() {
	System.out.println(height+width+depth);
}

public static void main(String[] args) {
	Box b = new Box();//default constructor
	b.display();
	
	Box b2  = new Box(5,5,5);
	 b2.display();
	
	Box b1 = new Box(b);//copy constructor
	b1.display();
}
}