package com.interfaceexamples.java;
interface Drawable{
	void draw();
	static int cube(int x) {
		int cube = x*x*x;
		return cube;
	}
}
class Rectangle implements Drawable{
	public void draw() {
		System.out.println("rectangle drawing");
	}
}
 class Circle implements Drawable{
  public void draw() {
	System.out.println("circle drawing");
	
 }

public static void main(String[] args) {
	Rectangle  r = new Rectangle();
	r.draw();
	
	Circle c = new Circle();
	c.draw();
	
	System.out.print(Drawable.cube(3));
	
}

	

}
