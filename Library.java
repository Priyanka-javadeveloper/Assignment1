package com.staticusages.java;
//example for nested class
public class Library {
static class Book{
	void info() {
		System.out.println("This is library book");
	}
}
public static void main(String[] args) {
	Library.Book l = new Library.Book();//classname.nested classname
	l.info();
}
}//.......clear
