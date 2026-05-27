package com.collections.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
public static void main(String[] args) {
	Map hm = new HashMap();
	hm.put(101,"Priyanka");
	hm.put(102,"Mahi");
	hm.put(103,"Tejal");
	hm.put(104,"Valkesh");
	//hm.put(104,"jigar");
	System.out.println(hm);
	Set set = hm.entrySet();//view of set
	Iterator itr = set.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	
//	Set s=hm.entrySet();
//	for(Object b: s) {//anotherway of iteration
//		System.out.println(b);
//	}
}
}
}