package com.treads;

class  Table1{
	void printTable(int n) {
		System.out.println("............");
		System.out.println("............");
		System.out.println("............");
		
		synchronized(this) {//synchronized block
		for(int i=0;i<5;i++) {
			System.out.println(n*i);
		}
		}
		
	System.out.println("..................");
	System.out.println("..................");
	System.out.println("..................");
	}
}
class My extends Thread{
	Table1 t;
	public My (Table1 table) {
		this.t=table;
	}
	
	public void run() {
	t.printTable(MAX_PRIORITY);
	}
}
public class Synchronization2 {
public static void main(String[] args) {
	Table1 t = new Table1();
	My  mt1 = new My (t);
	mt1.start();
	My  mt2 = new My (t);
	mt2.start();
	My  mt3 = new My (t);
	mt3.start();
}
}

