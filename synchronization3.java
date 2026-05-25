package com.treads;
class  Table3{
	 static synchronized void printTable(int n) {//synchronized static method
		for(int i=0;i<5;i++) {
			System.out.println(n*i);
		}
	}
}
class MyBlockThread extends Thread{
	Table3 t;
	public MyBlockThread(Table3 table) {
		this.t=table;
	}
	
	public void run() {
	t.printTable(MAX_PRIORITY);
	}
}
public class synchronization3 {
public static void main(String[] args) {
	Table3 t = new Table3();
	MyBlockThread  mt1 = new MyBlockThread (t);
	mt1.start();
	MyBlockThread  mt2 = new MyBlockThread (t);
	mt2.start();
	MyBlockThread  mt3 = new MyBlockThread(t);
	mt3.start();
}
}
