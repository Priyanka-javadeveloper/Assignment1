package com.treads;
class  Table{
	synchronized void printTable(int n) {//synchronized method
		for(int i=0;i<5;i++) {
			System.out.println(n*i);
		}
	}
}
class MyThreadForTableThread extends Thread{
	Table t;
	public MyThreadForTableThread(Table table) {
		this.t=table;
	}
	
	public void run() {
	t.printTable(MAX_PRIORITY);
	}
}
public class Synchronization {
public static void main(String[] args) {
	Table t = new Table();
	MyThreadForTableThread  mt1 = new MyThreadForTableThread (t);
	mt1.start();
	MyThreadForTableThread  mt2 = new MyThreadForTableThread (t);
	mt2.start();
	MyThreadForTableThread  mt3 = new MyThreadForTableThread (t);
	mt3.start();
}
}
