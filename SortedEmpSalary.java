package com.collections.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedEmpSalary  implements Comparator<Emp>{

	@Override
	public  int compare(Emp e1, Emp e2) {
		
	int value = 0 ;
		if(e1.getSalary()>e2.getSalary()) {
			value=-1;
		}else if(e1.getSalary()<e2.getSalary()) {
			value=1;
	    }else if(e1.getSalary()==e2.getSalary()) {
		   value=0;
	    }
		return value;
	}
	
	
	public static void main(String[] args) {
		List <Emp> l = new ArrayList<>();
		Emp e1 = new Emp();
		e1.setEid(101);
		e1.setEname("mahi");
		e1.setSalary(2000);
		
		Emp e2 = new Emp();
		e2.setEid(102);
		e2.setEname("hima");
		e2.setSalary(2500);
		
		Emp e3 = new Emp();
		e3.setEid(103);
		e3.setEname("lisa");
		e3.setSalary(3000);
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		Collections.sort(l, new SortedEmpSalary());
		for(Emp e :l) {
			System.out.println("EID:"+e.getEid()+"name:"+e.getEname()+"Salary:"+e.getSalary());
		}
	}
}



