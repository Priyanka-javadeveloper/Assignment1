package com.collections.java;

import java.util.*;

public class HashSetDemo {
public static void main(String[] args) {
	Set<Integer> hs = new HashSet();
	hs.add(10);
//	hs.add(10.10);
//	hs.add("tops");
//	hs.add(true);
//	hs.add("t");
	hs.add(null);
	hs.add(30);
	hs.add(50);//sets duplicates nahi lethe
	hs.add(10);
	hs.add(10);
	System.out.println(hs);
	
//	Iterator itr = hs.iterator();
//	System.out.println("-----Iterator HasSet-----");
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//	} 
//	//convert hashset into arraylist
//	System.out.println("-------ListIterator hashset------");
//	ArrayList alst = new ArrayList(hs);
//	alst.add(hs);
//	
//	ListIterator litr =alst.listIterator();
//	while(litr.hasNext()) {
//	Object obj = litr.next();
//	System.out.println(obj+"tops");
//	}
//}
//}
////duplicates are not allowed ,maintain sequence order
 for(Integer i:hs) {
   System.out.println(i);	 
 }
 
	ArrayList a =new ArrayList(hs);
	a.add(hs);

	ListIterator litr =a.listIterator();
	while(litr.hasNext()) {
	Object obj = litr.next();
	System.out.println(obj+"techno");
	}
	
}
 }



