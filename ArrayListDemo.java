package com.collections.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import javax.xml.transform.stax.StAXSource;

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList al= new ArrayList();
	al.add(10);
	al.add(10.10);
	al.add("tops");
	al.add("t");
	al.add(null);
	al.add(true);
	al.add(10.10);
//	System.out.println(al);
//	System.out.println(al.get(3));
//	System.out.println(al.indexOf("tops"));
//	System.out.println(al.isEmpty());
//	System.out.println(al.lastIndexOf(10.10));
	
	Iterator itr = al.iterator();
	System.out.println("-----Iterator ArrayList-----");
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	ListIterator litr =al.listIterator();
	while(litr.hasNext()) {
		litr.set(litr.next()+"tops");
	}
    System.out.println("-----Listiterator----forward  direction");
    litr= al.listIterator();
    while(litr.hasNext()){
	System.out.println(litr.next());
    }
    System.out.println("-----Listiterator----reverse  direction");
    while(litr.hasPrevious()){
	System.out.println(litr.previous());
}
}
}